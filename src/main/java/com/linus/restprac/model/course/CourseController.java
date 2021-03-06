package com.linus.restprac.model.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.linus.restprac.model.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable int topicId){
		return courseService.getAllCourses(topicId);
	}    //getAllTopics()
	
	@RequestMapping("/topics/{topicId}/course/{courseId}")
	public Course getTopic(@PathVariable("courseId") int id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addTopic(@RequestBody Course course, @PathVariable("topicId") int topicId) {
		Topic topic = new Topic(topicId,"","");
		course.setTopic(topic);
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
	public void updateTopic(@PathVariable("topicId") int id, @RequestBody Course course) {
		Topic topic = new Topic(id,"","");
		course.setTopic(topic);
		courseService.updateCourse(id, course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
	public void deleteTopic(@PathVariable Integer id)     //Spring automatically maps path variable to method param if they have the same name 
	{
		courseService.deleteCourse(id);
	}
}    //TopicsController
