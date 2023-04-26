import { Component, EventEmitter, Input, OnInit, Output, ViewChild } from '@angular/core';
import { Review, ReviewServiceService } from '../services/review-service.service';
import { UserServiceService } from '../services/user-service.service';
import { GamePageComponent } from '../game-page/game-page.component';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.scss']
})
export class ReviewComponent implements OnInit {

  @Input() review!: Review;
  @Input()userData:any;
  @Input()gameIdNumber!:number;

  @Output() popUpChange=new EventEmitter<boolean>();
  @Output() deleted=new EventEmitter<void>();
  @Output() updateReview2=new EventEmitter<Review>();


  reviews:Review[]=[];

  reviewUser:any;

  constructor(private reviewSrv:ReviewServiceService, private userSrv:UserServiceService) { }

  ngOnInit(): void {
    this.userSrv.getUserById(this.review.user.id).subscribe((data)=>{
      this.reviewUser=data;
    });

    console.log(this.review);

  }

  deleteReview(id:number){
    this.reviewSrv.deleteReview(id).subscribe((data)=>{
      console.log(data);
      this.deleted.emit();
    });

  }
  modifyReview(review:Review){
    setTimeout(() => {
      this.popUpChange.emit(true);
    },0);
    this.updateReview2.emit(review);
  }



}
