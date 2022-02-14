package Array;

import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
	       Scanner sc =new Scanner(System.in);
		int[] a =new int[5];
		int[] b= new int[5];
		int[] c=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<c.length;i++) {
			if(i<5) {
				c[i]=a[i];
			}
			else {
				c[i]=b[i-5];
			}
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
