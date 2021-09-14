
public class Check_primeOrNot {
	public static void main(String [] agrs)
	{
		int n=652349;
		int mid=n/2;
		boolean flag=true;
		if(n==0||n==1) {
			System.out.println("Not a Prime number");
		}
		else
		{
			for(int i=2;i<mid;i++)
			{
				if(n%i==0)
				{
					
					flag=false;
				}
				
			}
			if(flag==true)
			{
				System.out.println("No. is prime..");
			}
			else
			{
				System.out.println("This no. is not a prime no..");
			}
		}
		
	}

}
