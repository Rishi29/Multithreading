package org.rishi.multithread;

public class Multi implements Runnable {
	
	public void run(){
		System.out.println("Thread created by runnbale interface is running");
		
	}
	
	public static void main(String[]args){
		Multi m1= new Multi();
		
		Thread t1= new Thread(m1);
		t1.start();
		
		
	}
	
	
	

}
