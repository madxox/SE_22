package universityProject;

import java.util.List;

public class Professor extends Employee{

	public Professor(String name, int employeeId) {
		super(name, employeeId);
	}

	private List<Course> courses;
	
	public void Course() {
		
	}
	
	public void assignTA() {
		TA ta = new TA();
		for(Course c : courses) {
			c.getTalist().add(ta);
		}
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
}
