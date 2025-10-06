package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		
		String arrayText[] =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> companies = new ArrayList<>(Arrays.asList(arrayText));
		List<String> sortedCompanies = new ArrayList<String>();
		Collections.sort(companies);
		
		for(int i=companies.size()-1; i>=0; i--)
		{
			sortedCompanies.add(companies.get(i));
			
		}
		System.out.println("The sorted company list are:  "+sortedCompanies); 

	}

}
