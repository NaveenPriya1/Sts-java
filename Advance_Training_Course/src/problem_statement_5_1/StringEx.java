package problem_statement_5_1;

public class StringEx {

	public static void main(String[] args) {
		String str = "JAVA is Simple";
		System.out.println(str.toUpperCase());// upper case

		System.out.println(str.toLowerCase());// lower case

		String[] words = str.split(" ");
		for (String w : words) { // to print first letter
			System.out.print(w.charAt(0) + " ");
		}
		System.out.println();

		String[] w = str.split(" "); // Change order
		for (int i = w.length - 1; i >= 0; i--) {
			System.out.print(w[i] + " ");

		}
		System.out.println();

		//reverse
		StringBuilder words2 = new StringBuilder(str);
        StringBuilder reverseStr = words2.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());

		System.out.println(str.length());// length
	}

}
