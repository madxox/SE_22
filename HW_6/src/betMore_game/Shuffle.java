package betMore_game;

import java.util.Random;

public class Shuffle {

	public int x;
	
	public int pick_card() {
		Random r = new Random();
		int x = r.nextInt(1,101);
		return x;
	}

}
