

public class Conditional_operator {

	public static void main(String[] args) {
	
		int [] x= {14,35,25,36,29,65,35};
		
		System.out.println("This is the output of for loop");
		for(int i=0;i<x.length;i++)
		{
			
			System.out.println(x[i]);
		}
		
		System.out.println("--------------");

		System.out.println("This is the output for while loop");
		int j=0;
		while(j <x.length)
		{
			
			System.out.println(x[j]);
			j++;
		}
	}

}
