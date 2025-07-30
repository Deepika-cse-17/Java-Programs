// without return type with argument
public class Squarefunction2 {
	
	public void square(int a )
	{
		int b=a*a;
		System.out.println("The area of the rectangle is "+b);
	}
	public static void main(String arg[])
	{
		Squarefunction2 o = new Squarefunction2();
		
		o.square(5);
	}
}
