// with return type without argument
public class Squarefunction3 {
	public int square()
	{
		int a=5,b=a*a;
		return b;
	}
    public static void main(String arg[])
    {
    	Squarefunction3 o = new Squarefunction3();
    	int c = o.square();
    	System.out.println("The area of the rectangle is "+c);
    }
}
