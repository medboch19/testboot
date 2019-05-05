import { Component, OnInit } from '@angular/core';
import {Candidat} from '../model/Candidat';
import {ActivatedRoute, Router} from '@angular/router';
import {CandidatService} from '../services/candidat.service';
import {error} from 'selenium-webdriver';

@Component({
  selector: 'app-edit-candidat',
  templateUrl: './edit-candidat.component.html',
  styleUrls: ['./edit-candidat.component.css'],
})
export class EditCandidatComponent implements OnInit {
candidat:Candidat=new Candidat();
idCandidat : string;
  constructor(public  activatedRoute:ActivatedRoute, public candidatSevices:CandidatService, public router:Router) {
    // console.log("..........");
    // console.log(activatedRoute.snapshot.params['id']);
    // console.log("..........");
    this.idCandidat = activatedRoute.snapshot.params['id'];
  }

  ngOnInit() {
    this.candidatSevices.getCandidat(this.idCandidat)
      .subscribe(data=> {
        this.candidat = data;
      }, error=>{
        console.log(error);
      })
  }

  updateCandidat(){
this.candidatSevices.updateCandidat(this.candidat)
  .subscribe(data=>{
    console.log(data);
    alert("Mise a jour effectuée");
    this.router.navigate(['candidats']);
      }, err=>{
    console.log(err);
    alert("Problème");
  })
  }
}
