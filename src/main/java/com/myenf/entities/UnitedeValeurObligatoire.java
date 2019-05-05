package com.myenf.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="UVOB")
public class UnitedeValeurObligatoire extends UnitedeValeur implements Serializable {

	public UnitedeValeurObligatoire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnitedeValeurObligatoire(String nom, int credit, String discipline) {
		super(nom, credit, discipline);
		// TODO Auto-generated constructor stub
	}




	
}
