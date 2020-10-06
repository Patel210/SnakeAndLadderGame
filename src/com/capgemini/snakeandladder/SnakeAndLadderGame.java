package com.capgemini.snakeandladder;

public class SnakeAndLadderGame {
	private static int position = 0;

	public static void main(String[] args) {
		System.out.println("Player at Start Position: " + position);
		
		int numberOnDie = (int) ((Math.random()) * 6) + 1;
		System.out.println("Player rolled: " + numberOnDie);
	}
}
