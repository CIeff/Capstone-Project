import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AuthModuleModule } from './auth/auth-module/auth-module.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

import { CloudinaryModule } from '@cloudinary/ng';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GamesComponent } from './components/games/games.component';
import { GameCardComponent } from './components/game-card/game-card.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SearchComponent } from './components/search/search.component';
import { GamePageComponent } from './components/game-page/game-page.component';
import { SearchPageComponent } from './components/search-page/search-page.component';
import { VerticalGameCardComponent } from './components/vertical-game-card/vertical-game-card.component';
import { GenresComponent } from './components/genres/genres.component';
import { FooterComponent } from './components/footer/footer.component';
import { UrlSanitizerPipe } from './components/pipes/url-sanitizer.pipe';
import { AutoplayPipe } from './components/pipes/autoplay.pipe';
import { CarouselImgsComponent } from './components/carousel-imgs/carousel-imgs.component';
import { ReviewPopupComponent } from './components/review-popup/review-popup.component';
import { ImgsShowOffComponent } from './components/imgs-show-off/imgs-show-off.component';
import { CartComponent } from './components/cart/cart.component';
import { ProfileComponent } from './components/profile/profile.component';
import { MostLikedCarouselComponent } from './components/most-liked-carousel/most-liked-carousel.component';
import { ReviewComponent } from './components/review/review.component';


@NgModule({
  declarations: [
    AppComponent,
    GamesComponent,
    GameCardComponent,
    NavbarComponent,
    SearchComponent,
    GamePageComponent,
    SearchPageComponent,
    VerticalGameCardComponent,
    GenresComponent,
    FooterComponent,
    UrlSanitizerPipe,
    AutoplayPipe,
    CarouselImgsComponent,
    ReviewPopupComponent,
    ImgsShowOffComponent,
    CartComponent,
    ProfileComponent,
    MostLikedCarouselComponent,
    ReviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AuthModuleModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    CloudinaryModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
