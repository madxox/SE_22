package universityProject;

import java.util.List;

public class Exam {

	private int maxValue;
	private List<Integer> registeredList;
	
	private List<Question> questions;
	
	private List<TA> taList;
	private List<Professor> professors;
	
	public Exam(List<Question> questions) {
		this.questions = questions;
	}
	
	public void addQuestion(int id, String task, int value) {
		questions.add(new Question(id, task, value));
	}
	
	public void registerStudent(Student s) {
		registeredList.add(s.getId());
	}
	
	public boolean register(Student student) {
		return registeredList.contains(student.getId());
	}
	
	public List<Integer> getRegisteredStudents() {
		return registeredList;
	}
	
	public void setMaxValue(int max) {
		this.maxValue = max;
	}
	
	
}
