import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, catchError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http:HttpClient) { }

  getUser(username:string){
    return this.http.get(`http://localhost:8080/api/users/${username}`).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

  getUserById(id:number){
    return this.http.get(`http://localhost:8080/api/users/user/${id}`).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

  saveUser(user:any){
    return this.http.post(`http://localhost:8080/api/users/update/${user.id}`,user).pipe(catchError((error)=>{
      console.log(error);
      throw error;
    }))
  }

}
