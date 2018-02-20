package com.linus.restprac.model.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
	public List<Course> getAllCourses(int topicId){
		List<Course> allCourses = new ArrayList<>();;
		courseRepo.findByTopicId(topicId).forEach(allCourses::add);
		return allCourses;
	}
	
	public Course getCourse(int id) {
		return courseRepo.findOne(id);
	}
	
	public void addCourse(Course topic) {
		courseRepo.save(topic);
		//If an entity with the given ID is not available in the DB
		//CrudRepository.save() inserts it into the DB.
	}
	
	public void updateCourse(int id, Course course) {
		courseRepo.save(course);
		//If an entity with the given ID is available in the DB
		//CrudRepository.save() updates the entity in the DB.
	}
	
	public void deleteCourse(int id) {
		courseRepo.delete(id);
	}
	
}    //TopicService
