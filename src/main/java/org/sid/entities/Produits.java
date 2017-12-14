package org.sid.entities;

import java.io.Serializable;

public class Produits implements Serializable{
	
	private String reference;
	private String designation;
	private double prix;
	private int quantite;
	private boolean promo;
	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produits(String reference, String designation, double prix,
			int quantite, boolean promo) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
		this.promo = promo;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public boolean isPromo() {
		return promo;
	}
	public void setPromo(boolean promo) {
		this.promo = promo;
	}
	@Override
	public String toString() {
		return "Produits [reference=" + reference + ", designation="
				+ designation + ", prix=" + prix + ", quantite=" + quantite
				+ ", promo=" + promo + "]";
	}

	
	
}
