package universityProject;

import java.util.List;

public class Project {

	private String name;
	//additional
	private Course c;
	private List<Student> membersList;
	
	public Project(String name, Course c) {
		this.name = name;
		this.c = c;
	}
	
	public void addMember(Student student){
		membersList.add(student);
	}
	
	public List<Student> getMembers() {
		return membersList;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
