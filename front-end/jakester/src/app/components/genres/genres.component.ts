import { Component, Input, OnInit } from '@angular/core';
import { Game, GameServiceService } from '../services/game-service.service';
import { SearchServiceService } from '../services/search-service.service';

@Component({
  selector: 'app-genres',
  templateUrl: './genres.component.html',
  styleUrls: ['./genres.component.scss']
})
export class GenresComponent implements OnInit {


  constructor(private gameSrv:GameServiceService, private searchSrv:SearchServiceService) { }

  @Input() genre!:string;
  game:Game|undefined;
  gameImg:string='';

  ngOnInit(): void {
    this.randomGame();
  }

  randomGame(){
    this.gameSrv.getGames().subscribe((data)=>{
      const filteredGames = data.filter((game) => game.genres.includes(this.genre));
      const randomIndex = Math.floor(Math.random() * filteredGames.length);
      this.game = filteredGames[randomIndex];
      if(this.game && this.game.background_img){
        this.gameImg = this.game.background_img;
      }else{
        this.randomGame();
      }
    });
  }

  goToGenre(){
    this.searchSrv.updateGenreLink(this.genre);
  }

}
