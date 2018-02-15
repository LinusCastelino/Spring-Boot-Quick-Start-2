package com.linus.restprac.model.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepo;
	
	public List<Topic> getAllTopics(){
		List<Topic> allTopics = new ArrayList<>();;
		topicRepo.findAll().forEach(allTopics::add);
		return allTopics;
	}
	
	public Topic getTopic(int id) {
		return topicRepo.findOne(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepo.save(topic);
		//If an entity with the given ID is not available in the DB
		//CrudRepository.save() inserts it into the DB.
	}
	
	public void updateTopic(int id, Topic topic) {
		topicRepo.save(topic);
		//If an entity with the given ID is available in the DB
		//CrudRepository.save() updates the entity in the DB.
	}
	
	public void deleteTopic(int id) {
		topicRepo.delete(id);
	}
	
}    //TopicService
