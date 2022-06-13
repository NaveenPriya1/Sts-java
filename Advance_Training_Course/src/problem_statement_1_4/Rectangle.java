package problem_statement_1_4;

import java.util.Scanner;

    class Rectangle {
	
	 float length;
	 float breadth;
     float area;
     float perimeter;
	
	public Rectangle() {
		length=1;
		breadth=1;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectange");
		length=sc.nextInt();
		System.out.println("Enter the breadth of the rectange");
		breadth=sc.nextInt();
		System.out.println();
		
	}
	
	public void area() {
		area=length*breadth;
	}
	
	public void perimeter() {
		perimeter=2*(length+breadth);
	}
	
	public void display() {
		if(length>0.0 && length<20.0) {
			if(breadth>0.0 && breadth <20.0) {
				System.out.println("The Rectangle:-");
		    	System.out.println("Length is: "+length);
		    	System.out.println("breadth is: "+breadth);
		    	System.out.println("the area of rectangle is: "+area);
		    	System.out.println("the perimeter of rectangle is: "+perimeter);
			}
		}
	}
	
    }
    
    
 

