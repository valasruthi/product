import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { IDomain } from './domain';
import { Observable } from 'rxjs';

 @Injectable()
 export class IdeaHamsterService{
     private _url:string='/assets/data/domains.json';
     
     constructor(private http : HttpClient){ 
        //  this.http=http;
     }

     getDomains():Observable<IDomain[]>{
         return this.http.get<IDomain[]>(this._url);
     }

 }