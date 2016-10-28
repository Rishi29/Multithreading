package org.rishi.multithread;

public class CurrentMethods extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[]args){
		
		CurrentMethods t1= new CurrentMethods();
		CurrentMethods t2= new CurrentMethods();
		
		
		t1.start();
		t2.start();
	}

}
