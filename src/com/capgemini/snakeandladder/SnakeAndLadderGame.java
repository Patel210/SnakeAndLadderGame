package com.capgemini.snakeandladder;

public class SnakeAndLadderGame {
	private static int position = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;

	public static void main(String[] args) {
		System.out.println("Player at Start Position: " + position);

		int numberOnDie = (int) ((Math.random()) * 6) + 1;
		
		int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
		if (checkPlay == LADDER) {
			System.out.println("Horray! You got a ladder!");
			position += numberOnDie;
		}
		else if (checkPlay == SNAKE) {
			System.out.println("Bummer! You got a snake!");
			position -= numberOnDie;
		}

		System.out.println("Postition after playing the die: " + position);
	}
}
