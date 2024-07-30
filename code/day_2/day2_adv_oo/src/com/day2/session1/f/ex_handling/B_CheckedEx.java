package com.day2.session1.f.ex_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class B_CheckedEx {

	public static void main(String[] args) {
//		BufferedReader br=null;
//		try {
//			 br = new BufferedReader(new FileReader(new File("foo.txt")));
//			// print the file
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("file is not found");
//		} catch (IOException e) {
//			System.out.println("io ex");
//		}finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		// closing of resouce is automized now in java ( java 7)

		// Automatic resouce mgt ARM :)

		try (BufferedReader br = new BufferedReader(new FileReader(new File("foo.txt")))) {
			// print the file
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		} 
		 catch (IOException e) {
			System.out.println("io ex");
		}
		 catch (Exception e) {
			System.out.println(" ex");
		}
	}
}


