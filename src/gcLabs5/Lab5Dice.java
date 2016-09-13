/**
 * 
 */
package gcLabs5;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Kimberli
 *
 */
public class Lab5Dice {

	/**
	 * @param args
	 */
	private static Scanner k;

	public static void main(String [] args){
		  		
		String choice = "y";
		int side;
		
	  System.out.println("Welcome!  Roll dice? y/n");
		k = new Scanner(System.in);
		choice = k.nextLine();
		
		do{//begin do/while loop
			System.out.println("How many sides on your dice?: ");
			side = k.nextInt();
			System.out.println();
			
			
			//call method rollDice
			Lab5Dice.rollDice(side);	//className.methodName(number of sides of dice); this is where you pass the info
			
		    //continue prompt
			System.out.println("Roll again?");
			k.nextLine();
			
			choice = k.nextLine();	
		//end do/while loop	
		}while (choice.equals("y"));

	}//psvm
	  
	//this is my rollDice method; it tells program what to do with dice and how to do it; this is the info to pass	
	static void rollDice(int side){ //type output methodName(declare integer for number of sides of dice);
		int a = (int)(Math.random()* side)+1; //using the Math.random method * number of sides + minimum number
		int b = (int)(Math.random()* side)+1;
		int c = a + b;
		System.out.println("dice 1: "+ a);
		System.out.println("dice 2: " +b);
		System.out.println("total : " +c);
	

		}//end rollDice Method	
	}//end public class Lab5Dice
	

