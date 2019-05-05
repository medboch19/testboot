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
public class Commission implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCommission ;
	private Date dateCreation ;
	private byte pv;
	@OneToMany(mappedBy="commission")
	private Collection<Dossier>liste_dossier_commission;
	public Commission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commission(Date dateCreation, byte pv) {
		super();
		this.dateCreation = dateCreation;
		this.pv = pv;
	}

	public int getIdCommission() {
		return idCommission;
	}

	public void setIdCommission(int idCommission) {
		this.idCommission = idCommission;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public byte getPv() {
		return pv;
	}

	public void setPv(byte pv) {
		this.pv = pv;
	}

	public Collection<Dossier> getListe_dossier_commission() {
		return liste_dossier_commission;
	}

	public void setListe_dossier_commission(Collection<Dossier> liste_dossier_commission) {
		this.liste_dossier_commission = liste_dossier_commission;
	}
	

	
}
