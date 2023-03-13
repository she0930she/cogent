package com.cogent.batch65_SpringBootOne.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="picnics")
public class Picnic {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String name;
	boolean isVeg;
	int noKids;
	
	public Picnic() {
		super();
	}
	
	public Picnic(int id, String name, boolean isVeg, int noKids) {
		super();
		this.id = id;
		this.name = name;
		this.isVeg = isVeg;
		this.noKids = noKids;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	public int getNoKids() {
		return noKids;
	}
	public void setNoKids(int noKids) {
		this.noKids = noKids;
	}
	
	@Override
	public String toString() {
		return "Picnic [id=" + id + ", name=" + name + ", isVeg=" + isVeg + ", noKids=" + noKids + "]";
	}
	
	
	

}
