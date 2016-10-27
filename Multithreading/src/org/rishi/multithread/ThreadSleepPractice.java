package org.rishi.multithread;

/**This Class is to test the thread sleep
 * 
 * **/

public class ThreadSleepPractice extends Thread {
	
	public void run(){
		
		for(int i=1; i<5;i++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){System.out.println(e);}
			
			System.out.println(i);
		}
		
			}
	public static void main(String[]args){
		
		
		ThreadSleepPractice t1= new ThreadSleepPractice();
		ThreadSleepPractice t2= new ThreadSleepPractice();
		
		t1.start();
		t2.start();
		
	}
	

}
