package week4.day1;

import java.util.Arrays;

public class SecondLargestNum 
{
	public static void main(String[] args)
	{
		int[] arr1 = {3,2,11,4,6,7};
		//Sorting an array
		Arrays.sort(arr1);
		int index = arr1.length-1;
		
		//using index value, second largest number is picked
		System.out.println("Second largest number in an array is:" +arr1[index-1]);

	}

}
