package com.priya.multithreading;
/* thread can be achieved in 2 ways 
 * one by extending the thread class from java.lang package and the other by
 * implementing runnable interface
 */
public class MultiThreadingDemo1 extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i+1);
		}
	}

	public static void main(String[] args) {
		MultiThreadingDemo1 d= new MultiThreadingDemo1();
		System.out.println(Thread.currentThread().getName());
		d.start();
	}
}


