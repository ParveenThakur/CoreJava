package com.lists.iterate.foreachloop;

import com.lists.example.EmployeeList;

public class ForEachLoop extends EmployeeList {

	public static void main(String[] args) {
		// for each loop
		
		ForEachLoop newFor = new ForEachLoop();
		for(String lst : newFor.getEmployeeList()){
			System.out.println(lst);
		}

	}

}
