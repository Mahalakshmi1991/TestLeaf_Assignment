package week1.day2;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int previous1 = 1;
		int previous2 = 0;
		int n=8;
		System.out.println("Fibonacci series are:");
		System.out.println(previous2);
		System.out.println(previous1);
		for(int i=3; i<=n; i++)
		{
			int current = previous1 + previous2;
			previous2 = previous1;
			previous1 = current;
			System.out.println(current + " ");
		}
		
	}

}
