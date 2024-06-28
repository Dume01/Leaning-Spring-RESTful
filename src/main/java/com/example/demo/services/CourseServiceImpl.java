package com.example.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	public CourseServiceImpl()
	{
		
	}
	
	@Override
	public List<Course> getCourse() {
//		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}

	@Override
    public Course getCourse(long id) {
        Optional<Course> entityOptional = courseDao.findById(id);
        if (entityOptional.isPresent()) {
            return entityOptional.get();
        } else {
            throw new RuntimeException("Course not found with id: " + id);
        }
    }

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public String updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		int f=0;
//		for(Course co:list)
//		{
//			if(co.getId()==course.getId())
//			{
//				co.setDescription(course.getDescription());
//				co.setTitle(course.getTitle());
//				f=1;
//				break;
//			}
//		}	
		courseDao.save(course);
		return "Updating Done";
	}

	@Override
    public String deleteCourse(long id) {
        Optional<Course> entityOptional = courseDao.findById(id);
        if (entityOptional.isPresent()) {
            courseDao.delete(entityOptional.get());
            return "Deleting Done";
        } else {
            return "Course Not Present";
        }
    }


}
