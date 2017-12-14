package org.sid.service;

import org.sid.Dao.CatalogueDaoImpl;

public class SingletonService {
	private static CatalogueServiceImpl service;
	static{
		CatalogueDaoImpl dao=new CatalogueDaoImpl();
		dao.initialisation();
		service =new CatalogueServiceImpl();
		service.setDao(dao);
	}
	public static CatalogueServiceImpl getService() {
		return service;
	}

}
