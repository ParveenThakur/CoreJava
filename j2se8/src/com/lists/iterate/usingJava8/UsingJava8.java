package com.lists.iterate.usingJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;
import java.util.Objects;
import java.util.function.Consumer;


import com.lists.example.EmployeeList;

public class UsingJava8 extends EmployeeList{
	
	static List<String> val = new ArrayList<>(0);
	public static void main(String[] args) {
		UsingJava8 jdk8 = new UsingJava8();
		 val = jdk8.getEmployeeList();
		// collection stream() util: Returns a sequential
		//Stream with this collection as its source
		System.out.println("\n==> collection stream() util....");
		jdk8.getEmployeeList().forEach((s) -> {	System.out.println(s);});
		
	}
}
