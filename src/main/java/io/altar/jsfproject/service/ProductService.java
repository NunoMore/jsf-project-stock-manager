package io.altar.jsfproject.service;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repositories.DB_bean;
import io.altar.jsfproject.view.ProductBean;

@Named("ProductService")
@ApplicationScoped
public class ProductService {
	
	@Inject
	private ProductBean productBean;

	private boolean editable = false;
	private long productId;

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	public void edit(long id){
		this.editable = true;
		this.productId = id;
		productBean.setProduct(this.consult(id));
	}

	public void toMenu() {
		if (!isEditable()) { // se nao for editavel é porque tem de ser criado
			Product product = productBean.getProduct();
			
			DB_bean.getPRODUCT_REPOSITORY().create(product);
			
		} else if (isEditable()) { // se for editavel faz-se update
			productBean.getProduct().setId(this.productId);
			Product product = productBean.getProduct();
			
			DB_bean.getPRODUCT_REPOSITORY().update(product);
			this.editable = false;
		}
		// return "product-menu?faces-redirect=true";
	}

	public void remove(Product product) {
		DB_bean.getPRODUCT_REPOSITORY().remove(product.getId());
	}

	public Collection<Product> consult() {
		return DB_bean.getPRODUCT_REPOSITORY().consult();
	}

	public Product consult(long id) {
		return DB_bean.getPRODUCT_REPOSITORY().consult(id);
	}

}
