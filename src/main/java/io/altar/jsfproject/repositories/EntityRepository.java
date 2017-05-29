package io.altar.jsfproject.repositories;

import java.util.Collection;
import java.util.HashMap;

import io.altar.jsfproject.model.Entity;

public class EntityRepository <E extends Entity> { //E sera product ou shelf
	
	private HashMap<Long, E> m1 = new HashMap<>();
	public HashMap<Long, E> getM1() {
		return m1;
	}

	private long maiorId = 0;
	
	public long getMaiorId() {
		return maiorId;
	}
	
	private Long nextId(){ 
		return ++maiorId;
	}
 
	public void create(E e) {
		e.setId(this.nextId());
		this.m1.put(e.getId(), e);
	}
	
	public Collection<E> consult(){ 
		return this.m1.values();
	}
	
	public E consult( long id){
		return this.m1.get(id);
	}
	
	public void update(E e){ 
		this.m1.put(e.getId(), e);
	}
	
	public void remove(long Id){
		this.m1.remove(Id);
	}
	
	public boolean has(){ //produto ou prateleira
		if (consult().size() == 0) {
			return false;
		} else{
			return true;
		}
	}
}