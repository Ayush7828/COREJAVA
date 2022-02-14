package Two.D.array;

import java.util.Scanner;

public class TwoD_array_simple {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number of row and number of colimn");
		int n=sc.nextInt(),m=sc.nextInt();
	    System.out.println("Enter a elements of row and column");
	    int[][] arr=new int[n][m];
	    
	    // input 2d array
	    for(int i=0;i<arr.length;i++) 
	    {
	    	for(int j=0;j<arr.length;j++) {
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    // outpur array 
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr.length;j++) {
	    		System.out.print(" "+arr[i][j]);
	    	}
	    	System.out.println();
	    }
	}

}
