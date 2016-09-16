package org.lambda.examples;


import java.util.Arrays;
import java.util.List;
 
/**
 * 
 * @author Crunchify.com
 */
 
public class LambdaExamples {
	public List<String> getCompanyList(){
	List<String> companyList = Arrays.asList("VeeSoft","Google", "",	"Yahoo", "Facebook", "", "Twitter", "LinkedIn","Immageing World");
//	System.out.println("- Here is a Company Lists: " + companyList);
	return companyList;
	}
 
	public static void main(String args[]) {/*
 
		
 
		// Print only empty list count
		long emptyCount = companyList.stream().filter(cList -> cList.isEmpty()).count();
		System.out.println("Test1: # of Empty Strings: " + emptyCount);
 
		// Print company with character length > 6
		long lengthCount = companyList.stream().filter(x -> x.length() > 6).count();
		System.out.println("Test2: # of companies with char length > 6: " + lengthCount);
 
		// Match the pattern which starts with letter 'T' and print count
		Long startCount = companyList.stream().filter(x -> x.startsWith("T")).count();
		System.out.println("Test3: # of companies which name starts with letter T: " + startCount);
 
		// Remove all empty Strings from List
		List<String> removeEmptyStrings = companyList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("Test4: New Company List without empty list" + removeEmptyStrings);
 
		// Create a List with String > 6 characters
		List<String> newList = companyList.stream().filter(x -> x.length() > 6).collect(Collectors.toList());
		System.out.println("Test5: New company list which has total characters > 6: " + newList + "\n");
 
		List<Integer> crunchifyInt = Arrays.asList(98, 4, 7, 3, 2, 46, 21, 53, 17, 32, 63, 52);
		IntSummaryStatistics crunchifyStats = crunchifyInt.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("- Here is a crunchifyInt List: " + crunchifyInt);
		System.out.println("Highest Prime # " + crunchifyStats.getMax());
		System.out.println("Lowest Prime  # " + crunchifyStats.getMin());
		System.out.println("Sum of All: " + crunchifyStats.getSum());
		System.out.println("Average of all: " + crunchifyStats.getAverage() + "\n");
 
		// Convert String to UPPERCASE and join them using space
		List<String> crunchifyTips = Arrays.asList("this", "is", "crunchify", "java8", "tutorial");
		String joinList = crunchifyTips.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(" "));
		System.out.println("- Join All String with UPPERCASE: " + joinList);
 
		// Create List of Cubes
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> cubes = numbers.stream().map(myInt -> myInt * myInt * myInt).distinct().collect(Collectors.toList());
		System.out.println("- Create cubes for 1,2,3,4,5: " + cubes + "\n");
 
	*/}
}
