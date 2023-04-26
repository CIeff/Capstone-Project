import { Component, OnInit } from '@angular/core';
import { Game, GameServiceService } from '../services/game-service.service';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';
import { SearchServiceService } from '../services/search-service.service';


@Component({
  selector: 'app-search-page',
  templateUrl: './search-page.component.html',
  styleUrls: ['./search-page.component.scss']
})
export class SearchPageComponent implements OnInit {

  searchTitle:string="";
  games:Game[]=[];
  originalGames:Game[]=[];
  filteredGames:Game[]=[];
  sortAscending = true;
  sortAscending2 = true;

  filters = {
    genre: "",
    platform: "",
    releaseYear: null,
    price: null
  };

  constructor(private searchSrv:SearchServiceService, private http:HttpClient, private gameSrv:GameServiceService, private route:ActivatedRoute) { }

  ngOnInit(): void {

    this.gameSrv.getGames().subscribe((data)=>{
      this.games=data;
      this.originalGames=[...this.games];
      this.filteredGames=data;
      console.log(this.filteredGames);
       this.searchSrv.currentFilters.subscribe((filters: any) => {
        if(filters.genre==undefined && filters.platform==undefined && filters.releaseYear==undefined && filters.price==undefined){
          filters = {
            genre: "",
            platform: "",
            releaseYear: null,
            price: null
          };
        }else{
          this.filters = filters;
          this.filterResults();
        };
      });
      });



    this.route.queryParams.subscribe((params: { [x: string]: string; }) => {
      this.searchTitle = params['query'];
    });


    this.searchSrv.sortMethod.subscribe(({ method, toggle }) => {
      if (method === 'title') {
        this.sortByTitle();
      } else if (method === 'releaseDate') {
        this.sortByReleaseDate();
      }
      if (toggle) {
        this.sortAscending = !this.sortAscending;
      }
    });


  }

  noResultsFound(): boolean {
    let result =false;
    if(this.games && this.searchTitle!="" && this.searchTitle!=undefined && this.searchTitle!=null && this.searchTitle.length>0){
      result=!this.games.some(game => game.title.toLowerCase().includes(this.searchTitle.toLowerCase()));
      return result;
    }
    return result;
  }

  filterResults() {
    this.filteredGames = this.games.filter((game: Game) => {
      let filter = true;
      if (this.filters.genre && this.filters.genre !== "") {
        filter = filter && game.genres.includes(this.filters.genre);
      }
      if (this.filters.platform && this.filters.platform !== "") {
        filter = filter && game.platform === this.filters.platform;
        console.log(this.filters.platform);
      }
      if (this.filters.releaseYear && this.filters.releaseYear !== null) {
        let releaseYear = new Date(this.filters.releaseYear, 0, 1).getFullYear();
        let gameReleaseYear = new Date(game.release_date).getFullYear();
        filter = filter && gameReleaseYear === releaseYear;
      }
      if (this.filters.price && this.filters.price !== null) {
        filter = filter && Number(game.discount_price.slice(0,-1)) <= this.filters.price;
      }
      return filter;
    });
    console.log(this.filteredGames);
  }

  sortByTitle() {
    this.filteredGames.sort((a, b) => {
      if (this.sortAscending) {
        return a.title.localeCompare(b.title);
      } else {
        return b.title.localeCompare(a.title);
      }
    });
    this.sortAscending = !this.sortAscending;
  }

  sortByReleaseDate() {
    this.filteredGames.sort((a, b) => {
      if (this.sortAscending2) {
        return new Date(a.release_date).getTime() - new Date(b.release_date).getTime();
      } else {
        return new Date(b.release_date).getTime() - new Date(a.release_date).getTime();
      }
    });
    this.sortAscending2 = !this.sortAscending2;
  }

  onFilterChange() {
    this.searchSrv.updateFilters(this.filters);
  }

  resetFilters(){
    this.filters={
      genre: "",
      platform: "",
      releaseYear: null,
      price: null
    };
    this.searchSrv.updateFilters(this.filters);
    this.games=this.originalGames;
  }

}
