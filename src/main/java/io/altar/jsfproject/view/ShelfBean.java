package io.altar.jsfproject.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jsfproject.model.Shelf;

@Named("ShelfBean")
@RequestScoped
public class ShelfBean {
	
	private Shelf shelf = new Shelf();

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}
	

}
