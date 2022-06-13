package problem_statement_1_2;

import java.util.Scanner;

    class Rectangle {
	
	 int length;
	 int breadth;
     int area;
	
	
	public Rectangle() {
		super();
	}

	//Constructor to pass the values Externally
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	//accessor and mutator methods
	 public int getLength() {
			return length;
		}



		public void setLength(int length) {
			this.length = length;
		}



		public int getBreadth() {
			return breadth;
		}



		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}


    //user input method
	public void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Length of triangle");
    	length= sc.nextInt();
    	System.out.println("Enter the Breadth of triangle");
    	breadth=sc.nextInt();
    	System.out.println();
    	
    }
	
    //calculate area method
    public void calArea() {
    	 area = length*breadth;
    }
    
    //display rectangle details method
    public void display() {
    	System.out.println("The Rectangle:-");
    	System.out.println("Length is: "+length);
    	System.out.println("breadth is: "+breadth);
    	System.out.println("the area of triangle is: "+area);
    }
    }
    
 
