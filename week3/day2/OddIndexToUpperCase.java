package week3.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String text = "changeme";
		char[] textArray = text.toCharArray();
		for(int i=0; i<=textArray.length-1; i++)
		{
			if(i % 2 != 0)
			{
				textArray[i] = Character.toUpperCase(textArray[i]);
			}
		}
		String newText = new String(textArray);
		System.out.println(newText);
	}

}
