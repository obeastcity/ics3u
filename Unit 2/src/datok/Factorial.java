package datok;

import java.util.Scanner;
/***
 * Factorial.java
 * MY UNIT 2 PROJECT-factorial
 * 03/31/17
 * @author Sonam Datok
 */
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, please enter a number");
		String s = scan.nextLine();
		int x = Integer.parseInt(s);
		System.out.println("The factorial of your number is..."+ factorial(x));
		
	}
	/**
	 * returns the factorial of the user's chosen number
	 * @param x
	 * @return
	 */
	public static int factorial(int x){
		int total = x;
		if (x < 0){
			return -1;
		}else if (x == 0){
			return 1; 
		}else{
		while (x>1){
			total = total * (x-1);
			x--	 ;
		}
		return total;
		}
	}

}
