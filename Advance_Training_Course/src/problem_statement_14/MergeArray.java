package problem_statement_14;

import java.util.Arrays;

public class MergeArray {
	
	public static void sortedMerge(int[] a, int[] b, int[] res, int n, int m) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		
		while(i<n) {
			res[k]= a[i];
			i++;
			k++;
		}
		
		while(j<m) {
			res[k]=b[j];
			j++;
			k++;
		}
		
		Arrays.sort(res);
		
	}

	public static void main(String[] args) {
		int a[] = {10,2,20,5};
		int b[] = {3,15,1,7,9};
		int n = a.length;
		int m = b.length;
		
		int res[] = new int[n+m];
		sortedMerge( a, b, res, n, m);
		
		System.out.println("The final sorted array is ");
		for(int i = 0;i<res.length;i++) {
			System.out.print(" "+res[i]);
		}

	}

	

}
