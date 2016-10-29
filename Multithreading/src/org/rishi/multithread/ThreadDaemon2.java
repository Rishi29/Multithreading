package org.rishi.multithread;

public class ThreadDaemon2 extends Thread{
	
	public void run(){
		System.out.println("Thread Name "+ Thread.currentThread().getName());
		System.out.println("Daemon "+ Thread.currentThread().isDaemon());
	}
	
	public static void main (String[]args){
		
		ThreadDaemon2 t1= new ThreadDaemon2();
		ThreadDaemon2 t2= new ThreadDaemon2();
		
		t1.start();
		
		t1.setDaemon(true);//it will throw exception, user thread after being started cant be set to Daemon thread.
		t2.start();
	}

}
