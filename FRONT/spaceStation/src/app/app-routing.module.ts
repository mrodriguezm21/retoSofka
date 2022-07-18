import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFormComponent } from './components/add-form/add-form.component';
import { HomeComponent } from './components/home/home.component';
import { ListComponent } from './components/list/list.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'add', component: AddFormComponent},
  {path: 'list', component: ListComponent},
  {path: '**', redirectTo: ''},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
