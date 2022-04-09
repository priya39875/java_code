package com.priya.multithreading;

/* thread can be achieved in 2 ways 
 * one by extending the thread class from java.lang package and the other by
 * implementing runnable interface
 */

//implementing runnable is used only when we use jst run method
public class MultiThreadingDemo2 implements Runnable{

	@Override /*we need to override run method as we have this method available in thread class
	If we don't override run method then it is like creating thread and says thread to do nothing.
	*/
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//t.start(); if we use this we will get error as implementing runnable allows only run method
		Thread thread=new Thread(); //if we implement runnable we need to create thread using thread class
		thread.start();
		System.out.println(thread.getName());
	
	}

	}
