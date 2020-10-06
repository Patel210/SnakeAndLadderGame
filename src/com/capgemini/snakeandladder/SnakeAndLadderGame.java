package com.capgemini.snakeandladder;

public class SnakeAndLadderGame {
	private static int position = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;

	public static void main(String[] args) {
		System.out.println("Player at Start Position: " + position);

		while (position != 100) {
			int numberOnDie = (int) ((Math.random()) * 6) + 1; // Die Roll

			int checkPlay = (int) Math.floor(Math.random() * 10) % 3; // Check Play Options
			if (checkPlay == LADDER) {
				System.out.println("Horray! You got a ladder!");
				position += numberOnDie;

				if (position > 100) { // To restrict player from position > 100
					position -= numberOnDie;
				}

			} else if (checkPlay == SNAKE) {
				System.out.println("Bummer! You got a snake!");
				position -= numberOnDie;

				if (position <= 0) {
					position = 0; // To restrict player from position > 100
				}
			}
		}
		System.out.println("Player reached: " + position);
	}
}
