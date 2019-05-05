package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Discipline implements Serializable{
	@Id
	private Integer reference ;
	private String nom ;
	private String description;
	@ManyToOne
	@JoinColumn(name="refMatiereFP")
	private MatiereFP matierefp;
	@OneToMany(mappedBy="dis_uni")
	private Collection<UnitedeValeur>liste_dis_unite;
	public Discipline() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MatiereFP getMatierefp() {
		return matierefp;
	}
	public void setMatierefp(MatiereFP matierefp) {
		this.matierefp = matierefp;
	}
	public Collection<UnitedeValeur> getListe_dis_unite() {
		return liste_dis_unite;
	}
	public void setListe_dis_unite(Collection<UnitedeValeur> liste_dis_unite) {
		this.liste_dis_unite = liste_dis_unite;
	}
	
}