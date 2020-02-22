package com.multithread.reservation;

public class TicketBookingThread extends Thread{
	
	private TicketCounter ticketCounter;
	private String passengerName;
	private int numberOfSeats;
	
	
	public TicketBookingThread(TicketCounter ticketCounter, String passengerName, int numberOfSeats) {
		super();
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.numberOfSeats = numberOfSeats;
	}
	
	public void run() {
		
		ticketCounter.bookTicket(passengerName, numberOfSeats);
	}
	
	

}
