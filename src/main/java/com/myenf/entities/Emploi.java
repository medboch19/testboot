package com.myenf.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.myenf.entities.Candidat;
import com.myenf.entities.Examen;
@Entity
public class Emploi implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmploi;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idCandidat")
	private Candidat candidatEmp;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="codeExamen")
	private Examen exEmploi;

	public int getIdEmploi() {
		return idEmploi;
	}

	public void setIdEmploi(int idEmploi) {
		this.idEmploi = idEmploi;
	}

	public Candidat getcandidatEmp() {
		return candidatEmp;
	}

	public void setcandidatEmp(Candidat candidatEmp) {
		this.candidatEmp = candidatEmp;
	}

	public Examen getExEmploi() {
		return exEmploi;
	}

	public void setExEmploi(Examen exEmploi) {
		this.exEmploi = exEmploi;
	}
	
	

}
