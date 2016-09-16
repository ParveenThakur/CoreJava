package com.lists.iterate.usingIterator;

import java.util.Iterator;
import java.util.List;

import com.lists.example.EmployeeList;

public class UsingIteratorLoop extends EmployeeList {

	public static void main(String[] args) {
		UsingIteratorLoop usingItr = new UsingIteratorLoop();
		List<String> emoList= usingItr.getEmployeeList();
		Iterator<String> lst = emoList.iterator();
		
		while(lst.hasNext()){
			System.out.println(lst.next());
		}

	}

}
