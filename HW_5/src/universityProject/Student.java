package universityProject;

import java.util.List;

public class Student {

	private int id;
	private String name;
	
	private Project p;
	private List<Course> courseList;
	private List<Exam> examList;
	
	public Student(int id, String name, Project p) {
		this.id = id;
		this.name = name;
		this.p = p;
	}

	public String getName() {
		return name;
	}

	public Project getProject() {
		return p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
