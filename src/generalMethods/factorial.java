package generalMethods;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int a= in.nextInt();
		for (int i=a-1;i<0; i--)
		{
			a=a*i;
		}
		System.out.println(a);

	}

}

