package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Salle implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer numeroSalle ;
	private int capaciteMax ;
	@OneToMany(mappedBy="salle")
	private Collection<Groupe>liste_salle_grp;
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNumeroSalle() {
		return numeroSalle;
	}
	public void setNumeroSalle(int numeroSalle) {
		this.numeroSalle = numeroSalle;
	}
	public int getCapaciteMax() {
		return capaciteMax;
	}
	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}
	public Collection<Groupe> getListe_salle_grp() {
		return liste_salle_grp;
	}
	public void setListe_salle_grp(Collection<Groupe> liste_salle_grp) {
		this.liste_salle_grp = liste_salle_grp;
	}

}
