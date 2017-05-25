package io.altar.jsfproject.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;

@Named("ProductBean")
@RequestScoped
public class ProductBean {
	
	private Product product = new Product();
	private boolean editable = false;

	
	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void edit(){
		editable = true;
	}
	
}
