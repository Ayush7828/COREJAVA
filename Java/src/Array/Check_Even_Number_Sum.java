package Array;

import java.util.Scanner;

public class Check_Even_Number_Sum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a size");
		int num=sc.nextInt(),sum=0;
		System.out.println("Enter a elements");
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of even numbers arrays "+sum);
	}
}
