package org.rishi.multithread;


// Creating thread by extending Thread class
public class Thread1 extends Thread{
	
	
	public void run(){
		System.out.println("thred created by extending Thread Class is running");
	}
	
	public static void main(String[]args){
		Thread1 t1= new Thread1();
		t1.start();
	}

}
