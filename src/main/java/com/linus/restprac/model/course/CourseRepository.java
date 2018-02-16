package com.linus.restprac.model.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
	//CrudRepository comes with Spring data JPA
	//it includes method based implementations of all the basic db CRUD operations
	//CurdRepository<Entity type, Entity ID type>
}
