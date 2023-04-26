import { Component,  OnInit } from '@angular/core';
import { Cart, CartServiceService } from '../services/cart-service.service';
import { UserServiceService } from '../services/user-service.service';
import { Game, GameServiceService } from '../services/game-service.service';
import { forkJoin } from 'rxjs';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  user:any;
  userData:any;
  cart:any;
  gamesCart:any;
  gamesFav:any;
  gamesBought:any;

  cartGames!:any;

  cartPrice!:number;
  discountCart!:number;
  subTotal!:number;

  //squares!: any[];
  //squares2!: any[];



  constructor(private cartSrv:CartServiceService, private userSrv:UserServiceService, private gameSrv:GameServiceService) { }


  ngOnInit(): void {
    this.user = JSON.parse(localStorage.getItem('user')!);
    console.log(this.user);

    this.userSrv.getUser(this.user.username).subscribe((data) => {
        this.userData = data;
        console.log(this.userData);

        this.cartSrv.getCartFromIdUser(this.userData.id).subscribe((data) => {
            this.cart = data;
            console.log(this.cart);

            forkJoin([
                this.cartSrv.getCartGames(this.cart.id),
                this.cartSrv.getAllGamesCart(this.cart.id),
                this.cartSrv.getFavorites(this.cart.id),
                this.cartSrv.getGamesBought(this.cart.id)
            ]).subscribe(([cartGames, gamesCart, gamesFav, gamesBought]) => {
                this.cartGames = cartGames;
                console.log(this.cartGames);
                this.gamesCart = gamesCart;
                this.gamesFav = gamesFav;
                this.gamesBought = gamesBought;
                console.log(this.gamesBought);

                // Esegui i metodi qui
                this.cartPriceCalc();
                this.cartDiscountCalc();
                this.subTotalCart();
            });
        });
    });
}

  cartPriceCalc(){
    this.cartPrice=0;
    if(this.gamesCart && this.gamesCart.length==0 || this.cartGames===undefined || this.cartGames==null){
        return this.cartPrice;
     }else{
      for(let game of this.gamesCart){
        for(let x of this.cartGames){
          if(game.id==x.game.id){
            this.cartPrice+=((game.full_price.slice(0,-1))*1)*x.quantity;
            this.cartPrice=this.cartPrice*100/100;
          }
        }
        console.log(this.cartPrice);
      }
      return this.cartPrice;
    }
  }

  cartDiscountCalc() {
    this.discountCart=0;
    if(this.gamesCart.length==0 || this.cartGames==undefined || this.cartGames==null){
      return this.discountCart;
    }else{
      for(let game of this.gamesCart){
        for(let x of this.cartGames){
          if(game.id==x.game.id){
           this.discountCart+=((game.full_price.slice(0,-1))*1)*x.quantity-((game.discount_price.slice(0,-1))*1)*x.quantity;
            this.discountCart=Math.round(this.discountCart*100/100);
          }
        }
        console.log(this.discountCart);
      }
      return this.discountCart;
    }
  }

  subTotalCart(){
    if(this.gamesCart.length==0 || this.cartGames==undefined || this.cartGames==null){
      return this.subTotal=0;
    }else{
      this.subTotal=this.cartPrice-this.discountCart;
      return this.subTotal;
    }
  }

  moveToWishlistFromCart(idGame:number){

      this.cartSrv.removeGameFromCart(this.cart.id,idGame).subscribe((data)=>{
        console.log(data);

        this.cartSrv.getAllGamesCart(this.cart.id).subscribe((data)=>{
          this.gamesCart=data;
          console.log(this.gamesCart);
          this.cartPriceCalc();
          this.cartDiscountCalc();
          this.subTotalCart();
        });

        this.addToFavorites(this.cart.id,idGame);

    });
  }

  addToFavorites(idCart:number, idGame:number){
    this.cartSrv.addToFav(idCart,idGame).subscribe((data: any)=>{
      console.log(data);
      this.cartSrv.getFavorites(this.cart.id).subscribe((data: any)=>{
        console.log(data);
        this.gamesFav=data;
        console.log(this.gamesFav);
      });
    });
  }

  addToCartFromWhishlist(idGame:number){
    this.addToFavorites(this.cart.id,idGame);
    this.cartSrv.addToCart(this.cart.id,idGame).subscribe((data: any)=>{
      console.log(data);
      this.cartSrv.getCartGames(this.cart.id).subscribe((data)=>{
        this.cartGames=data;
        console.log(this.cartGames);
        this.cartGames.forEach((game: any) => {
          if (game.id == idGame){
            game.quantity = 1;
            console.log(game);
            this.getGameQuantity(game.id);
            console.log(this.getGameQuantity(game.id));
          }
        });
      })
      this.cartSrv.getAllGamesCart(this.cart.id).subscribe((data)=>{
        this.gamesCart=data;
        console.log(this.gamesCart);
        this.cartPriceCalc();
        this.cartDiscountCalc();
        this.subTotalCart();
      });
    });


  }

  removeFromCart(idGame:number){
    this.cartSrv.removeGameFromCart(this.cart.id,idGame).subscribe((data)=>{
      console.log(data);

      this.cartSrv.getAllGamesCart(this.cart.id).subscribe((data)=>{
        this.gamesCart=data;
        console.log(this.gamesCart);
        this.cartPriceCalc();
        this.cartDiscountCalc();
        this.subTotalCart();
      });
    });
  }

  reduceNumber(idGame:number){
    this.cartSrv.reduceNumber(this.cart.id,idGame).subscribe((data)=>{
      console.log(data);
      this.cartSrv.getAllGamesCart(this.cart.id).subscribe((data)=>{
        this.gamesCart=data;
        console.log(this.gamesCart);
        this.cartPriceCalc();
        this.cartDiscountCalc();
        this.subTotalCart();
      });
    });
    this.cartSrv.getCartFromIdUser(this.userData.id).subscribe((data)=>{
      this.cart=data;
      console.log(this.cart);
      this.cartSrv.getCartGames(this.cart.id).subscribe((data)=>{
        this.cartGames=data;
        console.log(this.cartGames);
      })
    });
  }

  addToCart(idGame:number){
    this.cartSrv.addToCart(this.cart.id,idGame).subscribe((data: any)=>{
      console.log(data);
      this.cartSrv.getAllGamesCart(this.cart.id).subscribe((data)=>{
        this.gamesCart=data;
        console.log(this.gamesCart);
        this.cartPriceCalc();
        this.cartDiscountCalc();
        this.subTotalCart();
      });
    });
    this.cartSrv.getCartFromIdUser(this.userData.id).subscribe((data)=>{
      this.cart=data;
      console.log(this.cart);
      this.cartSrv.getCartGames(this.cart.id).subscribe((data)=>{
        this.cartGames=data;
        console.log(this.cartGames);
      })
    });

  }

  getGameQuantity(idGame: number) {
    let x = 0;
    this.cartGames.forEach((element: any) => {
      if (element.game.id == idGame) {
        x = element.quantity;
      }
    });
    return x;
  }

}
