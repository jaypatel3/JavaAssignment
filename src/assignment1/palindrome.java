package assignment1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		int remin, sum = 0, temp;

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		temp = n;
		while (n > 0) {
			remin = n % 10;
			
			sum = (sum * 10) + remin;
			
			n = n / 10;
		}
		if (temp == sum)
		{
			System.out.println("Yes,palindrome number ");
		}
		else{
			
			System.out.println("not palindrome");
			
		}
			
	}

}
