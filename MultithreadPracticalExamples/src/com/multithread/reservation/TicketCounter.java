package com.multithread.reservation;

public class TicketCounter{
	
	private int availableSeats = 3;
	
	public synchronized void bookTicket(String passengerName, int numberOfSeats) {
		if(availableSeats >=numberOfSeats && (numberOfSeats>0)) {
			System.out.println("Hi, "+passengerName + " : "+numberOfSeats +" seats booked successfully ");
			availableSeats =availableSeats-numberOfSeats;
		}else {
			System.out.println("Hi "+ passengerName + " : seats not available");
		}
	}

}
