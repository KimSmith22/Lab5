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

	public static final void main(String... aArgs){
		  
		int side;
		String choice = "y";
		
	  System.out.println("Welcome!  Roll dice? y/n");
		k = new Scanner(System.in);
		choice = k.nextLine();
		
		do{
			System.out.println("How many sides on your dice?: ");
			side = k.nextInt();
			System.out.println();
			
			Random randomGenerator = new Random();
		    for (int i = 1; i <= 2; ++i){
		      int randomInt = randomGenerator.nextInt(side);
		      System.out.println(" " + randomInt);
		      
		}
			System.out.println("Roll again?");
			k.nextLine();
			
			choice = k.nextLine();	    
		}while (choice.equals("y"));
	  
	}
	
}
