package org.sid.Dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.sid.entities.Produits;

public class CatalogueDaoImpl implements IcatalogueDao {
	private Map<String,Produits> produits= new HashMap<String, Produits>();
	Logger logger = Logger.getLogger(this.getClass());
	public void addProduit(Produits p) {
			produits.put(p.getReference(), p);
			
	}

	public Set<Produits> getAllProduits() {
		return new HashSet<Produits>(produits.values());
	}

	public Produits getProduitByRef(String ref) {
		// TODO Auto-generated method stub
		return produits.get(ref);
	}

	public void deleteProduit(String ref) {
		
		produits.remove(ref);
	}

	public void updateProduit(Produits p) {
		produits.put(p.getReference(), p);
	}
	public void initialisation(){
		this.addProduit(new Produits("ASEP1","Exemple produit 1",33,12,true));
		this.addProduit(new Produits("ASEP2","Exemple produit 2",3.3,1,true));
		this.addProduit(new Produits("ASEP3","Exemple produit 3",13.3,112,false));
		this.addProduit(new Produits("ASEP4","Exemple produit 4",100,122,false));
		this.addProduit(new Produits("ASEP5","Exemple produit 5",23,123,true));
		this.addProduit(new Produits("ASEP6","Exemple produit 6",133,102,false));
		logger.info("initialisation des produits");

	}
}
