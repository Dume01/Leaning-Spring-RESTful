package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
		
		@Autowired
		private CourseService courseService;
	
		@GetMapping("/home")
		public String home()
		{
			return "This is home page";
		}
		
		//get the course
		
		@GetMapping("/courses")
		public List<Course> getCourses()
		{
			return this.courseService.getCourse();
		}
		
		//Get single Course
		@GetMapping("/courses/{courseId}")
		public Course getCourses(@PathVariable String courseId)
		{
			return this.courseService.getCourse(Long.parseLong(courseId));
		}
		
		//Adding a course
		@PostMapping("/courses")
		public Course addCourse(@RequestBody Course course)
		{
			return this.courseService.addCourse(course);
		}
		
		//Updating a course
		
		@PutMapping("/courses")
		public String updateCourse(@RequestBody Course course)
		{
			return this.courseService.updateCourse(course);
		}
		
		//deleting a course by ID
		@DeleteMapping("/courses/{Id}")
		public String deleteCourse(@PathVariable String Id)
		{
			return this.courseService.deleteCourse(Long.parseLong(Id));
		}
		
		
}
