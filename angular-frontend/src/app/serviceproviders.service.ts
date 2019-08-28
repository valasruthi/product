import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ServiceProvider } from './ServiceProvider';

@Injectable({
  providedIn: 'root'
})
export class ServiceprovidersService {

  private _url : string= "assets/data/serviceprovider.json";
  constructor(private http:HttpClient) {
    // this.http=http;
   }

  getServiceProviders(): Observable<ServiceProvider[]> {
    return this.http.get<ServiceProvider[]>(this._url);
  }
}
