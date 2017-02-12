package pl.brogowski77.primefaces.views;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import pl.brogowski77.primefaces.domain.Car;
import pl.brogowski77.primefaces.service.CarService;
 
@ManagedBean(name="dtBasicView")
public class BasicView implements Serializable {
     
    private List<Car> cars;
     
    @ManagedProperty("#{carService}")
    private CarService service;
 
    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }
     
    public List<Car> getCars() {
        return cars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
}
