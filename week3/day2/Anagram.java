package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String word1 = "maha P";
		String word2 = "P hama";
		if(word1.length() == word2.length())
		{
			char[] wordArray1 = word1.toCharArray();
			char[] wordArray2 = word2.toCharArray();
			Arrays.sort(wordArray1);
			Arrays.sort(wordArray2);
			if(Arrays.equals(wordArray1, wordArray2))
			{
				System.out.println("The given strings are Anagram");
			}
			else
			{
			System.out.println("The given strings are not an Anagram");
			}
		}
		else
		{
			System.out.println("Lengths mismatch, therfore strings are not an anagram");
		}

	}

}
