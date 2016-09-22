package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDE {
	
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,0);
	List<String> listS = new ArrayList<>();
	listS.add("1");
	listS.add("2");
	listS.add(null);
	
	
	for(Integer n : list){
//		System.out.println(n);
	}
	
	list.forEach(z->System.out.println(z));
	
	listS.forEach(System.out :: println);
}
}
