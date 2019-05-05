import { Component, OnInit } from '@angular/core';
import { CandidatService } from '../services/candidat.service';

@Component({
  selector: 'app-candidat',
  templateUrl: './candidat.component.html',
  styleUrls: ['./candidat.component.css']
})
export class CandidatComponent implements OnInit {
  candidatData: any;

  constructor(private candidatService:CandidatService) { }

  ngOnInit() {
    this.getAllCondidatss();
  }



  getAllCondidatss(): void {
    this.candidatService.getAllCandidat().subscribe( data => {
      console.log(' data ', data);
      this.candidatData=data;
      console.log(' searchedData ', this.candidatData);
    }, error => {
      console.log('error', error);
    });
  }


}
