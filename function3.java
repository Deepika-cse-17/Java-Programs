// with return type without argument
public class function3{
	public int product()
	{
		int a=5,b=5;
		int c=a*b;
		return c;
	}
	public static void main (String args[])
	{
		function3 o= new function3();
		int r=o.product();
		System.out.println("The area of rectangle is "+r);
	}
}
