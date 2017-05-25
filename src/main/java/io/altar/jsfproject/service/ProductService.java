package io.altar.jsfproject.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repositories.DB_bean;
import io.altar.jsfproject.repositories.EntityRepository;
import io.altar.jsfproject.view.ProductBean;

@Named("ProductService")
@RequestScoped
public class ProductService {

	// private long productId;
	private Collection<Product> productList;

	private EntityRepository<Product> productRepository = DB_bean.getPRODUCT_REPOSITORY();

	@Inject
	private ProductBean productBean;

	public void toMenu() {
		if (!productBean.isEditable()) { // se nao for editavel é porque tem de
											// ser criado
			System.out.println(productBean.getProduct().getName());
			productRepository.create(productBean.getProduct());
		} else if (productBean.isEditable()) { // se for editavel
			productRepository.update(productBean.getProduct());
		}
//		return "product-menu?faces-redirect=true";
	}

	public void remove() {
		productRepository.remove(productBean.getProduct().getId());
	}

	public void setProductBean(long id) {
		productBean.setProduct(productRepository.consult(id));
	}

	public ProductBean getProduct() {
		return productBean;
	}

	public void setProduct(ProductBean productBean) {
		this.productBean = productBean;
	}

	// public long getProductId() {
	// return productId;
	// }
	//
	// public void setProductId(long productId) {
	// this.productId = productId;
	// }

	public Collection<Product> getProductList() {
		productList = DB_bean.getPRODUCT_REPOSITORY().consult();
		return productList;
	}

	public void setProductList(Collection<Product> productList) {
		this.productList = productList;
	}

}
