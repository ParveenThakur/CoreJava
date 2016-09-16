package com.lists.iterate.forloop;

import com.lists.example.EmployeeList;

public class ForLoopIteration extends EmployeeList {

	public static void main(String[] args) {
		ForLoopIteration c = new ForLoopIteration();
		
		// iterate via "for loop"
				System.out.println("==> For Loop Example.");
				for (int i = 0; i < c.getEmployeeList().size(); i++) {
					System.out.println(c.getEmployeeList().get(i));
				}

	}

}
