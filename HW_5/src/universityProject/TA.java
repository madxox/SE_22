package universityProject;

import java.util.List;

public class TA {

	private String name;
	
	List<Course> courses;
	List<Exam> exams;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourse() {
		return courses;
	}
	
	public void extendContract(Course course) {
		course.lengthOfCourse += 1;
	}
}
