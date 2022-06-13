package problem_statement_1_1;

import java.util.Scanner;

public class ListAllEvenNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		
		System.out.print("The even numbers between 1 to "+n+" are: \n");
		
		for(int i = 1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}

	}

}
