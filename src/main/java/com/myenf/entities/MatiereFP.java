package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class MatiereFP implements Serializable{
	@Id
	private Integer refMatiereFP ;
	private String nomMatiereFP ;
	private int nombreHeureparGrade;
	@ManyToMany(mappedBy="liste_matiere_grade")
	private Collection<Grade> grades;
	@OneToMany(mappedBy="matierefp")
	private Collection<Discipline>liste_matiere_discipline;
	public MatiereFP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRefMatiereFP() {
		return refMatiereFP;
	}
	public void setRefMatiereFP(int refMatiereFP) {
		this.refMatiereFP = refMatiereFP;
	}
	public String getNomMatiereFP() {
		return nomMatiereFP;
	}
	public void setNomMatiereFP(String nomMatiereFP) {
		this.nomMatiereFP = nomMatiereFP;
	}
	public int getNombreHeureparGrade() {
		return nombreHeureparGrade;
	}
	public void setNombreHeureparGrade(int nombreHeureparGrade) {
		this.nombreHeureparGrade = nombreHeureparGrade;
	}
	public Collection<Grade> getGrades() {
		return grades;
	}
	public void setGrades(Collection<Grade> grades) {
		this.grades = grades;
	}
	public Collection<Discipline> getListe_matiere_discipline() {
		return liste_matiere_discipline;
	}
	public void setListe_matiere_discipline(Collection<Discipline> liste_matiere_discipline) {
		this.liste_matiere_discipline = liste_matiere_discipline;
	}
	
}
