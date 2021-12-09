package com.bridgelabz.snakeladder;

import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
    	int position = 0;
    	final int WINNING_POSITION = 100;
    	System.out.println("Player at Starting Position: " + position);
		
    	while(position <= WINNING_POSITION ) {
			
    	    Random rd = new Random();
    	    int diceValue = rd.nextInt(6)+1;
    	    System.out.println("Getting number when you roll Dice: " + diceValue);
		
    	    int checkOption = rd.nextInt(3);
    	    if(checkOption == 0) {
    		System.out.println("No Play");
    	    }
    	    else if(checkOption == 1) {
    		position += diceValue;
    		System.out.println("Ladder");
    		System.out.println("Your Current Position is: " + position);
    	    }
    	    else if (checkOption == 2){
    		position -= diceValue;
    		System.out.println("Snake");
    		System.out.println("Your Current Position is: " + position);
    	    }
    	    if (position < 0) {
    		position = 0;
    		System.out.println("Current Position is ==>" + position);
    	    }
        }
    }
}
