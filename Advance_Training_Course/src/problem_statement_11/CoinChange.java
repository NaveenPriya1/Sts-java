package problem_statement_11;

import java.util.Scanner;
import java.util.Vector;

public class CoinChange {
	
	static int deno[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
	
	
	     static void findMin(int V) {
		 Vector<Integer> ans = new Vector<>();
		 
		 for(int i=deno.length-1;i>=0;i--) {
			 
			 while(V>=deno[i]){
				 V-=deno[i];
				 ans.add(deno[i]);
			 }
			 
		 }
		 for(int i=0;i<=ans.size()-1;i++) {
			 System.out.print(" "+ans.elementAt(i));
		 }
		 System.out.println(" \n the minmum number of coins/notes required are "+ ans.size());
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		System.out.print("Follwing is minimul Number of change for "+n+" : ");
		findMin(n);

	}

	

}
