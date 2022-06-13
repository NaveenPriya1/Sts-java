package problem_ststement_2_2;

import java.util.Scanner;

public class Febonachi {

	public static void main(String[] args) {
		int n;
		int count = 13;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int i = sc.nextInt();
		System.out.println("Enter the second number");
		int j = sc.nextInt();
		
		System.out.print(i + " ");
		System.out.print(j + " ");
		for (int k = 1; k <= count; k++) {
			n = i + j;
			System.out.print(n + " ");
			i = j;
			j = n;

		}
	}
}