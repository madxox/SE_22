package task2;

public class TeamDiscipline implements TeamComponent {

	private String name;
	private int numberOfAthletes;
	private int numberOfGoldM;
	
	public TeamDiscipline(String name, int na, int ng) {
		this.name = name;
		this.numberOfAthletes = na;
		this.numberOfGoldM = ng;
	}
	
	@Override
	public void printNumberOfAthletes() {
		System.out.println("Team: "+name+" , Number of Athletes: "+numberOfAthletes);
	}

	@Override
	public void printNumberOfMedals() {
		System.out.println("Team: "+name+" , Number of Gold Medals: "+numberOfGoldM);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfAthletes() {
		return numberOfAthletes;
	}

	public void setNumberOfAthletes(int numberOfAthletes) {
		this.numberOfAthletes = numberOfAthletes;
	}

	public int getNumberOfGoldM() {
		return numberOfGoldM;
	}

	public void setNumberOfGoldM(int numberOfGoldM) {
		this.numberOfGoldM = numberOfGoldM;
	}
	
	

}
