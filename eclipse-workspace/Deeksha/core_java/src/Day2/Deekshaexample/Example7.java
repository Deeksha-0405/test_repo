package Day2.Deekshaexample;

public class Example7 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int d[] = a;
		System.out.println(d[0]);
		int sum = 0;
		for (int j = 0; j < 3; ++j)
		{
		sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
		System.out.println(sum);
		}
		
			

	}
}
