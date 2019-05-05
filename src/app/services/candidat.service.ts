import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Observable } from 'rxjs';
import { Candidat } from '../model/Candidat';

@Injectable({
  providedIn: 'root'
})
export class CandidatService {

  constructor(private http: HttpClient) { }



  // SEARCH USING GET
  // public searchCondidat(searchword: string): Observable<any> {
  //   return this.http.get("http://localhost:8080/chercherContact?mc=" + searchword);
  // }

  public getCandidat(id: string): Observable<any> {
    return this.http.get("http://localhost:8088/candidats/" + id);
  }

  public getAllCandidat(): Observable<any> {
    return this.http.get("http://localhost:8088/candidats/" );
   
  }

  // POST REQUEST
  public saveCandidat(body): Observable<any> {
    return this.http.post("http://localhost:8088/candidats", body);
  }

  //Update
  public updateCandidat(candidat: Candidat): Observable<any> {

    return this.http.put("http://localhost:8080/candidats/" + candidat.cin , candidat);
  }

  //delete req
  public deleteCandidat(id: number): Observable<any> {
    return this.http.delete("http://localhost:8080/candidats/" + id );
  }



}
