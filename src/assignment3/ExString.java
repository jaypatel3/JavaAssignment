package assignment3;

import java.util.Scanner;

public class ExString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		char s1;
		String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
		String whiteSpaces=" _";


		// number of word
		int c = 0;
		char ch[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
				c++;

			}
		}
		System.out.println("Number of Words in String = " + c + "");

		
		
		String[] tokens = s.split("\\s");
		s = "";
		char capLetter = 0;

		for (int i = 0; i < tokens.length; i++) {

			if (Character.isLowerCase(tokens[i].charAt(0))) {
				capLetter = Character.toUpperCase(tokens[i].charAt(0));
			} else {
				capLetter = Character.toLowerCase(tokens[i].charAt(0));
			}
			s += " " + capLetter + tokens[i].substring(1);
		}
		s = s.trim();
		System.out.println("Rename String = " + s);

		
		//speical character 
		String str2[]=s.split("");
		int count2=0,count3=0;;
		
		for (int i=0;i<str2.length;i++)
	    {
	    if (specialCharacters.contains(str2[i]))
	    {
	    	if(whiteSpaces.contains(str2[i]))
	    	{
	    		count3++;
	    	}
	    	count2++;
	        
	    }
	    else{
	    
	    	 
	    }
	    }
		  System.out.println("Number of Speical Charachter in the String = "+count2);
		  
		  System.out.println("Number of Spaces in the String = "+count3);
		  
		  
		 char temp;
	        char[] arr = s.toCharArray();
	        
	       
	      int len = arr.length;
	      
	        for(int i=0; i<(s.length())/2; i++,len--){
	        	
	            temp = arr[i];
	            arr[i] = arr[len-1];
	            arr[len-1] = temp;
	        }

	        System.out.println("Reverse String :" + String.valueOf(arr));
	    
		
	}

}
