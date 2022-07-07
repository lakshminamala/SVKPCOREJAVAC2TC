public class loops
{
	public static void main(String[] args) 
	{	
for(int i = 1; i<=1000 ; i++)   //(inti = 1000; i<=1;i--)
		{	
			System.out.print("Value of i:");
			System.out.println(i);
		}
	}

    //for loop 

 
	{	
		int number = 8;
		boolean isPrime = true;
		for(int i = 2; i<number/2; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime == true)
		{
System.out.println("The number is a prime number");
		}
		else
		{
System.out.println("The number is not a prime number");
		}
		

	}

}







