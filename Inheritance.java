package inheritance;

class Inherit {
	int a = 5;

}
public class Inheritance extends Inherit{
	int b =5;
	public static void main(String arg[])
	{
	     Inheritance  o = new Inheritance();
		System.out.println("The area of the rectangle : "+ o.a*o.b);
    }
}
