package problem_statement_6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListex {

	public static void main(String[] args) {
		int n;
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of the students");
		n=sc.nextInt();
		 
		System.out.println("Enter the student Names: ");
		for(int i=0;i<n;i++) {
		  al.add(sc.next());
		}
		
		System.out.println("list of students : ");
		System.out.println(al);
		
		for(String list:al) {
			System.out.println("Enter the name of the student u want to Search");
			String s1 = sc.next();
			int position=Collections.binarySearch(al,s1);
			System.out.println("name "+s1+" is found at position "+position);
		}
	}

}
