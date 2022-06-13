package problem_statement_5_2;

public class SplitString {

	public static void main(String[] args) {
		String str = " 23 + 45 - ( 343 / 12 )";
		
		String []A= str.split("\\\s");
		for(String a:A) {
			System.out.println(a);
			System.out.println();
		}

	}

}
