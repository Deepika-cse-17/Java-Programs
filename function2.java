//without return type with argument
public class function2 {
	//function definition
	public void product(int a, int b)
	{
		int c=a*b;
		System.out.println("The area of the rectangle is "+c);
	}
    public static void main(String arg[])
    {
    	//creation of objection
    	function2 o = new function2();
    	o.product(5, 5);
    }
}

