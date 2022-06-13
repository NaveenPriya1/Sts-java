package problem_statement_16;

import java.util.Scanner;

public class ClimbStairs {

	public static int climbStairs(int N) {
		 if ( N < 2 ) {
		        return 1;
		 } else {
		        return climbStairs(N-1) + climbStairs(N-2);
		 }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Stairs");
		int steps = sc.nextInt();
		
		System.out.println("The number of ways to climb " + steps + " are " + climbStairs(steps));

	}

}
