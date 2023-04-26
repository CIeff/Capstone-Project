import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LogInComponent } from './auth/log-in/log-in.component';
import { GamesComponent } from './components/games/games.component';
import { AuthGuardGuard } from './auth/auth-guard.guard';
import { GamePageComponent } from './components/game-page/game-page.component';
import { SearchPageComponent } from './components/search-page/search-page.component';
import { SignUpComponent } from './auth/sign-up/sign-up.component';
import { CartComponent } from './components/cart/cart.component';
import { ProfileComponent } from './components/profile/profile.component';

const routes: Routes = [
  {
    path:'',
    component:GamesComponent,
  },
  {
    path:"login",
    component:LogInComponent
  },
  {
    path:"singup",
    component:SignUpComponent
  },
  {
    path:'games',
    component:GamesComponent
  },
  {
    path:'games/search/:id',
    component:GamePageComponent
  },
  {
    path:'search',
    component:SearchPageComponent
  },
  {
    path:'profile/:id',
    canActivate:[AuthGuardGuard],
    component:ProfileComponent
  },
  {
    path:"cart",
    canActivate:[AuthGuardGuard],
    component:CartComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
