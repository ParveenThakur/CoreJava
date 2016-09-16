package org.lambda.examples;

public class PrintOnlyEmptyLst extends LambdaExamples{

	public static void main(String[] args) {
		PrintOnlyEmptyLst p = new PrintOnlyEmptyLst();
		
			// Print only empty list count
			long emptyCount = p.getCompanyList().stream().filter(ptList -> ptList.isEmpty()).count();
			System.out.println("Test1: # of Empty Strings: " + emptyCount);
		 

	}

}
