package generalMethods;

public class diffMethods {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		int c=10;
	
		
		System.out.println("Minimum value is " +Math.min(a, b));
		System.out.println("Maximum value is " +Math.max(a, b));
	}
		
	public static int add(int a, int b)
	{
		int result=add(a,b);
		return result;
	}
	
	public static int add(int a, int b, int c)
	{
		int result=add(a,b,c);
		return result;
	}
	
	public static String subString()
	{
		String Str1="Welcome to Infor";
		String s1=Str1.substring(10);
		return s1;
	}
	

}
