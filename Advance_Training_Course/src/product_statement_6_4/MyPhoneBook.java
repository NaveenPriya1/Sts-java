package product_statement_6_4;

import java.util.HashMap;
import java.util.Scanner;

public class MyPhoneBook {
  static String uinterface= "Press:   -  A for Add contact  -  S for Search  - E for Exit";
     private String name;
     private String number;
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public static void main(String[] args) {
		int n;
		HashMap<String,String> hm= new HashMap<String, String>();
		System.out.println("\n\n ***** Welcome to MyPhone Book ****** \n\n");
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("[Main meanu]"+uinterface+"\n:");
			String command = sc.next().trim();
			
			if(command.equalsIgnoreCase("A")) {
				System.out.println("Enter the number of contacts to add");
				n = sc.nextInt();
				System.out.println("Enter the name and number :");
				for (int i = 0; i < n; i++) {
					hm.put(sc.next(), sc.next());
				}
				System.out.println(hm);
				

				
			}else if(command.equalsIgnoreCase("B")){
				String pid = sc.next();
				if (hm.containsKey(pid)) {
					System.out.println(hm.get(pid));
				
			}else if(command.equalsIgnoreCase("E")) {
				System.exit(0);
				break;
			}else {
				
				System.out.println("Unknown command ! try again \n");
			}
		}

	}

	}}
