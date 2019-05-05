import { Component, OnInit } from '@angular/core';
import { Candidat } from '../model/Candidat';
import { CandidatService } from '../services/candidat.service';

@Component({
  selector: 'app-new-candidat',
  templateUrl: './new-candidat.component.html',
  styleUrls: ['./new-candidat.component.css']
})
export class NewCandidatComponent implements OnInit {

  constructor(private candidatService:CandidatService) { }

  ngOnInit() {
  }
  candidat: Candidat= new Candidat;

  saveCondidat(){
    this.candidatService.saveCandidat(this.candidat)
      .subscribe( data=>{
      console.log(data)
    }, error=> {
      console.log(error)
    })
        //console.log(this.contact);
      }
}
