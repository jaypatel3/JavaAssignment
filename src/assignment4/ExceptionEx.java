package assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			
			int i = 0,j=0;
			
			
			
			try{
			System.out.print("Ener first number = ");
			i = in.nextInt();
			
			System.out.print("Ener second number = ");
			j = in.nextInt();
			
			int d = i/j;
			System.out.println(d);
			}
			catch (ArithmeticException e) { // 
			      System.out.println(e.toString());
			    }
			catch(InputMismatchException e){
				
				System.out.println(e.toString());
			}
			
	}
	
	
}



