import { NgModule } from '@angular/core'
import { RouterModule, Routes } from '@angular/router'
import { HomeComponent } from './Components/home/home.component'
import { LoginComponent } from './Components/login/login.component'
import { RegisterComponent } from './Components/register/register.component'
import { SearchAqiComponent } from './Components/search-aqi/search-aqi.component'
import { WatchListComponent } from './Components/watch-list/watch-list.component'
import { AuthGuard } from './Guard/auth.guard'

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'accounts/login', component: LoginComponent },
  { path: 'history', component: WatchListComponent },
  { path: 'search', canActivate: [AuthGuard], component: SearchAqiComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' },
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
