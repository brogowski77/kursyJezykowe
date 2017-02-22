package pl.brogowski77.primefaces.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import pl.brogowski77.primefaces.domain.Course;;

@ManagedBean(name = "courseService")
public class CourseService {
	private final static String[] languages;
	private final static String[] lectors;
	private final static String[] standards;
	private final static String[] lengths;
	static {
		languages = new String[5];
		languages[0] = "Angielski";
		languages[1] = "Niemiecki";
		languages[2] = "Japoński";
		languages[3] = "Hiszpański";
		languages[4] = "Norweski";

		lectors = new String[8];
		lectors[0] = "Jan Kowalski";
		lectors[1] = "Timothy Smith";
		lectors[2] = "Hans Braun";
		lectors[3] = "Eizo Fujimoto";
		lectors[4] = "Carlos Ramos";
		lectors[5] = "Laura Dern";
		lectors[6] = "Anna Nowak";
		lectors[7] = "Klaudia Pawlak";

		standards = new String[3];
		standards[0] = "początkujący(A)";
		standards[1] = "średnio zaawanosowany(B)";
		standards[2] = "zaawansowany(C)";

		lengths = new String[2];
		lengths[0] = "3 miesiące";
		lengths[1] = "6 miesięcy";
	}

	public List<Course> createCourses() {
		List<Course> courses = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			courses.add(new Course(i, languages[0], standards[i - 1], lengths[0], lectors[i + 4]));
		}
		for (int i = 1; i < 4; i++) {
			courses.add(new Course(i + 3, languages[0], standards[i - 1], lengths[1], lectors[i - 1]));
		}
		for (int i = 1; i < 5; i++) {
			courses.add(new Course(i + 6, languages[i], standards[0], lengths[1], lectors[i + 1]));
		}
		for (int i = 1; i < 5; i++) {
			courses.add(new Course(i + 10, languages[i], standards[1], lengths[0], lectors[i + 1]));
		}
		for (int i = 1; i < 5; i++) {
			courses.add(new Course(i + 14, languages[i], standards[2], lengths[0], lectors[i + 1]));
		}

		return courses;

	}

}
