package org.sid.service;

import java.util.Set;

import org.sid.Dao.IcatalogueDao;
import org.sid.entities.Produits;

public class CatalogueServiceImpl implements ICatalogueServices {
	private IcatalogueDao dao;

	public void setDao(IcatalogueDao dao) {
		this.dao = dao;
	}

	public void addProduit(Produits p) {
		dao.addProduit(p);
	}

	public Set<Produits> getAllProduits() {
		// TODO Auto-generated method stub
		return dao.getAllProduits();
	}

	public Produits getProduitByRef(String ref) {
		return dao.getProduitByRef(ref);
	}

	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);
	}

	public void updateProduit(Produits p) {
		dao.updateProduit(p);
	}

}
