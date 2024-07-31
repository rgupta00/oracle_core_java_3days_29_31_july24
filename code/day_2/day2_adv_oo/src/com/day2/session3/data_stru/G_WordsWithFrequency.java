package com.day2.session3.data_stru;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class G_WordsWithFrequency {

	public static void main(String[] args) {
		// word freq
		Map<String, Integer> map = new HashMap<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("foo.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					if (!map.containsKey(token)) {
						map.put(token, 1);
					} else {
						int freq = map.get(token);
						map.put(token, ++freq);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//print the words with the freq
		Set<String> keySet=map.keySet();
		for(String key: keySet) {
			System.out.println(key +" : "+ map.get(key));
		}
		
	}
}
