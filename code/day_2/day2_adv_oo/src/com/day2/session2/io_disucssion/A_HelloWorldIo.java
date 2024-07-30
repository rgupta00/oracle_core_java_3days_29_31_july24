package com.day2.session2.io_disucssion;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_HelloWorldIo {

	public static void main(String[] args) {
		//Decorator design pattern
		//how to read a photo
//		try {
//			FileReader fr=new FileReader(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\m_ali\\foo.txt"));
//			FileWriter fw=new FileWriter(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\m_ali\\foo2.txt"));
//			
//			int i=0;
//			while((i=fr.read())!=-1) {
//				fw.write(i);
//			}
//			
//			fr.close();
//			fw.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		long start=System.currentTimeMillis();
//		
//		try {
//			FileInputStream fr=new FileInputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\m_ali\\ali.jpg"));
//			FileOutputStream fw=new FileOutputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\m_ali\\ali2.jpg"));
//			
//			int i=0;
//			while((i=fr.read())!=-1) {
//				fw.write(i);
//			}
//			
//			fr.close();
//			fw.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		long end=System.currentTimeMillis();
//		System.out.println("time taken: "+ (end-start)+" ms");
		
		
		long start=System.currentTimeMillis();
		
		try {
			//don't use buffering
			//BufferedInputStream vs FileInputStream
			BufferedInputStream fr=
					new BufferedInputStream(new FileInputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\m_ali\\ali.jpg")));
			
			BufferedOutputStream fw=
					new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\m_ali\\ali2.jpg")));
			
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end=System.currentTimeMillis();
		System.out.println("time taken: "+ (end-start)+" ms");
	}
}
