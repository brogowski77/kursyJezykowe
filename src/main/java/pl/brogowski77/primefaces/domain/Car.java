package pl.brogowski77.primefaces.domain;
/**
 * 
 * Exemplary class used only for tests
 * 
 *
 */
public class Car {
	private Integer id;
	private Integer year;
	private String brand;
	private String color;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(Integer id, Integer year, String brand, String color) {
		super();
		this.id = id;
		this.year = year;
		this.brand = brand;
		this.color = color;
	}

	public Car() {
		super();
	}

}
