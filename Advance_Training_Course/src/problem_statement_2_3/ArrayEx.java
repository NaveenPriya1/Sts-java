package problem_statement_2_3;

public class ArrayEx {

	public static void main(String[] args) {
		int [] A = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		
		//to find the sum of array A
		int sum= 0;
		for(int i=0;i<=14;i++) {
			sum = sum+ A[i];
		}
		A[15]=sum;
		System.out.println("Sum of elements of array is: "+sum);
		
		//to find the average of array a
		int average=sum/A.length-1;
		A[16]=average;
		
	    System.out.println("Average of array : "+average);
		
		
		//to find the min of array
		int min = A[0];
		for(int i=1;i<=A.length-1;i++) {
			if(A[i]<min) {
				min=A[i];
			}
			}
		System.out.println("Min of array : "+min);
		A[17]=min;
		
		//after changing the values the modified array 
		System.out.println("after changing the values the modified array");
		for(int i = 0;i<=A.length-1;i++) {
			System.out.print(A[i]+" ");
		}
	}

}
