package assignment1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int number;
		int sum=0;
		int temp=1;
		
		System.out.print(sum+" "+temp);
		
		for(int i=2;i<n;i++)
		{
			
			
			number = sum + temp;
			
			System.out.print(" "+number);
			sum=temp;
			temp = number;
			
			
			
			
			
			
		}
		

	}

}
