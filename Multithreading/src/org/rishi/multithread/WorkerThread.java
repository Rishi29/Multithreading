package org.rishi.multithread;

public class WorkerThread implements Runnable{
	
	private String message;
	
	public WorkerThread(String s ){
		this.message=s;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" (Start) Message = "+message);
		processMessage(); //call process message that sleep the thread for 2 seconds
		
		System.out.println(Thread.currentThread().getName()+" End ");// print thread name 
		
	}
	
	private void processMessage(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e ){e.printStackTrace();}
	}

}
