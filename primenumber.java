// prime number checker
package primenumber;
import java.util.*;

public class primenumber {
	
	// main function
	
	
	public static void main(String arg[])
	{
		Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        if( n<=1 )
        {
        	System.out.println("Not Prime");
        }
        boolean isPrime = true;
        
        //check divisibility from 2 to sqrt(n)
        for (int i = 2; i<= Math.sqrt(n); i++)
        {
        	if(n%i == 0)
        	{
        		isPrime = false;
        		break;
        	}
        	
        	
        }
        if( isPrime == true)
        {
        	System.out.println("Prime");
        	System.out.println("Name : Deepika");
        	System.out.println("Reg:No: 2117240020063");
        }
        else
        {
        	System.out.println("Not Prime");
        	System.out.println("Name : Deepika");
        	System.out.println("Reg:No: 2117240020063");
        }
        
	}
}