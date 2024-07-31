package com.threads.session2.classical_threads;
//Printer ---> 3 employee : race condition

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

class Printer {

	public void printLetter(String letter) {

		System.out.print("[");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(letter + "]");

	}

}

//how to achive fairness policy?
//class Printer{
//    private Lock lock=new ReentrantLock(true);//ReentrantLock vs ReadWriteLock
//
//    public void printLetter(String letter){
//       try{
//           lock.lock();
//           System.out.print("[");
//           try{
//               Thread.sleep(1000);
//           }catch (InterruptedException e){}
//           System.out.println(letter+ "]");
//       }finally {
//           lock.unlock();
//       }
//    }
//
//}



class Client implements Runnable {
	private String letter;
	private Printer printer;
	private Thread thread;

	public Client(String letter, Printer printer) {
		this.letter = letter;
		this.printer = printer;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
			printer.printLetter(letter);
	}
}

public class A_NeedOfSyn {
	public static void main(String[] args) {

		Printer printer = new Printer();
		Client c1 = new Client("i love java", printer);
		Client c2 = new Client("i hate java", printer);
		Client c3 = new Client("i love maths", printer);

	}
}
