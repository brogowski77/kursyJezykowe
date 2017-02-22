package pl.brogowski77.primefaces.views;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import pl.brogowski77.primefaces.domain.Course;
import pl.brogowski77.primefaces.service.CourseService;
 
@ManagedBean(name="dtBasicView")
public class BasicView implements Serializable {
     
    private List<Course> courses;
     
    @ManagedProperty("#{courseService}")
    private CourseService service;
 
    @PostConstruct
    public void init() {
        courses = service.createCourses();
    }
     
    public List<Course> getCourses() {
        return courses;
    }
 
    public void setService(CourseService service) {
        this.service = service;
    }
}
