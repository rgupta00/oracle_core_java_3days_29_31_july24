package com.day2.session3.data_stru;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class D_Print_unique_words {

	public static void main(String[] args) {
		// read this file till end make token of each line and put those tokens into a
		// set.. and set dont allow duplicate
		// print the set
		Set<String> wordSet = new TreeSet<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("foo.txt")));
			String line=null;
			while((line=br.readLine())!=null) {
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					wordSet.add(token);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(String word: wordSet) {
			System.out.println(word);
		}
	}
}
