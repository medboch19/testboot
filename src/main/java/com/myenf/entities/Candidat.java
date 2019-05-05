package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Candidat implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCandidat ;
	private int cin ;
	private String nom ;
	private String prenom ;
	private String adresse ;
	private int telephone_personnel ;
	private String nomAdministration ;
	private String lieuTravail ;
	private String adresseTravail ;
	private String niveauAcademique ;
	private String gradeActuel ;
	private String descriptionTaches ;
	private Date dateLimiteinscription;
	private String categorie ;
	private String adressemail ;
	private int idGrade ;
	private String specialite ;
	@OneToMany(mappedBy="candidat")
	private Collection<Dossier>liste_dossier_candidat;
	@ManyToMany(mappedBy="Listcandidat")
	private Collection<Session> sessions;
	@OneToMany(mappedBy="candidatEmp")
	private Collection<Emploi>liste_candidat_emp;
	@OneToMany(mappedBy="idnote.candidatnote",cascade = CascadeType.ALL)
	private Collection<Note>liste_candidat_note;
	@ManyToOne
	@JoinColumn(name="idGroupe")
	private Groupe groupe;
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidat(int cin, String nom, String prenom, String adresse, int telephone_personnel,
			String nomAdministration, String lieuTravail, String adresseTravail, String niveauAcademique,
			String gradeActuel, String descriptionTaches, Date dateLimiteinscription, String categorie,
			String adressemail, int idGrade, String specialite) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone_personnel = telephone_personnel;
		this.nomAdministration = nomAdministration;
		this.lieuTravail = lieuTravail;
		this.adresseTravail = adresseTravail;
		this.niveauAcademique = niveauAcademique;
		this.gradeActuel = gradeActuel;
		this.descriptionTaches = descriptionTaches;
		this.dateLimiteinscription = dateLimiteinscription;
		this.categorie = categorie;
		this.adressemail = adressemail;
		this.idGrade = idGrade;
		this.specialite = specialite;
	}
	
	public Integer getIdCandidat() {
		return idCandidat;
	}
	public void setIdCandidat(Integer idCandidat) {
		this.idCandidat = idCandidat;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone_personnel() {
		return telephone_personnel;
	}
	public void setTelephone_personnel(int telephone_personnel) {
		this.telephone_personnel = telephone_personnel;
	}
	public String getNomAdministration() {
		return nomAdministration;
	}
	public void setNomAdministration(String nomAdministration) {
		this.nomAdministration = nomAdministration;
	}
	public String getLieuTravail() {
		return lieuTravail;
	}
	public void setLieuTravail(String lieuTravail) {
		this.lieuTravail = lieuTravail;
	}
	public String getAdresseTravail() {
		return adresseTravail;
	}
	public void setAdresseTravail(String adresseTravail) {
		this.adresseTravail = adresseTravail;
	}
	public String getNiveauAcademique() {
		return niveauAcademique;
	}
	public void setNiveauAcademique(String niveauAcademique) {
		this.niveauAcademique = niveauAcademique;
	}
	public String getGradeActuel() {
		return gradeActuel;
	}
	public void setGradeActuel(String gradeActuel) {
		this.gradeActuel = gradeActuel;
	}
	public String getDescriptionTaches() {
		return descriptionTaches;
	}
	public void setDescriptionTaches(String descriptionTaches) {
		this.descriptionTaches = descriptionTaches;
	}
	public Date getDateLimiteinscription() {
		return dateLimiteinscription;
	}
	public void setDateLimiteinscription(Date dateLimiteinscription) {
		this.dateLimiteinscription = dateLimiteinscription;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getAdressemail() {
		return adressemail;
	}
	public void setAdressemail(String adressemail) {
		this.adressemail = adressemail;
	}
	public int getIdGrade() {
		return idGrade;
	}
	public void setIdGrade(int idGrade) {
		this.idGrade = idGrade;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public Collection<Dossier> getListe_dossier_candidat() {
		return liste_dossier_candidat;
	}
	public void setListe_dossier_candidat(Collection<Dossier> liste_dossier_candidat) {
		this.liste_dossier_candidat = liste_dossier_candidat;
	}
	public Collection<Session> getSessions() {
		return sessions;
	}
	public void setSessions(Collection<Session> sessions) {
		this.sessions = sessions;
	}
	public Collection<Emploi> getListe_candidat_emp() {
		return liste_candidat_emp;
	}
	public void setListe_candidat_emp(Collection<Emploi> liste_candidat_emp) {
		this.liste_candidat_emp = liste_candidat_emp;
	}
	public Collection<Note> getListe_candidat_note() {
		return liste_candidat_note;
	}
	public void setListe_candidat_note(Collection<Note> liste_candidat_note) {
		this.liste_candidat_note = liste_candidat_note;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	
	
	
}
