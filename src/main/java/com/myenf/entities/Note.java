package com.myenf.entities;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;
import javax.persistence.Entity;

@Entity
@AssociationOverrides({
	   @AssociationOverride(name = "idnote.candidatnote",
	        joinColumns = @JoinColumn(name = "idCandidat")),
	    @AssociationOverride(name = "idnote.unitenote",
	        joinColumns = @JoinColumn(name = "reference")) })
public class Note implements Serializable {

	@EmbeddedId
	private Cand_unite_note idnote=new Cand_unite_note();
	private double note1;
	private double note2;
	private double noteFinal;
	private String observation;
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cand_unite_note getIdnote() {
		return idnote;
	}
	public void setIdnote(Cand_unite_note idnote) {
		this.idnote = idnote;
	}
	public double getNote1() {
		return note1;
	}
	public void setNote1(double note1) {
		this.note1 = note1;
	}
	public double getNote2() {
		return note2;
	}
	public void setNote2(double note2) {
		this.note2 = note2;
	}
	public double getNoteFinal() {
		return noteFinal;
	}
	public void setNoteFinal(double noteFinal) {
		this.noteFinal = noteFinal;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	@Transient
	public Candidat getCandidat() {
		return getIdnote().getCandidatnote();
	}
	public void setCandidat(Candidat candidat) {
		getIdnote().setCandidatnote(candidat);
	}
	
	@Transient
	public UnitedeValeur getUnitedeValeur() {
		return getIdnote().getUnitenote();
	}
	public void setUnitedeValeur(UnitedeValeur unite) {
		getIdnote().setUnitenote(unite);}
	
	
	

}
