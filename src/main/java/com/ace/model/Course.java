package com.ace.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Courses")
public class Course {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

    @Column(name = "topic")
    private String topic;

    @Column(name = "course")
    private String course;

    @Column(name = "language")
    private String language;

    @Column(name = "duration")
    private String duration;

    @Column(name = "cost")
    private String cost;

    @Column(name = "experience")
    private String experiance;

    public Course() {

    }
    public Course(String topic, String course, String language, String duration,String cost, String experiance) {
        this.topic = topic;
        this.course = course;
        this.language = language;
        this.duration = duration;
        this.cost = cost;
        this.experiance = experiance;
      }




      public long getId() {
        return id;
      }


  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public String getCourse() {
    return course;
  }


  public void setCourse(String course) {
    this.course = course;
  }


  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public String getCost() {
    return cost;
  }


  public void setCost(String cost) {
    this.cost = cost;
  }


  public String getExperiance() {
    return experiance;
  }


  public void setExperiance(String experiance) {
    this.experiance = experiance;
  }

      
}