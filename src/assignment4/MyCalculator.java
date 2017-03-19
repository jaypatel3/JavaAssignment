package assignment4;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			
			int i,j;
			System.out.print("Ener first number = ");
			i = in.nextInt();
			System.out.print("Ener second number = ");
			j = in.nextInt();
			
			MyCalculator e = new MyCalculator();
		e.power(i, j);
	}
	
	public void power(int i, int j){
		
		
		if(i < 0 || j < 0)
		{
		try {
			throw new Exception("n and p should be non-negative");
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}	
			
		}
		else {
			
			System.out.println(Math.pow(i, j));
		}
	}

}



