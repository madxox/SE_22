package betMore_game;

public class Game_Chair {

	public static void main(String [] args) {
		System.out.println("Game START");
		Player computer = new Player("Computer");
		computer.start();
		
		Player player_2 = new Player("Player_2");
		player_2.start();
		
		BetMore_Game bet = new BetMore_Game();
		System.out.println(bet.findWinner(computer, player_2).getName()+" is the winner!");
	}
	
	
}
