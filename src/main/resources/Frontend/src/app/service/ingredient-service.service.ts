import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Ingredient } from '../model/ingredient';
import { Observable } from 'rxjs';

@Injectable()
export class IngredientService {

  private ingredientsUrl: string;

  constructor(private http: HttpClient) {
    this.ingredientsUrl = 'http://localhost:8080/ingredients';
  }

  public findAll(): Observable<Ingredient[]> {
    return this.http.get<Ingredient[]>(this.ingredientsUrl);
  }

  public save(user: Ingredient) {
    return this.http.post<Ingredient>(this.ingredientsUrl, user);
  }
}
