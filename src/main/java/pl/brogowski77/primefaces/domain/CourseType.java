package pl.brogowski77.primefaces.domain;

public class CourseType {
	private String language;
	private String standard;
	private String message;
	private String price;
	private String length;
	private String image;

	public CourseType(String language, String standard, String message, String price, String length, String image) {
		super();
		this.language = language;
		this.standard = standard;
		this.message = message;
		this.price = price;
		this.length = length;
		this.image = image;
	}

	public CourseType() {
		super();
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
