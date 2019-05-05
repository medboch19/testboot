package com.myenf.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class Surveillant implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer idSurveillant;
	
	private String nomSurveillant;
	private String prenomSurveillant;
	private String structure;
	
	private int nombreHeureSurv;
private double rib ;

@OneToMany(mappedBy="surveillant")
private Collection<Examen> listexamenss;

public Surveillant() {
	super();
	// TODO Auto-generated constructor stub
}
public Surveillant(String nomSurveillant, String prenomSurveillant, String structure, int nombreHeureSurv, double rib) {
	super();
	this.nomSurveillant = nomSurveillant;
	this.prenomSurveillant = prenomSurveillant;
	this.structure = structure;
	this.nombreHeureSurv = nombreHeureSurv;
	this.rib = rib;
}
public int getIdSurveillant() {
	return idSurveillant;
}
public void setIdSurveillant(int idSurveillant) {
	this.idSurveillant = idSurveillant;
}
public String getNomSurveillant() {
	return nomSurveillant;
}
public void setNomSurveillant(String nomSurveillant) {
	this.nomSurveillant = nomSurveillant;
}
public String getPrenomSurveillant() {
	return prenomSurveillant;
}
public void setPrenomSurveillant(String prenomSurveillant) {
	this.prenomSurveillant = prenomSurveillant;
}
public String getStructure() {
	return structure;
}
public void setStructure(String structure) {
	this.structure = structure;
}
public int getNombreHeureSurv() {
	return nombreHeureSurv;
}
public void setNombreHeureSurv(int nombreHeureSurv) {
	this.nombreHeureSurv = nombreHeureSurv;
}
public double getRib() {
	return rib;
}
public void setRib(double rib) {
	this.rib = rib;
}
public Collection<Examen> getListexamenss() {
	return listexamenss;
}
public void setListexamenss(Collection<Examen> listexamenss) {
	this.listexamenss = listexamenss;
}



}
