package com.linus.restprac.model.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity    //To inform spring that Topic maps to a relational database
public class Topic {
	
	@Id    //To inform spring that id attribute in this class is a primary key
	private int id;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	
	public Topic(String name, int id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
