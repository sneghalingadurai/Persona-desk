import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { HomeDashboardComponent } from './components/home-dashboard/home-dashboard.component';

const routes: Routes = [
  {path : '', component : HomeComponent},
  {path: 'dashboard', component: HomeDashboardComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
