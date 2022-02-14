package NestedLoop;

public class Pattern9 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.printf("%d",j);
			}
			System.out.println();
		}
	}

}


//54321
//4321
//321
//21
//1