import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CandidatComponent } from './candidat/candidat.component';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './header/header.component';

import {FormsModule} from '@angular/forms';
import { NewCandidatComponent } from './new-condidat/new-candidat.component';
import { EditCandidatComponent } from './edit-candidat/edit-candidat.component';

import { DossierComponent } from './dossier/dossier.component';
import { NewDossierComponent } from './new-dossier/new-dosssier.component';

@NgModule({
  declarations: [
    HeaderComponent,
    AppComponent,
    CandidatComponent,
    NewCandidatComponent,
    EditCandidatComponent,
    DossierComponent,
    NewDossierComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
