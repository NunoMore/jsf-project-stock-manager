package io.altar.jsfproject.model;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public abstract class Entity {
	
	//no arg constructor
	public Entity(){}
	
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

}
