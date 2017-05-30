package io.altar.jsfproject.model;

import java.io.Serializable;

import io.altar.jsfproject.model.Entity;

@javax.persistence.Entity
public class Shelf extends Entity implements Serializable {
	private static final long serialVersionUID = 1L;
	
//	private enum Location{TOP, MID, BOT};
	private String location;
	private int capacity;
	private long productId;
	private double rentPrice;
	
	//no arg constructor
	public Shelf(){}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public double getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}
}
