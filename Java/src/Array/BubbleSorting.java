package Array;

import java.util.Scanner;

public class BubbleSorting {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a size");
	int num=sc.nextInt(),count=1;
	System.out.println("Enter a elements");
	int[] arr=new int[num];
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	//algo
	while(count<num-1)
	{
		for(int i=0;i<num-count;i++) 
		{
			if(arr[i]>arr[i+1]) {
				int temp=arr[1];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
		}
		count++;
	}
	//output
	for(int i=0;i<arr.length;i++) {
		System.out.println(" "+arr[i]);
	}
}
}
