package universityProject;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private int id, maxCapacity;
	private String name;
	private boolean isFull;
	
	//additionally added
	public int lengthOfCourse;
	private TA ta;
	private List<TA> talist;

	private List<Project> projects;
	private List<Exam> exams;
	private Department d;
	private List<Professor> profs;
	
	public Course(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
		
		profs.add(prof);
	}
	
	public void enroll(Student student) {
		
	}
	
	public void apply(TA ta) {
		talist.add(ta);
	}
	
	public void setMaxCap(int max) {
		this.maxCapacity = max;
	}
	
	public List<Professor> getProf() {
		return profs;
	}
	
	public void addProf(Professor p) {
		if(profs.size() < 3) {
			profs.add(p);
		}
	}
	
	public TA getTA() {
		return ta;
	}
	
	public void setTA(TA ta) {
		this.ta = ta;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<TA> getTalist() {
		return talist;
	}
}
