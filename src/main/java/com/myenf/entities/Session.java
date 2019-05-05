package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
@Entity
public class Session implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAnnonceSession ;
	private Date dateAnnonceSession ;
	
	@ManyToMany
	@JoinTable(name="cand_sess",joinColumns=
	@JoinColumn(name="idAnnonceSession"),
	inverseJoinColumns=@JoinColumn(name="idCandidat"))
	private Collection<Candidat> Listcandidat;
	
	
	
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Session(Date dateAnnonceSession) {
		super();
		this.dateAnnonceSession = dateAnnonceSession;
	}

	public int getIdAnnonceSession() {
		return idAnnonceSession;
	}

	public void setIdAnnonceSession(int idAnnonceSession) {
		this.idAnnonceSession = idAnnonceSession;
	}

	public Date getDateAnnonceSession() {
		return dateAnnonceSession;
	}

	public void setDateAnnonceSession(Date dateAnnonceSession) {
		this.dateAnnonceSession = dateAnnonceSession;
	}

	

		
		public Collection<Candidat> getListcandidat() {
			return Listcandidat;
		}

		public void setListcandidat(Collection<Candidat> listcandidat) {
			Listcandidat = listcandidat;
		}

		public void setIdAnnonceSession(Integer idAnnonceSession) {
			this.idAnnonceSession = idAnnonceSession;
		}

	

}
