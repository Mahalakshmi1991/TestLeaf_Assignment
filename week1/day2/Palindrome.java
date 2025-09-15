package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		
		int num= 12121, reverseNum=0, remainder=0;
		int initialNum = num;
		while(num!=0)
		{
			remainder= num % 10;
			reverseNum = (reverseNum * 10) + remainder;
			num=num/10;
		}	
		if (initialNum == reverseNum)
		{
				System.out.println(initialNum + " is a palindrome.");
		}else
		{
				System.out.println(initialNum + " is not a palindrome.");
		}
	}

}
