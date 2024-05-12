import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PlanificationComponent } from './pages/planification/planification.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { SeanceComponent } from './pages/seance/seance.component';

const routes: Routes = [
  {path: 'planification', component:PlanificationComponent},
  {path: 'seance' , component: SeanceComponent},
  {path: '', redirectTo: 'planification', pathMatch: 'full'},
  {path: '**', component: NotFoundComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
