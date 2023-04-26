import { Component, Input, OnInit } from '@angular/core';
import { Game, GameServiceService } from '../services/game-service.service';
import { Router } from '@angular/router';
import { CartServiceService } from '../services/cart-service.service';

@Component({
  selector: 'app-imgs-show-off',
  templateUrl: './imgs-show-off.component.html',
  styleUrls: ['./imgs-show-off.component.scss']
})
export class ImgsShowOffComponent implements OnInit {

  @Input()cart!:any;

  games!: Game[] ;

  isP1 = false;
  isP2 = false;
  isP3 = false;
  isP4 = false;


  constructor(private router:Router,private  gameSrv:GameServiceService, private cartSrv:CartServiceService) { }

  ngOnInit(): void {

    this.gameSrv.getGames().subscribe((games:Game[])=>{
      this.games=games;
      this.games.forEach((game:Game)=>{
        game.release_date=new Date(game.release_date);
      });
      this.games.sort((a,b)=>b.release_date.getTime()-a.release_date.getTime());
      console.log(this.games);
    });

  setTimeout(() => {

  const pane1 = document.querySelector('.pane1') as HTMLElement;
  const pane2 = document.querySelector('.pane2') as HTMLElement;
  const pane3 = document.querySelector('.pane3') as HTMLElement;
  const pane1Bg = document.querySelector('.pane1 .pane-bg') as HTMLElement;
  const pane2Bg = document.querySelector('.pane2 .pane-bg') as HTMLElement;
  const pane3Bg = document.querySelector('.pane3 .pane-bg') as HTMLElement;
  const pane_info1 = document.querySelector('.pane-info1') as HTMLElement;
  const pane_info2 = document.querySelector('.pane-info2') as HTMLElement;
  const pane_info3 = document.querySelector('.pane-info3') as HTMLElement;



  pane1?.addEventListener('click', event => {
    const paneBgs = document.querySelectorAll('.pane-bg') as NodeListOf<HTMLElement>;
    paneBgs.forEach(el => {
      el.style.animationPlayState = 'paused';
    });

  pane1.style.setProperty('--pane1offset', '-60%');
  pane2.style.setProperty('--pane2offset', '30%');
  pane3.style.setProperty('--pane3offset', '50%');
  pane1Bg.style.setProperty('--wigglesize', '2vmin');
  pane2Bg.style.setProperty('--wigglesize', '0vmin');
  pane3Bg.style.setProperty('--wigglesize', '0vmin');
  pane1Bg.style.setProperty('--wigglezoom', '1.2');
  pane2Bg.style.setProperty('transform', getComputedStyle(pane2Bg).transform);
  pane3Bg.style.setProperty('transform', getComputedStyle(pane3Bg).transform);

  pane1Bg.style.animationPlayState = 'running';

  this.isP1 = true;
  this.isP2 = false;
  this.isP3 = false;
  this.isP4 = false;

  pane_info1.classList.remove("not-visible");
  pane_info1.classList.add("visible");
  pane_info2.classList.remove("visible");
  pane_info2.classList.add("not-visible");
  pane_info3.classList.remove("visible");
  pane_info3.classList.add("not-visible");
});

pane2?.addEventListener('click', event => {
  const paneBgs = document.querySelectorAll('.pane-bg') as NodeListOf<HTMLElement>;
    paneBgs.forEach(el => {
      el.style.animationPlayState = 'paused';
    });

  pane1.style.setProperty('--pane1offset', '-60%');
  pane2.style.setProperty('--pane2offset', '-40%');
  pane3.style.setProperty('--pane3offset', '50%');
  pane1Bg.style.setProperty('--wigglesize', '0vmin');
  pane2Bg.style.setProperty('--wigglesize', '2vmin');
  pane3Bg.style.setProperty('--wigglesize', '0vmin');
  pane1Bg.style.setProperty('transform', getComputedStyle(pane1Bg).transform);
  pane2Bg.style.setProperty('--wigglezoom', '1.2');
  pane3Bg.style.setProperty('transform', getComputedStyle(pane3Bg).transform);

  pane2Bg.style.animationPlayState = 'running';

  this.isP1 = false;
  this.isP2 = true;
  this.isP3 = false;
  this.isP4 = false;

  pane_info1.classList.remove("visible");
  pane_info1.classList.add("not-visible");
  pane_info2.classList.remove("not-visible");
  pane_info2.classList.add("visible");
  pane_info3.classList.remove("visible");
  pane_info3.classList.add("not-visible");
});

pane3?.addEventListener('click', event => {
  const paneBgs = document.querySelectorAll('.pane-bg') as NodeListOf<HTMLElement>;
    paneBgs.forEach(el => {
      el.style.animationPlayState = 'paused';
    });

  pane1.style.setProperty('--pane1offset', '-60%');
  pane2.style.setProperty('--pane2offset', '-40%');
  pane3.style.setProperty('--pane3offset', '-30%');
  pane1Bg.style.setProperty('--wigglesize', '0vmin');
  pane2Bg.style.setProperty('--wigglesize', '0vmin');
  pane3Bg.style.setProperty('--wigglesize', '2vmin');
  pane1Bg.style.setProperty('transform', getComputedStyle(pane1Bg).transform);
  pane2Bg.style.setProperty('transform', getComputedStyle(pane2Bg).transform);
  pane3Bg.style.setProperty('--wigglezoom', '1.2');

  pane3Bg.style.animationPlayState = 'running';

  this.isP1 = false;
  this.isP2 = false;
  this.isP3 = true;
  this.isP4 = false;

  pane_info1.classList.remove("visible");
  pane_info1.classList.add("not-visible");
  pane_info2.classList.remove("visible");
  pane_info2.classList.add("not-visible");
  pane_info3.classList.remove("not-visible");
  pane_info3.classList.add("visible");
});


pane1.click();
  },1500);

}

onImageClick(game:Game){
  this.router.navigate(['/games/search/', game.id]);

}

addToCart(idGame:number){
  this.cartSrv.addToCart(this.cart,idGame).subscribe((data)=>{
    console.log(data);
  });
}

goToCart(idGame:number){
  this.addToCart(idGame);
  window.location.href="/cart";
}


}


