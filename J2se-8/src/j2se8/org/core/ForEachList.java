package j2se8.org.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author P T
 * get number of duplicate elements occurred in a List.
 */
public class ForEachList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(0);
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>(0);
		
		for(Integer val:list){
			Integer count = maps.get(val);
			maps.put(val, (count==null)?1:count+1);
		}
		//Normal way
		
		for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		//java 8
		
		maps.forEach((k,v)->{
			System.out.println("Item :"+k+"  occurance:"+v);
		});

	}

}
