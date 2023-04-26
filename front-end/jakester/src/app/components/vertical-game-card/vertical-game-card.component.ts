import { Component, Input, OnInit } from '@angular/core';
import { Game } from '../services/game-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-vertical-game-card',
  templateUrl: './vertical-game-card.component.html',
  styleUrls: ['./vertical-game-card.component.scss']
})
export class VerticalGameCardComponent implements OnInit {

  @Input() game!:Game;

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  goToSearch(id:number):void{
    this.router.navigate(['games/search',id]);
  }

}
