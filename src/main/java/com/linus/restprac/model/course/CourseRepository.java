package com.linus.restprac.model.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
	//CrudRepository comes with Spring data JPA
	//it includes method based implementations of all the basic db CRUD operations
	//CurdRepository<Entity type, Entity ID type>

	
	//To create a custom data access method (one that is not provided by default by Spring data JPA)
	//declare an abstract method in the repository interface in the following format
	//'find'-'By'-<propertyName>-<sub-property of the preceeding property> (ingore hyphens and inverted commas)
	public List<Course> findByTopicId(int id);
	//Implemention for this method is provided by Spring JPA at runtime.
	
	}
