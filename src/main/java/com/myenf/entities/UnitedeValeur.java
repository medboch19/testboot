package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_UV",discriminatorType=DiscriminatorType.STRING,length=4)
public class UnitedeValeur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer referenceUn ;
	private String nom ;
	private int credit ;
	private String discipline ;
	@ManyToOne
	@JoinColumn(name="idFormateur")
	private Formateur formateurunite;
	@ManyToOne
	@JoinColumn(name="reference")
	private Discipline dis_uni;
	@OneToMany(mappedBy="idnote.unitenote",cascade = CascadeType.ALL)
	private Collection<Note>liste_unite_note;
	
	public UnitedeValeur() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	public UnitedeValeur(String nom, int credit, String discipline) {
		super();
		this.nom = nom;
		this.credit = credit;
		this.discipline = discipline;
	}

	public int getReferenceUn() {
		return referenceUn;
	}

	public void setReferenceUn(int referenceUn) {
		this.referenceUn = referenceUn;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public Formateur getFormateurunite() {
		return formateurunite;
	}

	public void setFormateurunite(Formateur formateurunite) {
		this.formateurunite = formateurunite;
	}

	public Discipline getDis_uni() {
		return dis_uni;
	}

	public void setDis_uni(Discipline dis_uni) {
		this.dis_uni = dis_uni;
	}

	public Collection<Note> getListe_unite_note() {
		return liste_unite_note;
	}

	public void setListe_unite_note(Collection<Note> liste_unite_note) {
		this.liste_unite_note = liste_unite_note;
	}



	

	
	
}