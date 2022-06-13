package problem_statement_17;

public class CheckingBalancedBrackets {
	public static boolean isBalanced(String exp) {

		// Initialising variables
		boolean flag = true;
		int count = 0;

		// Traversing the expression
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == ')') {
				count++;
			} else {

				// It is a closing parenthesis
				count--;
			}
			if (count < 0) {

				flag = false;
				break;
			}
		}

		if (count != 0) {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		String exp1 = "[()]{}{[()()]()}";

		if (isBalanced(exp1))
			System.out.println("Not Balanced");
		else
			System.out.println("Balanced");

		String exp2 = "[(])}";

		if (isBalanced(exp2))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
