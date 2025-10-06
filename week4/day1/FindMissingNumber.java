package week4.day1;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(array);
		
		System.out.println("The missing numbers are:");
		for(int i=0; i<array.length-1; i++)
		{
			int currentElement = array[i]; //1,2,3,4,10,6,8
			int nextElement = array[i+1];//2,3,4,10
			
			if(nextElement - currentElement > 1) //2-1>1,3-2>1,4-3>1,
			{
				for(int j=currentElement+1; j<nextElement;j++)
				{
					System.out.println(j);
				}
			}
			
		}
	}

}
