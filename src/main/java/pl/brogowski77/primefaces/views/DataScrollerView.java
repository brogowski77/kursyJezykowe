package pl.brogowski77.primefaces.views;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import pl.brogowski77.primefaces.domain.CourseType;
import pl.brogowski77.primefaces.service.CourseTypeService;
 
@ManagedBean(name="dataScrollerView")
public class DataScrollerView {
     
    private List<CourseType> courseTypes;
         
    @ManagedProperty("#{courseTypeService}")
    private CourseTypeService service;
     
    @PostConstruct
    public void init() {
        courseTypes = service.createCourseTypes();
    }
 
    public List<CourseType> getCourseTypes() {
        return courseTypes;
    }
 
    public void setService(CourseTypeService service) {
        this.service = service;
    }
}
