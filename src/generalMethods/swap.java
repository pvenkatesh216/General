package generalMethods;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=in.nextInt();
		System.out.println("Enter the second number");
		int b =in.nextInt();
		System.out.println("Numbers before swapping, a="+a+" "+","+"b="+b);
		int x=a;
		a=b;
		b=x;
		System.out.println("Numbers after swapping, a="+a+" "+","+"b="+b);
		
		}

}
