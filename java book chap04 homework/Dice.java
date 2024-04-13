package chap04;

import java.util.Random;

public class Dice {
	private int face;
	
	public double roll() {
		Random random = new Random();
		return random.nextDouble();
	}
}
