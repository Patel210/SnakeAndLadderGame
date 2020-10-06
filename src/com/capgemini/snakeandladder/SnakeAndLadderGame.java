package com.capgemini.snakeandladder;

public class SnakeAndLadderGame {
	private static int positionPlayer1 = 0;
	private static int positionPlayer2 = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	
	public static void main(String[] args) {
		boolean player1Plays = false;
		int toss = (int) (Math.random() * 10) % 2;

		if (toss == 1) {
			player1Plays = true;
		}

		while (positionPlayer1 != 100 && positionPlayer2 != 100) {
			if (player1Plays) {
				int numberOnDie = (int) ((Math.random()) * 6) + 1; // Die Roll
				int checkPlay = (int) Math.floor(Math.random() * 10) % 3; // Check Play Options

				switch (checkPlay) {
				case LADDER:
					System.out.println("Horray Player1 ! You got a ladder!");
					positionPlayer1 += numberOnDie;

					if (positionPlayer1 > 100) { // To restrict player from position > 100
						positionPlayer1 -= numberOnDie;
					}
					break;

				case SNAKE:
					System.out.println("Bummer Player1! You got a snake!");
					positionPlayer1 -= numberOnDie;

					if (positionPlayer1 <= 0) {
						positionPlayer1 = 0; // To restrict player from position > 100
					}
					player1Plays = false;
					break;
					
				default:
					System.out.println("Bummer Player1! You got no play!");
					player1Plays = false;
				}
				System.out.println("Player1 position: "+positionPlayer1);
			}

			else {
				int numberOnDie = (int) ((Math.random()) * 6) + 1; // Die Roll
				int checkPlay = (int) Math.floor(Math.random() * 10) % 3; // Check Play Options

				switch (checkPlay) {
				case LADDER:
					System.out.println("Horray Player2! You got a ladder!");
					positionPlayer2 += numberOnDie;

					if (positionPlayer2 > 100) { // To restrict player from position > 100
						positionPlayer2 -= numberOnDie;
					}
					break;

				case SNAKE:
					System.out.println("Bummer Player2! You got a snake!");
					positionPlayer2 -= numberOnDie;

					if (positionPlayer2 <= 0) {
						positionPlayer2 = 0; // To restrict player from position > 100
					}
					player1Plays = true;
					break;

				default:
					System.out.println("Bummer Player2! You got no play!");
					player1Plays = true;
				}
				System.out.println("Player2 position: "+positionPlayer2);
			}
		}
		
		if (positionPlayer1 == 100) {
			System.out.println("Player 1 won the game");
		}
		
		else {
			System.out.println("Player 2 won the game");
		}
	}
}
