package com.bridgelabz.snakeladder;

import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
    	int position = 0;
    	int DiceRollCount = 0;
	final int WINNING_POSITION = 100;
		
	//using while loop
	while(position <= WINNING_POSITION) { 
			
	    Random rand = new Random();
	    int diceValue = rand.nextInt(6)+1;
	    System.out.println("Dice Value is ==> " +diceValue);
	    int option = rand.nextInt(3);
	    DiceRollCount++;
	    if(position == WINNING_POSITION) {
	        System.out.println("<====You Won The Game====>");
	        break;
	    }
			
	    //check condition in switch case 
	    switch(option) {
	    case 0:
		System.out.println("No Play");
		break;
	    case 1:
		System.out.println("Ladder");
		position += diceValue;
		System.out.println("Current Position is ==>" + position);

		if(position > 100) {
		    position = position - diceValue;
		    System.out.println("Current Position is ==>" + position);
		}
		break;
	    case 2:
		System.out.println("Snake");
		position -= diceValue;
		System.out.println("Current Position is ==>" + position);
				
		if(position < 0) {
		    position = 0;
		    System.out.println("Current Position is ==>" + position);
		}
	        break;
	    default:
	        System.out.println("Not Correct");
	    }
	    System.out.println("Dice Roll Count ===>"+DiceRollCount);
	}
    }
}
