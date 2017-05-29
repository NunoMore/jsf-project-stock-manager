package io.altar.jsfproject.view;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;


@Named("ProductBean")
@RequestScoped
public class ProductBean {
	
	private Product product = new Product();
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
