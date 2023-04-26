import { Component, ElementRef, Host, HostListener, Input, OnInit, QueryList, ViewChild, ViewChildren } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Game, GameServiceService } from '../services/game-service.service';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';
import { UserServiceService } from '../services/user-service.service';
import { CartServiceService } from '../services/cart-service.service';

@Component({
  selector: 'app-games',
  templateUrl: './games.component.html',
  styleUrls: ['./games.component.scss']
})
export class GamesComponent implements OnInit {

  games:Game[]=[];
  sortedGames:Game[]=[];
  recentGames:Game[]=[];
  genres:string[]=[];
  isDesktop:boolean=false;
  isLoggedin:boolean=false;
  user:any;
  userData:any;
  cart:any;

  constructor(private cartSrv:CartServiceService, private http:HttpClient, private gameSrv:GameServiceService, private userSrv:UserServiceService) { }

  ngOnInit(): void {

    this.user=JSON.parse(localStorage.getItem('user') || '{}');

    this.userSrv.getUser(this.user.username).subscribe((data)=>{
      this.userData=data;
      console.log(this.userData);
      if(data){
        this.isLoggedin=true;
        this.cartSrv.getCartFromUserId(this.userData.id).subscribe((data:any)=>{
          this.cart=data;
          console.log(this.cart);
        });
      }else{
        this.isLoggedin=false;
      }
      console.log(this.isLoggedin);
    });



    this.gameSrv.getGames().subscribe((data)=>{
      this.games=data;
      console.log(this.games);
      });
    this.gameSrv.getGames().subscribe((data)=>{
      this.sortedGames=data.sort((a,b)=>b.rating-a.rating);
      });

    this.gameSrv.getGames().subscribe((data)=>{
      this.recentGames=data;
      this.recentGames.forEach((game)=>{
        game.release_date=new Date(game.release_date);
      });
      this.recentGames.sort((a,b)=>b.release_date.getTime()-a.release_date.getTime());
    });

    this.gameSrv.getGenres().subscribe((data)=>{
      this.genres=data;
    });

    if (window.innerWidth >= 1200) {
      this.isDesktop=true;
    }else{
      this.isDesktop=false;
    }

  }

 @HostListener('window:resize', ['$event'])
  onResize(event: { target: { innerWidth: number; }; }) {
    if (event.target.innerWidth >= 1200) {
      this.isDesktop=true;
    } else {
      this.isDesktop=false;
    }
  }

  scrollLeft(){
    let container= document.querySelector(".vertical-container") as HTMLElement;
    container.scrollTo({
      left: container.scrollLeft - 550,
      behavior: 'smooth'
    });
  }

  scrollRight(){
    let container= document.querySelector(".vertical-container") as HTMLElement;
    container.scrollTo({
      left: container.scrollLeft + 550,
      behavior: 'smooth'
    });
  }


  playVideo(event: MouseEvent) {
    const target = event.currentTarget as HTMLElement;
    const iframe = target.querySelector('iframe') as HTMLIFrameElement;
    try {
      iframe.contentWindow!.postMessage('{"event":"command","func":"playVideo","args":""}', '*');
    } catch (error) {
      console.error(error);
    }
  }

  pauseVideo(event: MouseEvent) {
    const target = event.currentTarget as HTMLElement;
    const iframe = target.querySelector('iframe') as HTMLIFrameElement;
    try {
      iframe.contentWindow!.postMessage('{"event":"command","func":"pauseVideo","args":""}', '*');
    } catch (error) {
      console.error(error);
    }
  }

  goToLogIn(){
    window.location.href="/login";
  }

  addToCart(idGame:number){
    this.cartSrv.addToCart(this.cart,idGame).subscribe((data)=>{
      console.log(data);
    });
  }

  goToCart(idGame:number){
    this.addToCart(idGame);
    window.location.href="/cart";
  }

}
