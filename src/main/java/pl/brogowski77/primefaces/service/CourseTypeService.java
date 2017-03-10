package pl.brogowski77.primefaces.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import pl.brogowski77.primefaces.domain.CourseType;
@ManagedBean(name = "courseTypeService")
public class CourseTypeService {
	private final static String[] languages;
	private final static String[] lengths;
	private final static String[] messages;
	private final static String[] images;
	private final static String[] standards;

	static {
		lengths = new String[2];
		lengths[0] = "3 miesiące";
		lengths[1] = "6 miesięcy";

		messages = new String[3];
		messages[0] = "Ten kurs przeznaczony jest dla osób, które dopiero zaczynają przygodę z językiem obcym";
		messages[1] = "Ten kurs jest odpowiedni dla osób, które znają podstawy i chcą podszkolić znajomość języka";
		messages[2] = "Ten kurs jest idealny dla osób, które znają już język, ale chcą go jeszcze lepiej podszkolić";

		standards = new String[3];
		standards[0] = "A1-A2";
		standards[1] = "B1-B2";
		standards[2] = "C1-C2";

		languages = new String[5];
		languages[0] = "Angielski";
		languages[1] = "Niemiecki";
		languages[2] = "Japoński";
		languages[3] = "Hiszpański";
		languages[4] = "Norweski";

		images = new String[5];
		images[0] = "/download/gb.jpg";
		images[1] = "/download/de.jpg";
		images[2] = "/download/jp.jpg";
		images[3] = "/download/sp.jpg";
		images[4] = "/download/no.jpg";
	}

	public List<CourseType> createCourseTypes() {
		List<CourseType> courseTypes = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			courseTypes.add(new CourseType(languages[0], standards[i], messages[i], "599zł", lengths[0], images[0]));
			courseTypes.add(new CourseType(languages[0], standards[i], messages[i], "1099zł", lengths[1], images[0]));
		}
		
		for (int i = 1; i < 5; i++) {
			courseTypes.add(new CourseType(languages[i], standards[0], messages[0], "699zł", lengths[0], images[i]));
			courseTypes.add(new CourseType(languages[i], standards[0], messages[0], "1299zł", lengths[1], images[i]));
		}

		return courseTypes;

	}

}
