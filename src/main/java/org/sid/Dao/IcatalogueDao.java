package org.sid.Dao;

import java.util.List;
import java.util.Set;

import org.sid.entities.Produits;

public interface IcatalogueDao {
	
	public void addProduit(Produits p);
	public Set<Produits> getAllProduits();
	public Produits getProduitByRef(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produits p);
	

}
