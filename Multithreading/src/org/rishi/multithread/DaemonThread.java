package org.rishi.multithread;

public class DaemonThread extends Thread {
	

public void run(){
if(Thread.currentThread().isDaemon()){//check if current thread is Daemon thread
	System.out.println("Daemon thread work ");
}else{System.out.println("User thread work ");}
}

public static void main(String[]args){
	
	DaemonThread t1= new DaemonThread();
	DaemonThread t2 = new DaemonThread();
	DaemonThread t3= new DaemonThread();
	
	
	t1.setDaemon(true);// now t1 is daemon thread
	
	
	t1.start();
	t2.start();
	t3.start();
}

}
