package problem_statement_6_2;

import java.util.HashMap;
import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("Enter the number of Products");
		n = sc.nextInt();
		System.out.println("Enter the product id and name :");
		for (int i = 0; i < n; i++) {
			hm.put(sc.next(), sc.next());
		}
		System.out.println(hm);
		System.out.println("Enter the product id  to remove");
		String id = sc.next();
		hm.remove(id);
		System.out.println("Item removed");
		System.out.println("the list is" + hm.toString());
		System.out.println();
		System.out.println("Enter product id to Search");
		String pid = sc.next();
		if (hm.containsKey(pid)) {
			System.out.println(hm.get(pid));
		} else {
			System.out.println("list not contains");
		}

	}
}