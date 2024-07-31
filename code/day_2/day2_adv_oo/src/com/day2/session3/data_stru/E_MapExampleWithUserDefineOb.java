package com.day2.session3.data_stru;
import java.util.*;
public class E_MapExampleWithUserDefineOb {

	public static void main(String[] args) {
		Map<Employee, String> marksMap=new TreeMap<>(new NameSorter());//HashMap vs LinkedHashMap vs TreeMap
		marksMap.put(new Employee(1, "raj", 67000), "delhi");
		marksMap.put(new Employee(2, "ekta", 45000), "banglore");
		
		
		//we can not use iterator directly in the map
		Set<Employee> keySet = marksMap.keySet();
		
		for(Employee key: keySet) {
			System.out.println(key+" : "+ marksMap.get(key));
		}
		
		//words along with the freq
		
		
	}
}
