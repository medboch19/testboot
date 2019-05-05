package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Groupe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idGroupe ;
	private int nomGroupe ;
	@ManyToOne
	@JoinColumn(name="numeroSalle")
	private Salle salle;
	@OneToMany(mappedBy="groupe")
	private Collection<Candidat>liste_grp_candidat;
	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public int getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(int nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public Collection<Candidat> getListe_grp_candidat() {
		return liste_grp_candidat;
	}
	public void setListe_grp_candidat(Collection<Candidat> liste_grp_candidat) {
		this.liste_grp_candidat = liste_grp_candidat;
	}

}
