import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IngredientService } from '../service/ingredient-service.service';
import { Ingredient } from '../model/ingredient';

@Component({
  selector: 'app-ingredient-form',
  templateUrl: './ingredient-form.component.html',
  styleUrls: ['./ingredient-form.component.css']
})
export class IngredientFormComponent {

  ingredient: Ingredient;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private ingredientService: IngredientService) {
    this.ingredient = new Ingredient();
  }

  onSubmit() {
    this.ingredientService.save(this.ingredient).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/ingredients']);
  }

}
