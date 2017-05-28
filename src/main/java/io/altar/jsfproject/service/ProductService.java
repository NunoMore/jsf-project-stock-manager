package io.altar.jsfproject.service;


import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repositories.DB_bean;

@Named("ProductService")
@RequestScoped
public class ProductService{
	
	public void create(Product product){
		DB_bean.getPRODUCT_REPOSITORY().create(product);
	}
	
	public void update(Product product){
		DB_bean.getPRODUCT_REPOSITORY().update(product);
	}
	
	public void remove(Product product) {
		DB_bean.getPRODUCT_REPOSITORY().remove(product.getId());
	}
	
	public Collection<Product> consult(){
		return DB_bean.getPRODUCT_REPOSITORY().consult();
	}
	
	public Product consult(long id){
		return DB_bean.getPRODUCT_REPOSITORY().consult(id);
	}

}
