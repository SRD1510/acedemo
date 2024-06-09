package com.ace.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ace.model.Course;
import com.ace.repository.CourseRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CoursesController {

     @Autowired
     CourseRepository courseRepository;



    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses(@RequestParam(required = false) String topic) {
    try {
      List<Course> courses = new ArrayList<Course>();

      System.out.println("topic.."+topic);

      if (topic == null)
      courseRepository.findAll().forEach(courses::add);
      else
      courseRepository.findByTopicContainingIgnoreCase(topic).forEach(courses::add);

      if (courses.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(courses, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }    

  @GetMapping("/coursesbycost")
    public ResponseEntity<List<Course>> getAllCoursesByCost(@RequestParam(required = false) String topic,String language,String duration,String cost,String experience) {
    try {
      List<Course> courses = new ArrayList<Course>();

      System.out.println("topic.."+topic);

      if(topic !=null && cost!=null){
      courses = courseRepository.findByTopicContainingIgnoreCase(topic);
      System.out.println("courses.."+courses);

      List<Course> filteredCourses = courses.stream()
            .filter(course -> course.getCost().equalsIgnoreCase(cost))
            .filter(course -> course.getLanguage().equalsIgnoreCase(language))
            .filter(course -> course.getDuration().equalsIgnoreCase(duration))
            .filter(course -> course.getExperiance().equalsIgnoreCase(experience))
            .collect(Collectors.toList());

            return new ResponseEntity<>(filteredCourses, HttpStatus.OK);
      }


      if (courses.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(courses, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  } 


    @PostMapping("/add")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
    try {
       
      Course _tcourse = courseRepository.save( new Course(course.getTopic(),course.getCourse(),course.getLanguage(),course.getDuration(),course.getCost(),course.getExperiance()));
      return new ResponseEntity<>(_tcourse, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}

