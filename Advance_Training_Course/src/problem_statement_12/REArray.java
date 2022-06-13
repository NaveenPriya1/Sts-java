package problem_statement_12;

import java.util.HashSet;
import java.util.Scanner;

public class REArray {
	    
	public static void printFirstRepeating(int[] arr) {
		// TODO Auto-generated method stub
		 int min = -1;
		 HashSet<Integer> hs = new HashSet<>();
		 for(int i = arr.length-1;i>=0;i--) {
			 if(hs.contains(arr[i])) {
				 min=arr[i];
			 }else {
				 hs.add(arr[i]);
			 }
		 }
		 if(min != -1) {
			 System.out.println("The first repeating number in the array is "+min);
		 }else {
			 System.out.println("There are no repeating numbers in the array");
		 }
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the values of array");
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		printFirstRepeating(arr);

	}

	

}
