import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SearchServiceService {

  private filterSource = new BehaviorSubject<any>("");
  currentFilters = this.filterSource.asObservable();

  sortMethod = new BehaviorSubject<{method:string, toggle:boolean}>({method:'', toggle:true});



  constructor() { }

  updateFilters(filters: any) {
    console.log(filters);
    this.filterSource.next(filters);
  }

  sortByTitle(toggle:boolean) {
    this.sortMethod.next({method:'title', toggle:toggle });
  }

  sortByReleaseDate(toggle:boolean) {
    this.sortMethod.next({method:'releaseDate', toggle:toggle});
  }

  updateGenreLink(genre:string) {
    console.log(genre);
    this.filterSource.next({ genre: genre, platform: "", releaseYear: null, price: null });
  }


}
