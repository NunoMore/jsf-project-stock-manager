package io.altar.jsfproject.service;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.model.Shelf;
import io.altar.jsfproject.repositories.DB_bean;
import io.altar.jsfproject.view.ShelfBean;

@Named("ShelfService")
@ApplicationScoped
public class ShelfService {
//	
//	@Inject
//	private ShelfBean shelfBean;
//
//	private boolean editable = false;
//	private long shelfId;
//
//	public boolean isEditable() {
//		return editable;
//	}
//
//	public void setEditable(boolean editable) {
//		this.editable = editable;
//	}
//	
//	public void edit(long id){
//		this.editable = true;
//		this.shelfId = id;
//		shelfBean.setShelf(this.consult(id));
//	}

//	public void toMenu() {
//		if (!isEditable()) { // se nao for editavel é porque tem de ser criado
//			Shelf shelf = shelfBean.getShelf();
//			
//			DB_bean.getSHELF_REPOSITORY().create(shelf);
//			long sId = shelf.getId();
//			Long pId = shelf.getProductId();
//			if (pId!=null) {
//				ProductService.consult(pId).getShelfId().add(sId);
//			}
//			
//		} else if (isEditable()) { // se for editavel faz-se update
//			shelfBean.getShelf().setId(this.shelfId);
//			Shelf shelf = shelfBean.getShelf();
//			long sId = shelf.getId();
//			Long pId = shelf.getProductId();
//			if (pId!=null) {
//				ProductService.consult(pId).getShelfId().add(sId);
//			}
//			
//			DB_bean.getSHELF_REPOSITORY().update(shelf);
//			this.editable = false;
//		}
//		// return "product-menu?faces-redirect=true";
//	}
//
//	public void remove(Shelf shelf) {
//		DB_bean.getSHELF_REPOSITORY().remove(shelf.getId());
//	}
//
//	public Collection<Shelf> consult() {
//		return DB_bean.getSHELF_REPOSITORY().consult();
//	}
//
//	public Shelf consult(long id) {
//		return DB_bean.getSHELF_REPOSITORY().consult(id);
//	}

}
