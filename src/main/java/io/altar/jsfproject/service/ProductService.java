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

	public void edit(long id) {
		this.editable = true;
		this.productId = id;
		productBean.setProduct(consult(id));
	}

	public String selectIDs(){
		StringBuilder sb = new StringBuilder(1024);
//		sb.append("<p:selectOneListbox id='productIdInput' value='#{ShelfBean.shelf.productId}'>");
//		
//		for (long i = 0; i < DB_bean.getPRODUCT_REPOSITORY().getMaiorId(); i++) {
//			String nameP = DB_bean.getPRODUCT_REPOSITORY().getM1().get(i+1).getName();
//			long id = DB_bean.getPRODUCT_REPOSITORY().getM1().get(i+1).getId();
//			sb.append("<f:selectItem itemLabel='Product "+nameP+"' itemValue='"+id+"' />");
//		}
//		
//		sb.append("</p:selectOneListbox></p:selectOneListbox>");
		

        
		sb.append("<div id='j_idt11:productIdInput' class='ui-selectonelistbox ui-inputfield ui-widget ui-widget-content ui-corner-all'><div class='ui-helper-hidden-accessible'><select id='j_idt11:productIdInput_input' name='j_idt11:productIdInput_input' size='2' aria-labelledby='j_idt11:j_idt23'>");
		
		for (long i = 0; i < DB_bean.getPRODUCT_REPOSITORY().getMaiorId(); i++) {
			String nameP = DB_bean.getPRODUCT_REPOSITORY().getM1().get(i+1).getName();
			long id = DB_bean.getPRODUCT_REPOSITORY().getM1().get(i+1).getId();
			sb.append("<option value='"+id+"' >Product "+nameP+"</option>");
		}
		
		sb.append("</select></div><div class='ui-selectlistbox-listcontainer' style='height:auto'><ul class='ui-selectlistbox-list'>");
		
		for (long i = 0; i < DB_bean.getPRODUCT_REPOSITORY().getMaiorId(); i++) {
			String nameP = DB_bean.getPRODUCT_REPOSITORY().getM1().get(i+1).getName();
			sb.append("<li class='ui-selectlistbox-item ui-corner-all ui-state-highlight'>Product "+nameP+"</li>");
		}
		
		sb.append("</ul></div></div>");
		
		return sb.toString();
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

	public static Collection<Product> consult() {
		return DB_bean.getPRODUCT_REPOSITORY().consult();
	}

	public static Product consult(long id) {
		return DB_bean.getPRODUCT_REPOSITORY().consult(id);
	}

}
