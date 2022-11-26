package task2;

import java.util.ArrayList;

public class TeamComposite implements TeamComponent{

	private String name;
	private ArrayList<TeamComponent> teamlist;
	
	public TeamComposite(String name) {
		this.name = name;
		teamlist = new ArrayList<TeamComponent>();
	}
	
	public void add(TeamComponent c) {
		teamlist.add(c);
	}
	
	public void remove(TeamComponent c) {
		teamlist.remove(c);
	}
	
	public ArrayList<TeamComponent> getTeam(){
		return this.teamlist;
	}
	
	@Override
	public void printNumberOfAthletes() {
		System.out.println(name); //Name of country, e.g. "China-Women"
		for(TeamComponent t : teamlist) {
			t.printNumberOfAthletes();
		}
	}

	@Override
	public void printNumberOfMedals() {
		System.out.println(name);
		for(TeamComponent t : teamlist) {
			t.printNumberOfMedals();
		}
	}
	
	

}
