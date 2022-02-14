package Array;

import java.util.Scanner;

public class Array_sum_of_n_number {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a size");
		int n=sc.nextInt(),sum=0;
		System.out.println("Enter a elements ");
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println("Sum of array "+sum);
	}

}
