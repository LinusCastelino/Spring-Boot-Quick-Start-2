package com.linus.restprac.model.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}    //getAllTopics()
	
	@RequestMapping("/topics/{topicId}/course/{courseId}")
	public Course getTopic(@PathVariable("courseId") int id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addTopic(@RequestBody Course course, @PathVariable("topicId") int topicId) {
		course.getTopic().setId(topicId);
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
	public void updateTopic(@PathVariable("topicId") int id, @RequestBody Course course) {
		course.getTopic().setId(id);
		courseService.updateCourse(id, course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
	public void deleteTopic(@PathVariable Integer id)     //Spring automatically maps path variable to method param if they have the same name 
	{
		courseService.deleteCourse(id);
	}
}    //TopicsController
