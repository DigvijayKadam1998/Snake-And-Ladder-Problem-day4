package com.bridgelabz.snakeladder;

import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
    	int position = 0;
	System.out.println("Player at Starting Position: " + position);
		
	// taking random input for Generating number for disc between 1 to 6
	Random rd = new Random(); 
	int diceValue = rd.nextInt(6)+1;
	System.out.println("Getting number when you roll a die: " + diceValue);
		
	// by using if else condition check for option no play, ladder, snake
	int checkOption = rd.nextInt(3);
		
	if(checkOption == 0) {
	    System.out.println("No Play");
	}
	else if(checkOption == 1) {
	    position += diceValue;		//position = position + diceValue;
	    System.out.println("Ladder");
	    System.out.println("Your Current Position is: " + position);
	}
	else {
	    position -= diceValue;
	    System.out.println("Snake");
	    System.out.println("Your Current Position is: " + position);
	}
    }
}
