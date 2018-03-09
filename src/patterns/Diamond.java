package patterns;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		
		
		int n=5;
		int space=4;
		int c;
		int k;
		for (k=1;k<=n;k++)
		{
			System.out.println("");
			for (c=1;c<=space;c++)
			{
				System.out.print(" ");
				space--;
			}
			for (c=1;c<=2*k-1;c++)
			{
				System.out.print("*");
			}
		}

	}

}
