package betMore_game;

public class BetMore_Game {

	public int play() {
		Shuffle s = new Shuffle();
		int x = s.pick_card();
		return x;
	}

	public Player findWinner(Player computer, Player player_2) {
		System.out.println(computer.getX()+" VS "+player_2.getX());
		if(computer.getX() > player_2.getX()) {
			return computer;
		}
		else {
			return player_2;
		}
		
		
	}

}
