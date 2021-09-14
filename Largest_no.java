package largest_no;

public class Largest_no {

	public static void main(String[] args) {
		
		int [] x= {54,65,65,86,8,3,3886,868,8,786};
		int max=Integer.MIN_VALUE;
		System.out.println("Initial value of max:"+max);
		System.out.println("By using for loop");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
			
		}
		System.out.println("maximum value from given array is :"+max);
		
		System.out.println("Find the largest no using while loop");
		int [] p= {54,65,65,86,8,3,3886,868,8,786};
		int max1=Integer.MIN_VALUE;
		if(p.length>0)
		{
			int i=0;
			while(i<p.length)
			{
				if(p[i]>max1)
				{
					max1=p[i];
				}
				i++;
			}
			System.out.println("The maximus value from given array is:"+max1);

	    }
	}

}
