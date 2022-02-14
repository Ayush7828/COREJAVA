package Array;

import java.util.Scanner;

public class Count_Even_Odd {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a size ");
		int num=sc.nextInt(),eccount=0,occount=0;
		System.out.println("Enter a elements");
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<num;i++)
		{
			if(arr[i]%2==0) {
				eccount+=1;
			}
			else {
				occount+=1;
			}
		}
		System.out.println("Print even count "+eccount);
		System.out.println("Print even count "+occount);
	}

}
