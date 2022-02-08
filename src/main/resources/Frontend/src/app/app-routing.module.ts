import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IngredientListComponent } from './ingredient-list/ingredient-list.component';
import { IngredientFormComponent } from './ingredient-form/ingredient-form.component';

const routes: Routes = [
  { path: 'ingredients', component: IngredientListComponent },
  { path: 'addIngredient', component: IngredientFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
