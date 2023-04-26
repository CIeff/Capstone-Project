import { Component, OnInit, ViewChild } from '@angular/core';
import { Game, GameServiceService } from '../services/game-service.service';
import { ActivatedRoute } from '@angular/router';
import { Review, ReviewServiceService } from '../services/review-service.service';
import { UserServiceService } from '../services/user-service.service';
import { CartServiceService } from '../services/cart-service.service';
import { Observable, map, pluck } from 'rxjs';

@Component({
  selector: 'app-game-page',
  templateUrl: './game-page.component.html',
  styleUrls: ['./game-page.component.scss']
})
export class GamePageComponent implements OnInit {

  constructor(private gameSrv:GameServiceService, private activatedRouted:ActivatedRoute, private route:ActivatedRoute, private rewiewSrv:ReviewServiceService, private userSrv:UserServiceService,private cartSrv:CartServiceService) { }


  gamePosted=window.location.href.split("/").pop();
  gameIdNumber=Number(this.gamePosted);

  game!:Game;
  user:any;

  voto:number=0;
  body:string="";

  userData:any;
  userCart:any;

  reviews:Review[]=[];

  game2:Game|null=null;

  favGames:Game[]=[];

  popUp:boolean=false;

  updateReview:Review | null = null;

  isLoggedIn:boolean=false;

  reviewDone:boolean=false;

  userReview!:Review;


  ngOnInit(): void {

    this.gameSrv.getGameById(this.gameIdNumber).subscribe((data)=>{
      this.game=data;
      console.log(this.game);
    });

    const savedPosition = sessionStorage.getItem('savedPosition');
    if (savedPosition) {
      window.onload = () => {
        window.scrollTo(0,parseInt(savedPosition, 10));
        sessionStorage.removeItem('savedPosition');
      }
    }

    window.addEventListener('beforeunload', () => {
      sessionStorage.setItem('savedPosition', window.scrollY.toString());
    });

    this.user=JSON.parse(localStorage.getItem('user') || '{}');

    this.userSrv.getUser(this.user?.username).subscribe((data)=>{
        console.log(data);
        this.userData=data;
        if(this.userData){
          this.isLoggedIn=true;
          this.getReviews();
        }else{
          this.isLoggedIn=false;
        }
        if(this.userData!=undefined){
        this.cartSrv.getCartFromUserId(this.userData.id).subscribe((data)=>{
          this.userCart=data;
          console.log(this.userCart);

          this.cartSrv.getFavorites(this.userCart).subscribe((data: any)=>{
            console.log(data);
            this.favGames=data;
            console.log(this.favGames);
          });
        });
        }
      });

      this.getReviews();

      this.gameSrv.getGameById(1).subscribe((data)=>{
       this.game2=data;
      });
  }


  getReviews(){
    this.rewiewSrv.getReviews().subscribe((data)=>{
     this.reviews=data.filter((review:Review)=>review?.game.id==this.gameIdNumber);
      this.checkReviews();
      this.getUserReview();
    });
  }

  getUserReview(){
    this.reviews.forEach((review:Review)=>{
      if(review.user.id==this.userData.id){
        this.userReview=review;
        console.log(this.userReview)
      }
    });
  }

  checkReviews(){
    this.reviews?.forEach((review:Review)=>{
      if(review?.user.id==this.userData?.id){
        this.reviewDone=true;
      }
    });
  }

  refreshReviews(){
    this.getReviews();
  }


  sendReview(){
    setTimeout(() => {
      this.popUp=true;
    },0);
    this.updateReview=null;
  }



  addReview(review: Review){
    this.rewiewSrv.saveReview(review,this.userData.id,this.gameIdNumber).subscribe(() => {
      this.getReviews();
    });
  }



  addToFavorites(idCart:number, idGame:number){
    this.cartSrv.addToFav(idCart,idGame).subscribe((data: any)=>{
      console.log(data);
      this.cartSrv.getFavorites(this.userCart).subscribe((data: any)=>{
        console.log(data);
        this.favGames=data;
        console.log(this.favGames);
      });
    });
  }

  isGameinFav(game:Game){
    return this.favGames.some((obj)=>obj.id==game.id);
  }

  addToCart(idCart:number, idGame:number){
    this.cartSrv.addToCart(idCart,idGame).subscribe((data: any)=>{

    });
  }

  goToCart(idCart:number, idGame:number){
    this.addToCart(idCart,idGame);
    window.location.href="/cart";
  }

  goToLogin(){
    window.location.href="/login";
  }

  deleted(){
    this.getReviews();
    this.reviewDone=false;
    this.updateReview=null;
  }

  popUpChange(){
    this.popUp=true;
  }

  updateReview2(review:Review){
    this.updateReview=review;
  }

  modifyReview(review:Review){
    setTimeout(() => {
      this.popUp=true;
    },0);
    console.log(this.userReview);
    this.updateReview=this.userReview;
  }




}
