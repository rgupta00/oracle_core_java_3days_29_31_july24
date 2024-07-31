package com.day2.session3.data_stru;
import java.util.*;
public class E_MapExample {

	public static void main(String[] args) {
		Map<String, Integer> marksMap=new TreeMap<>();//HashMap vs LinkedHashMap vs TreeMap
		marksMap.put("raj", 78);
		marksMap.put("ekta", 88);
		
		marksMap.put(null, 66);
		
		marksMap.putIfAbsent("ekta", 98);
		marksMap.put("keshav", 75);
		marksMap.put("gunika", 98);
		marksMap.put("kiran", 68);
		
		
		System.out.println(marksMap);
		
		//we can not use iterator directly in the map
		Set<String> keySet = marksMap.keySet();
		
		for(String key: keySet) {
			System.out.println(key+" : "+ marksMap.get(key));
		}
		
		//words along with the freq
		
		
	}
}
