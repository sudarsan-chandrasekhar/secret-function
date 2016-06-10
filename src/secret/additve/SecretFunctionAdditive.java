package secret.additve;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * This will display prime numbers less than the user input and determines
 * if sets of prime numbers in the list are additive
 * @author Sudarsan Chandrasekhar
 * @version 06/09/2016
 */

public class SecretFunctionAdditive {
	public ArrayList<Integer> primeNumbers;
	
	/**
	 * initializes array
	 */
	
	public SecretFunctionAdditive() {
		
		this.primeNumbers = new ArrayList<Integer>();
	}
	
	/**
	 * displays user input by calling appropriate method
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter your number");
		new SecretFunctionAdditive().userInputDisplay();	
	}
	
	/**
	 * Displays user input and list of prime numbers less than the user input
	 */
	
	public void userInputDisplay() {
		
		int userNumber = new Scanner(System.in).nextInt();
		System.out.println("List of Prime Numbers less than user input");
		
			for(int i = 2; i < userNumber; i++) {
				
				if (isPrime(i)) {
					primeNumbers.add(i);
			}	
			}
			
			System.out.println(primeNumbers);
			
			if(primeNumbers.size() <= 1) {
				
				System.out.println("There must be at least 2 prime numbers below user input.");
				System.exit(0);
			}
			
			if(isAdditive(this.primeNumbers)) {
				
				 System.out.println("Additive test successful.");
			 }else {
				 
					System.out.println("Additive test failed");
					System.exit(0);
				}	 
	}
	
	/**
	 * This method proves whether values are additive
	 */
	
	public boolean isAdditive(ArrayList<Integer> primeNumbers) {
		ArrayList<Integer> usedNumbers = new ArrayList<Integer>();
		 for(int x: primeNumbers) {
			 
			 for(int y: primeNumbers) {
				 if(!usedNumbers.contains(y)) {
					 int additiveLeft = secret(x+y);
					 int additiveRight = secret(x) + secret(y);
					 
					 if(additiveLeft != additiveRight) {
						 
						 return false;
					 } 
				 }	
				 }
			 usedNumbers.add(x);
				
		 }
		
		return true;
	}
	/**
	 * This method will be used to test whether two numbers are additive
	 * @param number prime number
	 * @return number
	 */
	
	 public static int secret(int numbers) { 
		 
		 return numbers;
	    }
	
	/**
	 * determines if a number is prime 
	 * @param number number that is being verified
	 * @return true
	 */
	
	public static boolean isPrime(int number) {
		
		for (int i = 2; i < number; i++) {
			
			if(number % i == 0) {
				return false;
			}	
		}
		
		return true;
	}
	

}
