import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Game } from './game-service.service';
import { Subject, catchError, tap } from 'rxjs';

export interface CartItem{
  game:Game;
  quantity:number;
}

export interface Cart{
  id:number;
  quantity:number;
  total_price_cart:number;
  total_price_history:number;
  total_price_saved:number;
  total_quantity_cart:number;
  user_id:number;
}

@Injectable({
  providedIn: 'root'
})
export class CartServiceService {

  private cartUpdated = new Subject<void>();

  gamesInCart:{game:Game, quantity:number}[]= [];

  constructor(private http:HttpClient) { }

  saveCart(idCart:number, username:string){
    let params= new HttpParams()
    .set('idCart',idCart)
    .set('username',username);
    return this.http.post('http://localhost:8080/api/cart/saveCart',params).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

  addToFav(idCart:number, gameId:number){
    let params=new HttpParams()
    .set('idCart',idCart)
    .set('idGame',gameId);
     return this.http.post('http://localhost:8080/api/cart/favorites/add/'+idCart+"/"+gameId,params).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));
  }

  getFavorites(idCart:number){
    return this.http.get('http://localhost:8080/api/cart/favorites/'+idCart).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));
  }

  getCartFromUserId(id:number){
    return this.http.get('http://localhost:8080/api/cart/'+id).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));
  }

  getCartFromIdUser(id:number){
    return this.http.get('http://localhost:8080/api/cart/find/'+id).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));
  }
 /*
  addToCart(cartId:number,idGame:number){
    let params=new HttpParams()
    .set('idCart',cartId)
    .set('idGame',idGame);
   return this.http.post('http://localhost:8080/api/cart/add/'+cartId+"/"+idGame,params).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));

  }
*/

    addToCart(cartId:number,idGame:number){
    let params=new HttpParams()
    .set('idCart',cartId)
    .set('idGame',idGame);
   return this.http.post('http://localhost:8080/api/cart/add/'+cartId+"/"+idGame,params).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }),tap(()=>{
      this.cartUpdated.next();
    }));

  }

  getAllGamesCart(idCart:number){
    return this.http.get('http://localhost:8080/api/cart/'+idCart+'/all').pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));
  }

  addGameToBoughtList(idCart:number, idGame:number){
    let params=new HttpParams()
    .set('idCart',idCart)
    .set('idGame',idGame);
    return this.http.post('http://localhost:8080/api/cart/'+idCart+'/bought/add/'+idGame,params).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));
  }

  getGamesBought(idCart:number){
    return this.http.get('http://localhost:8080/api/cart/'+idCart+'/bought').pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));
  }

  removeGameFromCart(idCart:number, idGame:number){
    let params=new HttpParams()
    .set('idCart',idCart)
    .set('idGame',idGame);
    return this.http.post('http://localhost:8080/api/cart/delete/'+idCart+"/"+idGame,params).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }),tap(()=>{
      this.cartUpdated.next();
    }));
  }

  reduceNumber(idCart:number, idGame:number){
    let params=new HttpParams()
    .set('idCart',idCart)
    .set('idGame',idGame);
    return this.http.post('http://localhost:8080/api/cart/reduce/'+idCart+"/"+idGame,params).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }),tap(()=>{
      this.cartUpdated.next();
    }));
  }

  getCartUpdatedListener() {
   return this.cartUpdated.asObservable();
  }

  getCartGames(idCart:number){
    return this.http.get('http://localhost:8080/api/cartgames/'+idCart).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }));
  }




}
