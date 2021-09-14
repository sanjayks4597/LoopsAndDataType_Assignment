package sum_of_numbers;

public class Sum_of_numbers {

	public static void main(String[] args) {


		int x[] = {14,36,25,6,24,68,78};
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("Sum of elements of array is ...:"+sum);

	}

}
