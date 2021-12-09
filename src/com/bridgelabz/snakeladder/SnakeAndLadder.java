package com.bridgelabz.snakeladder;

import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
    	int position = 0;
	System.out.println("Player at Starting Position: " + position);
		
	// taking random input for Generating number between 1 to 6
	Random rd = new Random();
	int diceValue = rd.nextInt(6) + 1;
	System.out.println("Getting number when you roll a die: " + diceValue);
    }
}
