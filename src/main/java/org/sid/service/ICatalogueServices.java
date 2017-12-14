package org.sid.service;

import java.util.Set;

import org.sid.entities.Produits;

public interface ICatalogueServices {

	public void addProduit(Produits p);
	public Set<Produits> getAllProduits();
	public Produits getProduitByRef(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produits p);
	
}
