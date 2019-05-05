package com.myenf.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="UVOP")
public class UnitedeValeurOptionnelle extends UnitedeValeur implements Serializable {

	public UnitedeValeurOptionnelle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnitedeValeurOptionnelle(String nom, int credit, String discipline) {
		super(nom, credit, discipline);
		// TODO Auto-generated constructor stub
	}

	
}
