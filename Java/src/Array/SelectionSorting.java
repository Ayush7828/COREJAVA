package Array;

import java.util.Scanner;

public class SelectionSorting {
	//selection sort
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a size");
		int n=sc.nextInt();
		System.out.println("Enter a elements ");
		int[] arr=new int[n];
		
		//input array
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		// algorithm of selection sorting 
		
		for(int i=0;i<n-1;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(arr[j]<arr[i]) 
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		// output of array
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	} 

}
