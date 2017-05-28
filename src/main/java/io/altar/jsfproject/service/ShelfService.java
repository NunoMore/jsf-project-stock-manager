package io.altar.jsfproject.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jsfproject.model.Shelf;
import io.altar.jsfproject.repositories.DB_bean;

@Named("ShelfService")
@RequestScoped
public class ShelfService {
	
	public void create(Shelf shelf){
		DB_bean.getSHELF_REPOSITORY().create(shelf);
	}
	
	public void update(Shelf shelf){
		DB_bean.getSHELF_REPOSITORY().update(shelf);
	}
	
	public void remove(Shelf shelf) {
		DB_bean.getSHELF_REPOSITORY().remove(shelf.getId());
	}
	
	public Collection<Shelf> consult(){
		return DB_bean.getSHELF_REPOSITORY().consult();
	}
}
