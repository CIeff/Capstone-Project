import { Component, ElementRef, EventEmitter, Input, OnDestroy, OnInit, Output, ViewChild } from '@angular/core';
import { Review, ReviewServiceService } from '../services/review-service.service';
import { Game } from '../services/game-service.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-review-popup',
  templateUrl: './review-popup.component.html',
  styleUrls: ['./review-popup.component.scss']
})
export class ReviewPopupComponent implements OnInit,OnDestroy {

  @Input() game!:Game;
  @Input() user:any;
  @Input() updateReview:Review | null = null;

  @Output() closePopup = new EventEmitter();
  @Output() addReview = new EventEmitter<Review>();

  reviewForm!: FormGroup;


  constructor(private reviewSrv:ReviewServiceService, private elementRef:ElementRef) { }

  ngOnInit() {
    // Aggiunge un event listener per il click sulla pagina
    document.addEventListener('click', this.onClick.bind(this));
    console.log(this.user);
    console.log(this.game);

    if(this.updateReview){
      this.reviewForm = new FormGroup({
        title: new FormControl(this.updateReview.title, [Validators.required]),
        rating: new FormControl(this.updateReview.rating, [Validators.required, Validators.min(1), Validators.max(10)]),
        body: new FormControl(this.updateReview.body, [Validators.required, Validators.maxLength(150)])
      });
      if(this.updateReview.rating <5 && this.updateReview.rating >=0){
        document.querySelector('#rating')?.setAttribute('style', 'color:red; border-color:red');
      }else if(this.updateReview.rating >=5 && this.updateReview.rating <7){
        document.querySelector('#rating')?.setAttribute('style', 'color:orange; border-color:orange');
      }else if(this.updateReview.rating >=7 && this.updateReview.rating <=10){
        document.querySelector('#rating')?.setAttribute('style', 'color:yellowgreen; border-color:yellowgreen');
      }
    }else{
      this.reviewForm = new FormGroup({
        title: new FormControl('', [Validators.required]),
        rating: new FormControl(4, [Validators.required, Validators.min(1), Validators.max(10)]),
        body: new FormControl('', [Validators.required, Validators.maxLength(150)])
      });
    }

  }

  ngOnDestroy() {
    // Rimuove l'event listener quando il componente viene distrutto
    document.removeEventListener('click', this.onClick.bind(this));
  }

  onClick(event: MouseEvent | undefined) {
    if (event && !this.elementRef.nativeElement.contains(event.target)) {
      this.closePopup.emit();
      document.querySelector('.pop-up')?.classList.remove('.slide-in');
    }
  }


  submitReview(){
    if(this.updateReview==null){
    let review={
      id:0,
      game:this.game,
      user:this.user,
      title:this.reviewForm.value.title,
      body:this.reviewForm.value.body,
      rating:this.reviewForm.value.rating,
    }
    this.addReview.emit(review);
    this.closePopup.emit();
    }else{
      this.updateReview.rating=this.reviewForm.value.rating;
      this.updateReview.title=this.reviewForm.value.title;
      this.updateReview.body=this.reviewForm.value.body;

      this.addReview.emit(this.updateReview);
      this.closePopup.emit();
    }




  }

  onInput(event:any){
    const value = event.target.value;
    if(value <5 && value >=0){
      event.target.style.color="red";
      event.target.style.borderColor="red";
    }else if(value >=5 && value <7){
      event.target.style.color="orange";
      event.target.style.borderColor="orange";
    }else if(value >=7 && value <=10){
      event.target.style.color="yellowgreen";
      event.target.style.borderColor="yellowgreen";
    }
  }

}
