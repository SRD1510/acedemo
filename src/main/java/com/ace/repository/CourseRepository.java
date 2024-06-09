package com.ace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ace.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
  
    List<Course> findByTopicContainingIgnoreCase(String topic);
    List<Course> findByTopicAndCostContainingIgnoreCase(String topic,String cost); 

  }
