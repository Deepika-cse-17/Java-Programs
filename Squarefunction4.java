// with return type with arguments
public class Squarefunction4 {
	public int square(int a)
	{
		int b=a*a;
		return b;
	}
    public static void main(String arg[])
    {
    	Squarefunction4 o = new Squarefunction4();
    	int c = o.square(5);
    	System.out.println("The area of the Square is "+c);
    	
    }
}
