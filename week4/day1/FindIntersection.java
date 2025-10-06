package week4.day1;

public class FindIntersection 
{
	public static void main(String[] args) 
	{
		 int[] arr1 = {3,2,11,4,6,7};
		 int[] arr2 = {1,2,8,4,9,7};
		 System.out.println("The below values of array1 and array2 are equal:");
		 //Iterating 2 arrays
		 for(int i=0; i<arr1.length;i++) 
		 {
			 for(int j=0;j<arr2.length;j++)
			 {
				 //Using equal operator comparing both the arrays
				 if(arr1[i]==arr2[j])
				 {
					 System.out.println(arr1[i]+ "="+arr2[j]);
				 }
			 }
		 }

	}

}
