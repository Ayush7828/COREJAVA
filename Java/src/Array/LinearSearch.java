package Array;

import java.util.Scanner;

public class LinearSearch {
	
	// write function in linear search 
	public static int  linearSearch(int[] arr,int num,int key) {
		for(int i=0;i<num;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter a size");
       int num=sc.nextInt();
       System.out.println("Enter a elements");
       int[] arr=new int[num];
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("Enter a find elements in list ");
       int key=sc.nextInt();
       int ans=linearSearch(arr,num,key);
       
       System.out.println("index at"+ans);
       
       
	}

}
