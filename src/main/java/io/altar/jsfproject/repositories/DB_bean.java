package io.altar.jsfproject.repositories;

//import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.model.Shelf;
//
//@Named("DB_bean")
//@ApplicationScoped
public class DB_bean {
	private static final EntityRepository<Product> PRODUCT_REPOSITORY = new EntityRepository<>();
	private static final EntityRepository<Shelf> SHELF_REPOSITORY = new EntityRepository<>();
	
	public static EntityRepository<Product> getPRODUCT_REPOSITORY() {
		return PRODUCT_REPOSITORY;
	}
	public static EntityRepository<Shelf> getSHELF_REPOSITORY() {
		return SHELF_REPOSITORY;
	}

}
