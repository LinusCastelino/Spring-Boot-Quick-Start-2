package com.linus.restprac.model.course;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.linus.restprac.model.topic.Topic;

@Entity    //To inform spring that Topic maps to a relational database
public class Course {
	
	@Id    //To inform spring that id attribute in this class is a primary key
	private int id;
	private String name;
	private String description;
	
	private Topic topic;
	
	public Course() {
		
	}
	
	public Course(int id, String name, String description, int topicId) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
		
		this.setTopic(new Topic(topicId,"",""));
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	

}
