import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ApiUseService {
  private apiUrl = 'http://localhost:8080/retoSofka/api/v1/naves/';

  constructor(private http: HttpClient) {}

  getNaves() {
    return this.http.get<any>(this.apiUrl);
  }
  postNave(nave: any): Observable<any> {
    return this.http.post<any>(this.apiUrl + 'crear', nave);
  }
}
