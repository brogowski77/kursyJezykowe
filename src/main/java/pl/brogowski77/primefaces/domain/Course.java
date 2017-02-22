package pl.brogowski77.primefaces.domain;

public class Course {
	private Integer Id;
	private String language;
	private String standard;
	private String length;
	private String lector;

	public Course(Integer id, String language, String standard, String length, String lector) {
		super();
		Id = id;
		this.language = language;
		this.standard = standard;
		this.length = length;
		this.lector = lector;
	}

	public Course() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getLector() {
		return lector;
	}

	public void setLector(String lector) {
		this.lector = lector;
	}

}
