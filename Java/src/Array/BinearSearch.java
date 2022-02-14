package Array;

import java.util.Scanner;

public class BinearSearch {
	
	// write function in binarysearch
	public static int binarySearch(int[] arr,int num,int key) {
		int s=0;
		int e=num;
		while(s<e)
		{
			int mid=(s+e)/2;
			if(arr[mid]==key) 
				return mid;
			else if(arr[mid]>key)
			{
				e=mid-1;
			}
			
			else 
			{
				s=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a size of array");
		int num=sc.nextInt();
		
		System.out.println("Enter a elements ");
		int[] arr=new int[num];
	
		System.out.println("Enter a key ");
		int key=sc.nextInt();
		
		int ans=binarySearch(arr,num,key);
		System.out.println("Index at "+ans);
		
		
		
	}

}
