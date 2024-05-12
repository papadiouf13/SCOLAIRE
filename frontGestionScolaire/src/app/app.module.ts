import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SidebarComponent } from './pages/menu/sidebar/sidebar.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { PlanificationComponent } from './pages/planification/planification.component';
import { SeanceComponent } from './pages/seance/seance.component';

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    PlanificationComponent,
    SeanceComponent,
    NotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
