package problem_statement_1_3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {
	String bookTitle;
	double bookPrice;
	String s;

	public void createBook() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book_title here");
		bookTitle = sc.nextLine();
		System.out.println("Enter the book_price here");
		bookPrice = sc.nextInt();
		System.out.println();
		Book book = new Book();
		book.setBook_title(bookTitle);
		book.setBook_price(bookPrice);
		s = "book name is:- " + book.getBook_title() + "  " + "Book Price is :- " + book.getBook_price();
        ArrayList<String> al = new ArrayList<String>();
        al.add(s);
       
	}


	public void dispaly() {

		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBook obj1 = new TestBook();
		obj1.createBook();
//		obj1.showBooks();

		TestBook obj2 = new TestBook();
		obj2.createBook();
//		obj2.showBooks();

		obj1.dispaly();
		obj2.dispaly();

	}

}
