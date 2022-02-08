import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { IngredientListComponent } from './ingredient-list/ingredient-list.component';
import { IngredientFormComponent } from './ingredient-form/ingredient-form.component';
import { IngredientService } from "./service/ingredient-service.service";
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    IngredientListComponent,
    IngredientFormComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        HttpClientModule
    ],
  providers: [IngredientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
