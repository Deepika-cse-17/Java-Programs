// polymorphism with number of arguments
package polymorphism2;

public class polymorphism2 {
	public void product(int a , int b)
	{
		int c = a*b;
		System.out.println("The area of the rectangle: "+c);
	}
	public void product(int d, int e, int f)
	{
		int g = d*e*f;
		System.out.println("The area of the rectangle: "+g);
	}
	public static void main(String arg[])
	{
		polymorphism2 o = new polymorphism2();
		o.product(5, 5);
		o.product(5,5,5);
	}
}
