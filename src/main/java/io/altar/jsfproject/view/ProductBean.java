package io.altar.jsfproject.view;


import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.service.ProductService;


@Named("ProductBean")
@RequestScoped
public class ProductBean {
	
	private Product product = new Product();
	private boolean editable = false;
	
	@Inject
	private ProductService productService;

	public void toMenu() {
		if (!isEditable()) { // se nao for editavel é porque tem de ser criado
			productService.create(product);
		} else if (isEditable()) { // se for editavel
			productService.update(product);
		}
//		return "product-menu?faces-redirect=true";
	}
	
	public void remove(){
		productService.remove(product);
	}
	
	public Collection<Product> consult(){ 
		return productService.consult();
	}
	
	public void edit(Long id){
		editable = true;
		this.product = productService.consult(id);
//		return "product?faces-redirect=true";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
}
