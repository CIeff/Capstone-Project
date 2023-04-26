import { AfterViewInit, Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';
import { Game, GameServiceService } from '../services/game-service.service';

@Component({
  selector: 'app-most-liked-carousel',
  templateUrl: './most-liked-carousel.component.html',
  styleUrls: ['./most-liked-carousel.component.scss']
})
export class MostLikedCarouselComponent implements OnInit,AfterViewInit {



games!:Game[];

@ViewChild('hero') hero!: ElementRef;
@ViewChild('menu') menu!: ElementRef;
@ViewChild('slides') slides!: ElementRef;
@ViewChild('next') next!: ElementRef;
@ViewChild('prev') prev!: ElementRef;

slideChildren!: HTMLCollectionOf<HTMLElement>;
slideCount!: number;
currentlyDemoing = false;
currentPage = 0;

constructor(private gameSrv:GameServiceService) { }

  ngAfterViewInit(): void {
    this.slideChildren = this.slides.nativeElement.children;
    this.slideCount = this.slides.nativeElement.children.length;
    this.goToPage();

    this.demo();
  }

ngOnInit(): void {
  this.gameSrv.getGames().subscribe((data)=>{
    this.games=data;
    console.log(data);
    this.games=this.games.sort((a,b)=>b.rating-a.rating);
    this.games=this.games.filter((game)=>game.id!=20);
    this.games=this.games.slice(0,24);
  })

}

slidesPerPage() {
  return window.innerWidth > 1700 ? 4 : window.innerWidth > 1200 ? 3 : 2;
}

maxPageCount() {
  return 5;
  //return this.slideCount / this.slidesPerPage() - 1;
}

goToPage(pageNumber = 0) {
  this.currentPage = Math.min(this.maxPageCount(), Math.max(0, pageNumber));
  this.hero.nativeElement.style.setProperty('--page', this.currentPage);
}

sleep(time: any) {
  return new Promise(res => setTimeout(res, time));
}

hoverSlide(index: any) {
  index in this.slideChildren &&
    this.slideChildren[index].classList.add('hover');
}

unhoverSlide(index: any) {
  index in this.slideChildren &&
    this.slideChildren[index].classList.remove('hover');
}

async demo() {
if(this.currentlyDemoing) {
  return;
}
this.currentlyDemoing = true;
if(this.currentPage !== 0) {
  this.goToPage(0);
  await this.sleep(800);
}
let slides: number = this.slidesPerPage();
let pageSeq_: { [key: number]: number[] } = {2: [1,2,1],3: [1,2,1/3],4: [1,1,0]};
let pageSeq = pageSeq_[slides] || pageSeq_[4];
let slideSeq_: { [key: number]: number[] } = {2: [2,4,3],3: [3,6,2],4: [3,6,2]};
let slideSeq = slideSeq_[slides] || slideSeq_[2];
await this.sleep(3000);
this.goToPage(pageSeq[0]);
await this.sleep(500);
this.hoverSlide(slideSeq[0]);
await this.sleep(1200);
this.goToPage(pageSeq[1]);
this.unhoverSlide(slideSeq[0]);
await this.sleep(500);
this.hoverSlide(slideSeq[1]);
await this.sleep(1200);
this.goToPage(pageSeq[2]);
this.unhoverSlide(slideSeq[1]);
await this.sleep(300);
this.hoverSlide(slideSeq[2]);
await this.sleep(1600);
this.goToPage(0);
this.unhoverSlide(slideSeq[2]);
this.currentlyDemoing = false;
}





}
