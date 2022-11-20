package betMore_game;

import java.util.Scanner;

public class Player {

	private String name;
	private boolean user_selected = false;
	private int x;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void start() {
		
		BetMore_Game bet = new BetMore_Game();
		Scanner s = new Scanner(System.in);
		int i = 0;
		
		if(this.name.toLowerCase().equals("computer")) {
			this.x = bet.play();
		}
		else {
			if(user_selected==false) {
				while(i < 5) { 
					this.x = bet.play();
					System.out.println("You got the card number "+x);
					System.out.println("Do you want to pick another card? (y/n)");
					String a = s.nextLine();
					if(a.equals("n")) {
						user_selected = true;
						break;
					}
					else if(a.equals("y")) {
						i++;
					}
				}
			}
		}
		
	}

	public int getX() {
		return x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
