import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError } from 'rxjs';

export interface Game {

  id: number;
  title: string;
  title_page: string;
  poster_path: string;
  background_img: string;
  title_img: string;
  video_path: string;
  full_price: string;
  discount_price: string;
  percentage_discount: string;
  rating: number;
  rating_count: number;
  description: string;
  release_date: Date;
  developer: string;
  publisher: string;
  genres: string[];
  video_trailer: string;
  screenshots: string[];
  about_the_game: string;
  system_requirements:string[];
  showVideo:boolean;
  platform:string;
  onStock:boolean;
  quantity:number;
  format:string;
  vertical_poster:string;

}


@Injectable({
  providedIn: 'root'
})


export class GameServiceService {

  constructor(private http:HttpClient) { }

  getGames(){
    return this.http.get<Game[]>('http://localhost:8080/api/games/all').pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

  getGameById(id:number){
    return this.http.get<Game>('http://localhost:8080/api/games/'+id).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

  getGenres(){
    return this.http.get<string[]>('http://localhost:8080/api/games/genres').pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

}
