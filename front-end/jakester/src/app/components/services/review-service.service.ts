import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError } from 'rxjs';
import { Game } from './game-service.service';

export interface Review {
  id:number;
  game:Game;
  user:any;
  title:string;
  body:string;
  rating:number;
}

@Injectable({
  providedIn: 'root'
})
export class ReviewServiceService {

  constructor(private http:HttpClient) { }

  getReviews(){
    return this.http.get<Review[]>('http://localhost:8080/api/reviews/all').pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

  saveReview(review:Review, id:number){
    return this.http.post<Review>('http://localhost:8080/api/reviews/'+id+'/add', review).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

  deleteReview(id:number){
    return this.http.delete<Review>('http://localhost:8080/api/reviews/delete/'+id).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }




}
