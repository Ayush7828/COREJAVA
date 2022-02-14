package Array;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a size");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements ");
		//input array
		for(int i=0;i<arr.length;i++) {
		    
			arr[i]=sc.nextInt();
		}
		
	    // output arrary
		for(int i=0;i<arr.length;i++  ) {
			System.out.print(" "+arr[i]);
		}
		
	}

}
