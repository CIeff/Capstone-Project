import { Component, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Cart, CartServiceService } from 'src/app/components/services/cart-service.service';
import { UserServiceService } from 'src/app/components/services/user-service.service';
import { NavbarComponent } from 'src/app/components/navbar/navbar.component';
import { SearchServiceService } from 'src/app/components/services/search-service.service';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.scss']
})
export class LogInComponent implements OnInit,OnDestroy {

  user:any;
  userId:number=-1;
  userData:any;

  @ViewChild('navbarComponent') navbarComponent : NavbarComponent | undefined;

  constructor( private authSrv:AuthServiceService, private router:Router, private http: HttpClient,private cartSrv:CartServiceService, private userSrv:UserServiceService ) { }

  ngOnDestroy(): void {
    location.reload();
  }

  ngOnInit(): void {
    this.authSrv.logOut();
  }


  loginForm(f:NgForm){
    console.log(f.value)
      this.authSrv.logIn(f.value).subscribe(()=>{
      this.loginUser(f.value).subscribe(()=>{
        this.user=JSON.parse(localStorage.getItem('user') || '{}');

    this.userSrv.getUser(this.user.username).subscribe((data)=>{
      console.log(data);
      this.userData=data;
      this.userId=this.userData.id;
      console.log(this.userId);
      this.userData.profile_pic="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Windows_10_Default_Profile_Picture.svg/2048px-Windows_10_Default_Profile_Picture.svg.png";
      let cart:Cart={
        id:this.userData.id,
        quantity:0,
        total_price_cart:0,
        total_price_history:0,
        total_price_saved:0,
        total_quantity_cart:0,
        user_id:this.userId
      }

      let username=this.userData.username;

      this.cartSrv.saveCart(cart.id,username).subscribe((data)=>{
        console.log(cart);
      })

      console.log(this.userData);

    });

        this.navbarComponent?.refreshCart();

        this.router.navigate(['/games'])
      })
    })
  }

  loginUser(formData:any){
    const url = 'http://localhost:8080/api/auth/login';
    const body = {
      username:formData.username,
      password: formData.password
    };
    console.log(body);
    //localStorage.clear();

    return this.http.post(url, body);
  }

}
