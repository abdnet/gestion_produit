package org.sid.web;

import java.util.Set;

import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

import org.sid.entities.Produits;
import org.sid.service.ICatalogueServices;
import org.sid.service.SingletonService;

import com.opensymphony.xwork2.ActionSupport;

public class ProduitAction extends ActionSupport {
		public Produits p = new Produits();
		public Set<Produits> produits;
		private ICatalogueServices service = SingletonService.getService();
		public String ref;
		public boolean update=false;
	public String index(){
			produits=service.getAllProduits();
			return SUCCESS;
		}
	
	public String save(){
		if(!update){
		service.addProduit(p);
		}else{
			service.updateProduit(p);
			update=false;
			p=new Produits();
		}
		produits=service.getAllProduits();
		return SUCCESS;
		
	}
	
	public String delete(){
		service.deleteProduit(ref);
		produits=service.getAllProduits();
		return SUCCESS;
	}
	
	public String update(){
		update=true;
		p=service.getProduitByRef(ref);
		produits=service.getAllProduits();
		return SUCCESS;
	}

}
