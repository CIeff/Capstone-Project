import { Component, Input, OnInit } from '@angular/core';
import { Game, GameServiceService } from '../services/game-service.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-game-card',
  templateUrl: './game-card.component.html',
  styleUrls: ['./game-card.component.scss']
})
export class GameCardComponent implements OnInit {

  @Input() game!:Game;

  @Input() widhtMax:boolean=false;

  constructor(private gameSrv:GameServiceService, private http:HttpClient, private router:Router) { }

  ngOnInit(): void {

    if(this.widhtMax){
      let titles = document.getElementsByClassName('title') as HTMLCollectionOf<HTMLElement>;
      for(let i=0; i<titles.length; i++){
        titles[i].style.width = '100px';
      }
    }

  }

  goToSearch(id:number):void{
    this.router.navigate(['games/search',id]);
  }



}
