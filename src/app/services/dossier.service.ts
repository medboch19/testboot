import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Observable } from 'rxjs';
import { Dossier } from '../model/Dossier';

@Injectable({
  providedIn: 'root'
})
export class DossierService {

  constructor(private http: HttpClient) { }
  
public getDossier(id: string): Observable<any> {
    return this.http.get("http://localhost:8088/dossier/" + id);
  }

  public getAllDossier(): Observable<any> {
    return this.http.get("http://localhost:8088/dossiers/" );
   
  }

  // POST REQUEST
  public saveDossier(body): Observable<any> {
    return this.http.post("http://localhost:8088/dossiers", body);
  }

 
  //delete req
  public deleteDossier(id: number): Observable<any> {
    return this.http.delete("http://localhost:8080/dossiers/" + id );
  }


}
