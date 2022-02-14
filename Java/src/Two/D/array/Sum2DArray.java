package Two.D.array;


public class Sum2DArray {
public static void main(String[] args) {
	int a[][]={{1,2,3},{4,8,9},{8,9,3}};
	int b[][]={{7,12,8},{14,18,29},{98,49,32}};
	int c[][]=new int[3][3];
	
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<c.length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		System.out.print(" "+c[i][j]);
		}
		System.out.println();
	}

	
	
}
}

