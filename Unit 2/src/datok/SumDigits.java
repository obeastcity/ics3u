package datok;

import java.util.Scanner;
/***
 * SumDigits.java
 * MY UNIT 2 PROJECT-sumdigits
 * 03/31/17
 * @author Sonam Datok
 */
public class SumDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, please enter a number");
		int x = scan.nextInt();
		System.out.println("The sum of your numbers digit(s) is..."+ sumdigits(x));
		
	}
	/**
	 * returns the sum of the user's chosen digits
	 * @param x
	 * @return
	 */
	public static int sumdigits(int x){
		int total = 0;
		while(x>0){
			total = total + x%10;
			x=x/10;
		}
		return total;
		}
	}


