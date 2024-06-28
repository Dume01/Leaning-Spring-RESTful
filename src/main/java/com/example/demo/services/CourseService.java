package com.example.demo.services;
import java.util.*;
import com.example.demo.entity.*;
public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public String updateCourse(Course course);
	
	public String deleteCourse(long Id);
	
}
