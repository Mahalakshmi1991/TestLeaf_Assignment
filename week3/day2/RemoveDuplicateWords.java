package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) 
	{
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] splitText = text.toLowerCase().split(" ");
		for(int i = 0; i < splitText.length; i++)
		{
			for(int j= i + 1; j<splitText.length;j++)
			{
				if(splitText[i].equals(splitText[j]))
				{
					splitText[j]="";
				}
			}
		}
		System.out.println(String.join(" ", splitText).replace("  ", " "));

	}

}
