// with return type with argument
public class function4{
	public int product(int a, int b)
	{
		int c=a*b;
		return c;
	}  
	public static void main(String arg[])
	{
		function4 o=new function4();
		int r =o.product(5, 5);
		System.out.println("The area of the rectangle is "+r);
	}
}
