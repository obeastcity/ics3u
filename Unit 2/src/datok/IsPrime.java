package datok;

import java.util.Scanner;
/***
 * IsPrime.java
 * MY UNIT 2 PROJECT-isPrime
 * 03/31/17
 * @author Sonam Datok
 */
public class IsPrime{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, please enter the integer you want.");
		int primeNum = scan.nextInt();

		if (isPrime(primeNum)){
			System.out.println("It is prime. ");
		}else {
			System.out.println("It is not prime. ");
			}
		}
		/**
		 * determines whether or not the user's inputed number is a prime number
		 * @param x the number that will be inputed
		 * @return whether the number is prime or not (true or false)
		 */
		public static boolean isPrime(int x){
			if (x<1){
				return false;
			}else{
				int prime = x;
				return isDivisible(prime, x);
			}

		}
		/**
		 * Finds out if a number can be divided by another number other than itself and one
		 * @param a the first number to be divided
		 * @param b the main number that remains constant
		 * @return true or false
		 */
		public static boolean isDivisible(int incrementedVariable, int originalValue){
			for (int i = 2; i < (incrementedVariable-1); i++){
				originalValue = incrementedVariable % i;

				if (originalValue ==0){
					return false;
				}
			}
			return true;


		}

	
	}
