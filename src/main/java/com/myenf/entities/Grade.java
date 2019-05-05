package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Grade implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idGrade ;
	private int nomGrade ;
	@ManyToMany
	@JoinTable(name="grade_matiere",joinColumns=
	@JoinColumn(name="idGrade"),
	inverseJoinColumns=@JoinColumn(name="refMatiereFP"))
    private Collection<MatiereFP> liste_matiere_grade;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdGrade() {
		return idGrade;
	}
	public void setIdGrade(int idGrade) {
		this.idGrade = idGrade;
	}
	public int getNomGrade() {
		return nomGrade;
	}
	public void setNomGrade(int nomGrade) {
		this.nomGrade = nomGrade;
	}
	public Collection<MatiereFP> getListe_matiere_grade() {
		return liste_matiere_grade;
	}
	public void setListe_matiere_grade(Collection<MatiereFP> liste_matiere_grade) {
		this.liste_matiere_grade = liste_matiere_grade;
	}
	
	

}
