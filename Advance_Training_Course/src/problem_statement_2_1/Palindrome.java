package problem_statement_2_1;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		String str,rev = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name u want");
		str = sc.nextLine();
		
		System.out.println("The lenth of the given Name is :"+str.length());
		System.out.println("the given into upper case is :"+str.toUpperCase());
		
		for(int i =str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("the word '"+str+"' is a palindrome");
		}
		else {
			System.out.println("the word '"+str+"' is not a palindrome");
		}
		

	}

}
