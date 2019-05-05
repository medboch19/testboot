package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity

public class Formateur implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFormateur;
	
	private String nomFormateur;
	private String prenomFormateur;
	private String administration;
	
	private String lieuTravail;

	private Date dateLimiteEC ; 
	private String disciplineSujetExamen;
	@OneToMany(mappedBy="formateur")
	private Collection<Examen> listexamensf;
	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Formateur(String nomFormateur, String prenomFormateur, String administration, String lieuTravail,
			Date dateLimiteEC, String disciplineSujetExamen) {
		super();
		this.nomFormateur = nomFormateur;
		this.prenomFormateur = prenomFormateur;
		this.administration = administration;
		this.lieuTravail = lieuTravail;
		this.dateLimiteEC = dateLimiteEC;
		this.disciplineSujetExamen = disciplineSujetExamen;
	}
	public int getIdFormateur() {
		return idFormateur;
	}
	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}
	public String getNomFormateur() {
		return nomFormateur;
	}
	public void setNomFormateur(String nomFormateur) {
		this.nomFormateur = nomFormateur;
	}
	public String getPrenomFormateur() {
		return prenomFormateur;
	}
	public void setPrenomFormateur(String prenomFormateur) {
		this.prenomFormateur = prenomFormateur;
	}
	public String getAdministration() {
		return administration;
	}
	public void setAdministration(String administration) {
		this.administration = administration;
	}
	public String getLieuTravail() {
		return lieuTravail;
	}
	public void setLieuTravail(String lieuTravail) {
		this.lieuTravail = lieuTravail;
	}
	public Date getDateLimiteEC() {
		return dateLimiteEC;
	}
	public void setDateLimiteEC(Date dateLimiteEC) {
		this.dateLimiteEC = dateLimiteEC;
	}
	public String getDisciplineSujetExamen() {
		return disciplineSujetExamen;
	}
	public void setDisciplineSujetExamen(String disciplineSujetExamen) {
		this.disciplineSujetExamen = disciplineSujetExamen;
	}
	public Collection<Examen> getListexamensf() {
		return listexamensf;
	}
	public void setListexamensf(Collection<Examen> listexamensf) {
		this.listexamensf = listexamensf;
	}
	
	
	
}
