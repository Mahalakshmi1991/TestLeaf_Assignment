package week3.day2;

public class StringReversal {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		char[] array = companyName.toCharArray();
		System.out.println("String reversal is:");
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.print(array[i]);
		}

	}

}
