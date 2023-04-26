
import { AfterViewInit, Component, ElementRef, EventEmitter, HostListener, Input, OnDestroy, OnInit, Output, SimpleChanges, ViewChild } from '@angular/core';
import { Game, GameServiceService } from '../services/game-service.service';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { OnChanges } from '@angular/core';
import { UserServiceService } from '../services/user-service.service';
import { SearchServiceService } from '../services/search-service.service';


@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit, AfterViewInit{

  term: string= "";
  options!: string[];
  filteredOptions: string[]=[];
  showOptions: boolean = false;
  user: any;
  userData: any;
  showFilters: boolean = false;
  sortAscending = true;


  games: Game[] = [];
  gamesFiltered: Game[] = [];

  filters = {
    genre: "",
    platform: "",
    releaseYear: null,
    price: null
  };

  constructor(private searchSrv:SearchServiceService, private http:HttpClient, private gameSrv:GameServiceService, private router:Router, private route:ActivatedRoute, private elementRef: ElementRef, private userSrv:UserServiceService) {}

  ngOnInit(): void {
    this.gameSrv.getGames().subscribe((games:Game[])=>{
      this.games=games;
      this.options=games.map((game:Game)=>game.title);
      if(this.term!=undefined&&this.term.length>0&&this.term!=null&&this.term!=""){
        this.filteredOptions=this.options.filter((option:string)=>option.toLowerCase().includes(this.term.toLowerCase()));
        this.showOptions=true;
      }
      console.log(this.options);
    });

    this.route.queryParams.subscribe((params: { [x: string]: string; }) => {
      this.term = params['query'];
      console.log(this.term);
      console.log(params['query']);
    });

    this.user=JSON.parse(localStorage.getItem('user')!);
    console.log(this.user);

    this.userSrv.getUser(this.user?.username).subscribe((data)=>{
      this.userData=data;
      console.log(this.userData);
    });

    this.searchSrv.currentFilters.subscribe((filters: any) => {
      if(filters.genre==undefined){
        filters = {
          genre: "",
          platform: "",
          releaseYear: null,
          price: null
        };
      }else{
        this.filters = filters;
        this.showFilters = true;
      };
      });

  }

  @Output() searchTitle:EventEmitter<string>= new EventEmitter<string>();

  search(){
    //this.searchTitle.emit(this.term);
    this.router.navigate(['/search'], { queryParams: { query: this.term } });
  }

  onInput(){
    this.filteredOptions=this.options.filter((option:string)=>option.toLowerCase().includes(this.term.toLowerCase()));
    if (this.term.length === 0) {
      this.showOptions = false; // nascondi la lista dei suggerimenti
    } else {
      this.showOptions = true; // mostra la lista dei suggerimenti
    }
  }

  onSelect(option:string){
    this.term=option;
    this.filteredOptions=[];
    this.search();
  }

  @HostListener('document:click', ['$event'])
  onClick(event: Event) {
    !this.elementRef.nativeElement.contains(event.target)||this.term==undefined?this.filteredOptions = []:(this.elementRef.nativeElement.contains(event.target))?
    this.filteredOptions=this.options.filter((option:string)=>option.trim().toLowerCase().includes(this.term.toLowerCase())):
    this.term.length === 0? this.showOptions = false:
    this.showOptions = true;
  }

  ngAfterViewInit():void {
    this.focusOnSearchBar();

  }

  onClear(){
    this.term="";
    this.filteredOptions=[];
    this.search();
    this.showOptions=false;
    this.filters = {
      genre: "",
      platform: "",
      releaseYear: null,
      price: null
    };
    this.searchSrv.updateFilters(this.filters);
    this.showFilters = false;

  }

  focusOnSearchBar(){
    this.elementRef.nativeElement.querySelector(".search-input").focus();
  }

  onFilterChange() {
    this.searchSrv.updateFilters(this.filters);
  }

  sortByTitle() {
    this.searchSrv.sortByTitle(this.sortAscending);
  }

  sortByReleaseDate() {
    this.searchSrv.sortByReleaseDate(this.sortAscending);
  }



}
