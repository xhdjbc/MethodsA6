import java.util.Scanner;
/**
*
* Name: Zichao Liu
* Teacher: Mr.Hardman
* Assignment 6, Program 3
* Date Last Modified: 12/12/2016
*
*/
/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class A6P3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int userNumber;
		boolean Prime;
		
		System.out.print( "Enter a number as an integer: " );
		userNumber = userInput.nextInt();
		
		Prime = isPrime(userNumber);
		
		if(Prime == true){
			
			System.out.println("This number is prime.");
			
		} else {
			
			System.out.println("This number is not prime.");
			
		}
		
		userInput.close();

	}
	
	public static boolean isPrime(int userNumber){
		boolean prime = true;
		
		for(int i = 2; prime && i <= Math.sqrt(userNumber); i++){
			
			if(userNumber % i == 0){
				
				prime = false;
				
			}
		}
		
		return prime;
		
	}
}
