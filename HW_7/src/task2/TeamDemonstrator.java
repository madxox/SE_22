package task2;

public class TeamDemonstrator {

	public static void main(String [] args) {
		TeamComposite olympicT = new TeamComposite("Olympics Teams");
		TeamComposite asiaT = new TeamComposite("Asia Team");
		TeamComposite africaT = new TeamComposite("Africa Team");
		TeamComposite europeT = new TeamComposite("Europe Team");
		TeamComposite southAmericaT = new TeamComposite("South America Team");
		TeamComposite chinaT = new TeamComposite("China Team");
		TeamComposite afghanT = new TeamComposite("Afghanistan Team");
		TeamComposite germanyT = new TeamComposite("Germany Team");
		TeamComposite italyT = new TeamComposite("Italy Team");
		
		TeamComposite chinaW = new TeamComposite("China Women's Team");
		TeamComposite chinaM = new TeamComposite("China Men's Team");
		TeamComposite germanyW = new TeamComposite("Germany Women's Team");
		TeamComposite germanyM = new TeamComposite("Germany Men's Team");
		TeamComposite italyW = new TeamComposite("Italy Women's Team");
		TeamComposite italyM = new TeamComposite("Italy Men's Team");
		
		chinaW.add(new TeamDiscipline("Taekwondo", 2, 1));
		chinaW.add(new TeamDiscipline("Waterpolo", 3, 1));
		chinaW.add(new TeamDiscipline("Artistic Gymnastics", 4, 1));
		chinaM.add(new TeamDiscipline("Shooting", 5, 1));
		
		germanyW.add(new TeamDiscipline("Cycling", 2, 1));
		germanyW.add(new TeamDiscipline("Tennis", 3, 1));
		germanyM.add(new TeamDiscipline("Table Tennis", 4, 1));
		germanyM.add(new TeamDiscipline("Football", 5, 1));
		
		italyW.add(new TeamDiscipline("Alpine Sky", 2, 1));
		italyM.add(new TeamDiscipline("Football", 3, 1));
		italyM.add(new TeamDiscipline("Swimming Team", 4, 1));
		
		//Olympic Team
		olympicT.add(asiaT);
		olympicT.add(africaT);
		olympicT.add(europeT);
		olympicT.add(southAmericaT);
		//Europe Team
		europeT.add(germanyT);
		europeT.add(italyT);
		germanyT.add(germanyW);
		germanyT.add(germanyM);
		italyT.add(italyW);
		italyT.add(italyM);
		//Asia Team
		asiaT.add(chinaT);
		chinaT.add(chinaW);
		chinaT.add(chinaM);
		asiaT.add(afghanT);
		
		//a
		System.out.println("A)");
		germanyM.printNumberOfAthletes();
		//b
		System.out.println("B)");
		germanyT.printNumberOfMedals();
		//c
		System.out.println("C)");
		asiaT.printNumberOfMedals();
		//d
		System.out.println("D)");
		olympicT.printNumberOfAthletes();
		
		
		
		
	}
}
