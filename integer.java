package integer;
import java.util.*;
public class integer {
	public static void main ( String arg[])
	{
		Scanner o = new Scanner(System.in);
		int a = o.nextInt();
		int sum = 0,add=0;
		int i,j,k,m;
		if (a%2!=0)
		{
			System.out.println("Odd");
			System.out.println(++a);
			for( i = 0; i<=a;i++)
			{
				sum+=i;
			}
			System.out.println(sum);	
			if(sum%2!=0)
			{
				for(j=1;j<=sum;j++)
				{
					if(sum%j == 0)
					{
						System.out.println("The divisors are : "+j);
					}
				}
			}
			else
			{
				if( sum<=1 )
		        {
		        	System.out.println("Not Prime");
		        }
		        boolean isPrime = true;
		        
		        //check divisibility from 2 to sqrt(n)
		        for (int l = 2; l<= Math.sqrt(sum); l++)
		        {
		        	if(sum%l == 0)
		        	{
		        		isPrime = false;
		        		break;
		        	}
		        	
		        	
		        }
		        if( isPrime == true)
		        {
		        	System.out.println("Prime");
		        }
		        else
		        {
		        	System.out.println("Not Prime");
		        }
			}
			
			
		}
		else 
		{
			System.out.println("Even");
			System.out.println(--a);
			for(k = 0; k<=a;k++)
			{
				add+=k;
			}
			System.out.println(add);
			if(add%2!=0)
			{
				for(m=1;m<=add;m++)
				{
					if(add%m == 0)
					{
						System.out.println("The divisors are : "+m);
					}
				}
			}
			else
			{
				if( add<=1 )
		        {
		        	System.out.println("Not Prime");
		        }
		        boolean isPrime = true;
		        
		        //check divisibility from 2 to sqrt(add)
		        
		        for (int f = 2; f<= Math.sqrt(add); f++)
		        {
		        	if(add%f == 0)
		        	{
		        		isPrime = false;
		        		break;
		        	}
		        	
		        	
		        }
		        if( isPrime == true)
		        {
		        	System.out.println("Prime");
		        }
		        else
		        {
		        	System.out.println("Not Prime");
		        }
			}
			
			
			
		}
			
		}
		
	}


