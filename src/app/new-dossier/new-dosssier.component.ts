import { Component, OnInit } from '@angular/core';
import { Dossier } from '../model/Dossier';
import { DossierService } from '../services/dossier.service';

@Component({
  selector: 'app-new-dossier',
  templateUrl: './new-dossier.component.html',
  styleUrls: ['./new-dossier.component.css']
})
export class NewDossierComponent implements OnInit {

  constructor(private dossierService:DossierService) { }

  ngOnInit() {
  }
  dossier: Dossier= new Dossier;

  savedossier(){
    this.dossierService.saveDossier(this.dossier)
      .subscribe( data=>{
      console.log(data)
    }, error=> {
      console.log(error)
    })
        //console.log(this.contact);
      }
}
