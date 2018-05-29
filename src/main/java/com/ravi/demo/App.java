package com.ravi.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {		
    	Counter cnt = new  Counter();
    	cnt.increment();
        System.out.println( cnt.count );
    }
}

class Counter
{
	int count = 0;
	public  void increment() {
		count++;
	}	
}