package datok;

import java.util.Scanner;
/***
 * PythagoreanTriple.java
 * 04/19/17
 * @author Sonam Datok
 */
public class PythagoreanTriple2 {

	public static void main(String args) {
		Scanner scan = new Scanner(System.in);
		
		for (int a = 1; a <100; a++){
			for (int b = 1; b <100; b++){
				int c = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
				if (perfectSquare(c)==true){
					c= (int)Math.sqrt(c);
					System.out.println(a +" " + b+ " " + c);
				}
			}

		}


	}
	public static boolean perfectSquare(int n){ // determines if c is a perfect square
		int x =(int)Math.sqrt(n);
		double check = Math.pow(x, 2);
		if (check ==n){
			return true;
		}else{
			return false;
		}
	
	}

}
