package week1.day2;

public class IsPrimeNumber {
	
	public boolean IsPrimeorNot(int n)
	{
		boolean flag = true;
		if(n<=1)
		{
		  flag = false;
		}
		for(int i = 2 ; i < n; i++) {
			if(n % i == 0) {
				flag = false;
			}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		IsPrimeNumber pm = new IsPrimeNumber();
		int n =15;
		for(int i = 2; i <=n ; i++)
		{
			if(pm.IsPrimeorNot(i))
			{
				System.out.print(i + " ");
			}
		
		}

	}

}

