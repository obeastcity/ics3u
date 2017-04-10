package datok;

import java.util.Scanner;
/***
 * LargestNumber.java
 * MY UNIT 2 PROJECT-largestnumber
 * 03/31/17
 * @author Sonam Datok
 */
public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, please enter the amount of integers you want.");
		int x = scan.nextInt();
		int [] num = new int[x];
		System.out.println("Please enter the numbers.");
		for (int a = 0; a < x; a++ ){
			num[a] = scan.nextInt();
		}
		System.out.println("You have entered the maximum amount.");
		int z = largestNumber(num);
		System.out.println("The largest number is "+z);
	}
	/**
	 * returns the largest number of the user's chosen digits
	 * @param x
	 * @return
	 */
	public static int largestNumber(int []num){
		int y = num[0];
		for(int i = 1;i<num.length;i++){
			y = Math.max(y, num[i]);
		
		}
		
		return y;
		}
	}
