package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.myenf.entities.Emploi;


@Entity
public class Examen implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int codeExamen ;
	private String sujet ;
	private Date dateDeroulement ;
	@ManyToOne
	@JoinColumn(name="idSurveillant")
	private Surveillant surveillant;
	
	@ManyToOne
	@JoinColumn(name="idFormateur")
	private Formateur formateur;
	@OneToMany(mappedBy="exEmploi")
	private Collection<Emploi> listemploiex;
	
	
	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Examen( String sujet, Date dateDeroulement) {
		super();
	
		this.sujet = sujet;
		this.dateDeroulement = dateDeroulement;
	}
	public int getCodeExamen() {
		return codeExamen;
	}
	public void setCodeExamen(int codeExamen) {
		this.codeExamen = codeExamen;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public Date getDateDeroulement() {
		return dateDeroulement;
	}
	public void setDateDeroulement(Date dateDeroulement) {
		this.dateDeroulement = dateDeroulement;
	}
	public Surveillant getSurveillant() {
		return surveillant;
	}
	public void setSurveillant(Surveillant surveillant) {
		this.surveillant = surveillant;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	public Collection<Emploi> getListemploiex() {
		return listemploiex;
	}
	public void setListemploiex(Collection<Emploi> listemploiex) {
		this.listemploiex = listemploiex;
	} 
	
	
	

}
