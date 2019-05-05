package com.myenf.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class NoteId implements Serializable {
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Candidat candNoteId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private UnitedeValeur udvNoteId;

	public NoteId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidat getCandNoteId() {
		return candNoteId;
	}

	public void setCandNoteId(Candidat candNoteId) {
		this.candNoteId = candNoteId;
	}

	public UnitedeValeur getUdvNoteId() {
		return udvNoteId;
	}

	public void setUdvNoteId(UnitedeValeur udvNoteId) {
		this.udvNoteId = udvNoteId;
	}
	
	
	
	
	
	
}
