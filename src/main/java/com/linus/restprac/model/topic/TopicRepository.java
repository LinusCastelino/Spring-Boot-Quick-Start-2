package com.linus.restprac.model.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
	//CrudRepository comes with Spring data JPA
	//it includes method based implementations of all the basic db CRUD operations
	//CurdRepository<Entity type, Entity ID type>
}
