import { AfterViewInit, Component, ElementRef, EventEmitter, HostListener, OnDestroy, OnInit, Output, ViewChild } from '@angular/core';
import { AuthServiceService } from 'src/app/auth/auth-service.service';
import { SearchComponent } from '../search/search.component';
import { UserServiceService } from '../services/user-service.service';
import { CartServiceService } from '../services/cart-service.service';
import { Subscription } from 'rxjs';
import { SearchServiceService } from '../services/search-service.service';
import { Game, GameServiceService } from '../services/game-service.service';
import { NavigationEnd, Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit, OnDestroy {

  isLoggedIn:boolean=false;
  searchText:string="";
  isSmallScreen: boolean = false;

  show:boolean=true;

  user:any;
  userData:any;

  tot:number=0;

  gamesCart:any=null;

  @Output() searchTitle= new EventEmitter<string>();
  @ViewChild(SearchComponent) searchComponent!: SearchComponent;

  private cartSub!: Subscription;
  //private refreshSub!: Subscription;

  constructor(private gameSrv:GameServiceService, private searchSrv:SearchServiceService, private authSrv:AuthServiceService, private elementRef: ElementRef, private userSrv:UserServiceService, private cartSrv:CartServiceService, private router:Router) {
    const mediaQuery = window.matchMedia('(max-width: 1200px)');
    this.isSmallScreen = mediaQuery.matches;
    mediaQuery.addListener((mq) => {
      this.isSmallScreen = mq.matches;
    });
   }

  ngOnDestroy(): void {
    this.cartSub.unsubscribe();

  }

  ngOnInit(): void {

    this.router.events.subscribe(event=>{
      if(event instanceof NavigationEnd){
        this.updateUserData();
      }
    })


    //this.refreshSub = this.searchSrv.myObservable$.subscribe((value:any) => {
    //  if(value=='refresh'){
    //  }
    //});

  }

  onLogOut(){
    this.authSrv.logOut();
    this.isLoggedIn=false;
  }

  onSearchTextEntered(searchValue:string){
    this.searchText=searchValue;
    //console.log(this.searchText);
    this.sendData();
  }

  sendData(){
    this.searchTitle.emit(this.searchText);
    //console.log(this.searchTitle);
  }

  dropdownOpen = false;
  isSticky = false;

  toggleDropdown() {
    this.dropdownOpen = !this.dropdownOpen;
  }

  @HostListener('window:scroll', ['$event'])
  onWindowScroll() {
    this.isSticky = window.pageYOffset > 100;
  }

  @HostListener('document:click', ['$event'])
  onClick(event: Event) {
    if (!this.elementRef.nativeElement.contains(event.target)) {
      this.dropdownOpen = false;
    }
  }

  toggleSearchBar(){
    if(this.isSmallScreen){
    let icon=document.querySelector('.search-icon') as HTMLElement;
    icon.style.display="none";

    let searchBar=document.querySelector('.search-off') as HTMLElement;
    searchBar.classList.add('search-on');
    searchBar.classList.remove('search-off');

    let logo=document.querySelector('.logo') as HTMLElement;
    logo.style.display="none";

    let profPic=document.querySelector('.prof-pic') as HTMLElement;
    profPic.style.display="none";

    let closeSearch=document.querySelector('.close-search') as HTMLElement;
    closeSearch.style.display="block";

    let cart=document.querySelector('.cart') as HTMLElement;
    cart.style.display="none";

    this.searchComponent.focusOnSearchBar();
    }else{
      let icon=document.querySelector('.search-icon') as HTMLElement;
      icon.style.display="none";

      let searchBar=document.querySelector('.search-off') as HTMLElement;
      searchBar?.classList.add('search-on-xl');
      searchBar?.classList.remove('search-off');

      let closeSearch=document.querySelector('.close-search') as HTMLElement;
      closeSearch.style.display="block";

      let cart=document.querySelector('.cart') as HTMLElement;
      cart?cart.style.display="inline":null;

      this.searchComponent.focusOnSearchBar();
    }
  }

  closeSearchBar(){
    if(this.isSmallScreen){
    let icon=document.querySelector('.search-icon') as HTMLElement;
    icon.style.display="block";
    icon.classList.add('search-icon2');

    let searchBar=document.querySelector('.search-on') as HTMLElement;
    searchBar.classList.add('search-off');
    searchBar.classList.remove('search-on');

    let logo=document.querySelector('.logo') as HTMLElement;
    logo.style.display="block";

    let profPic=document.querySelector('.prof-pic') as HTMLElement;
    profPic.style.display="inline";

    let closeSearch=document.querySelector('.close-search') as HTMLElement;
    closeSearch.style.display="none";

    let cart=document.querySelector('.cart') as HTMLElement;
    cart.style.display="inline";

  }else{
    let icon=document.querySelector('.search-icon') as HTMLElement;
    icon.style.display="inherit";
    icon.classList.add('search-icon-xl');

    let searchBar=document.querySelector('.search-on-xl') as HTMLElement;
    searchBar.classList.add('search-off');
    searchBar.classList.remove('search-on-xl');

    let closeSearch=document.querySelector('.close-search') as HTMLElement;
    closeSearch.style.display="none";

  }
  this.searchComponent.term="";
  this.searchComponent.filteredOptions=[];
  this.searchComponent.showOptions=false;
  this.searchComponent.filters={
    genre: "",
    platform: "",
    releaseYear: null,
    price: null
  };
  this.searchSrv.updateFilters(this.searchComponent.filters);
  this.searchComponent.showFilters=false;
  }

  refreshCart(){
    this.userSrv.getUser(this.user.username).subscribe((data)=>{
      this.userData=data;
      console.log(this.userData);
      this.cartSrv.getCartGames(this.userData.cart.id).subscribe((data)=>{
        console.log(data);
        this.gamesCart=data;
        console.log(this.gamesCart);
        this.tot=0;
        this.gamesCart.forEach((game:any) => {
          console.log(game.quantity);
          this.tot+=game.quantity;
        });
      });
    });
  }

  updateUserData(){
    this.authSrv.areYouLoggedIn$.subscribe((isLoggedIn)=>{
      this.isLoggedIn=isLoggedIn;
    })

    localStorage.getItem('user') ? this.user = JSON.parse(localStorage.getItem('user')!) : this.user = null;
    console.log(this.user);

    if(this.user){
      this.userSrv.getUser(this.user?.username).subscribe((data)=>{
        this.userData=data;
        console.log(this.userData);
        this.cartSrv.getCartGames(this.userData?.cart?.id).subscribe((data)=>{
          console.log(data);
          this.gamesCart=data;
          this.refreshCart();
          console.log(this.gamesCart);
          this.tot=0;
          this.gamesCart.forEach((game:any) => {
            this.tot+=game.quantity;
          });
        });
      });
    }


    this.cartSub = this.cartSrv.getCartUpdatedListener().subscribe(() => {
      this.refreshCart();
    });

    this.searchSrv.currentFilters.subscribe((filters: any) => {
      if(filters.genre!=undefined && filters.genre!=""){
        this.toggleSearchBar();
      }else{
       return;
      };
    });
  }

  navigateToProfile(): void {
    this.router.navigateByUrl('/', { skipLocationChange: true }).then(() => {
      this.router.navigate(['../profile', this.userData?.id]);
    });
  }



}
