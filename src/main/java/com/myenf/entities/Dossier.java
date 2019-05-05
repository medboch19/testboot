package com.myenf.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dossier implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDossier ;
	private Date dateLimite ;
	private boolean existanceFormulaire ;
	private boolean existanceADSA ;
	private boolean existanceATGC ;
	private boolean existanceCD ;
	private boolean existanceRDEC ;
	private boolean existancePhoto;
	private boolean existanceCIN ;
	private boolean existanceEnveloppe ;
	@ManyToOne
	@JoinColumn(name="idCandidat")
	private Candidat candidat;
	@ManyToOne
	@JoinColumn(name="idCommission")
	private Commission commission;
	
	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dossier(Date dateLimite, boolean existanceFormulaire, boolean existanceADSA, boolean existanceATGC,
			boolean existanceCD, boolean existanceRDEC, boolean existancePhoto, boolean existanceCIN,
			boolean existanceEnveloppe) {
		super();
		this.dateLimite = dateLimite;
		this.existanceFormulaire = existanceFormulaire;
		this.existanceADSA = existanceADSA;
		this.existanceATGC = existanceATGC;
		this.existanceCD = existanceCD;
		this.existanceRDEC = existanceRDEC;
		this.existancePhoto = existancePhoto;
		this.existanceCIN = existanceCIN;
		this.existanceEnveloppe = existanceEnveloppe;
	}

	public int getIdDossier() {
		return idDossier;
	}

	public void setIdDossier(int idDossier) {
		this.idDossier = idDossier;
	}

	public Date getDateLimite() {
		return dateLimite;
	}

	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}

	public boolean isExistanceFormulaire() {
		return existanceFormulaire;
	}

	public void setExistanceFormulaire(boolean existanceFormulaire) {
		this.existanceFormulaire = existanceFormulaire;
	}

	public boolean isExistanceADSA() {
		return existanceADSA;
	}

	public void setExistanceADSA(boolean existanceADSA) {
		this.existanceADSA = existanceADSA;
	}

	public boolean isExistanceATGC() {
		return existanceATGC;
	}

	public void setExistanceATGC(boolean existanceATGC) {
		this.existanceATGC = existanceATGC;
	}

	public boolean isExistanceCD() {
		return existanceCD;
	}

	public void setExistanceCD(boolean existanceCD) {
		this.existanceCD = existanceCD;
	}

	public boolean isExistanceRDEC() {
		return existanceRDEC;
	}

	public void setExistanceRDEC(boolean existanceRDEC) {
		this.existanceRDEC = existanceRDEC;
	}

	public boolean isExistancePhoto() {
		return existancePhoto;
	}

	public void setExistancePhoto(boolean existancePhoto) {
		this.existancePhoto = existancePhoto;
	}

	public boolean isExistanceCIN() {
		return existanceCIN;
	}

	public void setExistanceCIN(boolean existanceCIN) {
		this.existanceCIN = existanceCIN;
	}

	public boolean isExistanceEnveloppe() {
		return existanceEnveloppe;
	}

	public void setExistanceEnveloppe(boolean existanceEnveloppe) {
		this.existanceEnveloppe = existanceEnveloppe;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(Commission commission) {
		this.commission = commission;
	}
	
	

}