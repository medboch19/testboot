package com.myenf.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class Cand_unite_note implements Serializable {
	@ManyToOne(cascade=CascadeType.ALL)
	private Candidat candidatnote;
	@ManyToOne(cascade=CascadeType.ALL)
	private UnitedeValeur unitenote;
	public Cand_unite_note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidat getCandidatnote() {
		return candidatnote;
	}
	public void setCandidatnote(Candidat candidatnote) {
		this.candidatnote = candidatnote;
	}
	public UnitedeValeur getUnitenote() {
		return unitenote;
	}
	public void setUnitenote(UnitedeValeur unitenote) {
		this.unitenote = unitenote;
	}
	
	
}
