import { NgModule } from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'

import { AppRoutingModule } from './app-routing.module'
import { AppComponent } from './app.component'
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
import { ToolbarComponent } from './Components/toolbar/toolbar.component'
import { LayoutModule } from '@angular/cdk/layout'
import { MatToolbarModule } from '@angular/material/toolbar'
import { MatButtonModule } from '@angular/material/button'
import { MatSidenavModule } from '@angular/material/sidenav'
import { MatIconModule } from '@angular/material/icon'
import { MatListModule } from '@angular/material/list'
import { LoginComponent } from './Components/login/login.component'
import { RegisterComponent } from './Components/register/register.component'
import { NgMaterialModule } from './Modules/ng-material/ng-material.module'
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { HomeComponent } from './Components/home/home.component'
import { HttpClientModule } from '@angular/common/http'
import { SearchAqiComponent } from './Components/search-aqi/search-aqi.component'
import { WatchListComponent } from './Components/watch-list/watch-list.component'

@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    SearchAqiComponent,
    WatchListComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    NgMaterialModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
