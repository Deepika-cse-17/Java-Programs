// polymorphism with differnt data types
package polymarphism;

public class polymarphism1 {
	public void product(int a, int b)
	{
		int c = a*b;
	    System.out.println("The area of the rectangle: "+ c);
	}
	public void product(double c, double d )
	{
		double f = c*d;
		System.out.println("The area of the rectangle: "+f);
	}
	public static void main(String arg[])
	{
		polymarphism1 o = new polymarphism1();
		o.product(5, 5);
		o.product(5.5,5.5);
	}

}
