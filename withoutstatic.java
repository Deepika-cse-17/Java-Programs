//without static keyword
public class withoutstatic{
	public int product(int a, int b)
	{
		int c=a*b;
		return c;
	}  
	public static void main(String arg[])
	{
		withoutstatic o=new withoutstatic();
		int r =o.product(5, 5);
		System.out.println("The area of the rectangle is "+r);
	}
}

