package week3.day2;

public class ReverseWordsInOddPosition 
{
	public static void main(String[] args) {
		String originalWord = "I am a software tester";
		System.out.println("Orginal word: "+ originalWord);
		String[] splitWord = originalWord.split(" ");
		for(int i=0; i<=splitWord.length-1;i++)
		{
			if(i % 2 != 0)
			{
				char[] temp = splitWord[i].toCharArray();
				char[] reversedChar = new char[temp.length];
				int currentPos = 0;
				for(int j=temp.length-1;j>=0;j--)
				{
					reversedChar[currentPos] =temp[j];
					currentPos += 1;
				}
				splitWord[i] = new String(reversedChar);
			}
			
		}
		System.out.println("Reversed word in odd position: "+ String.join(" ", splitWord));
	}

}
