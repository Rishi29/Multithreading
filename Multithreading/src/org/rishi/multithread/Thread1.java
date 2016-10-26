package org.rishi.multithread;

public class Thread1 extends Thread{
	
	
	public void run(){
		System.out.println("threda is running");
	}
	
	public static void main(String[]args){
		Thread1 t1= new Thread1();
		t1.start();
	}

}
