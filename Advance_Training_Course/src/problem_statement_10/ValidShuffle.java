package problem_statement_10;

import java.util.Scanner;

public class ValidShuffle {

	public static boolean isInterleaving(String X, String Y, String Z) {
		if (X.length() == 0 && Y.length() == 0 && Z.length() == 0) {
			return true;
		}
		if (Z.length() == 0) {
			return false;
		}

		boolean x = X.length() != 0 && X.charAt(0) == Z.charAt(0) && isInterleaving(X.substring(1), Y, Z.substring(1));

		boolean y = Y.length() != 0 && Y.charAt(0) == Z.charAt(0) && isInterleaving(X, Y.substring(1), Z.substring(1));
		return x || y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String X = sc.nextLine();
		System.out.println("Enter the Second String");
		String Y = sc.nextLine();
		System.out.println("Enter the Third String");
		String Z = sc.nextLine();

		if (isInterleaving(X, Y, Z)) {
			System.out.println("Interleaving");
		} else {
			System.out.println("Given String is not Interleaving Of X and Y");

		}

	}

}
