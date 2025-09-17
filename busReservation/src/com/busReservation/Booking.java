package com.busReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {

	String passengerName;
	int BusNo;
	Date date;

	Booking() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		passengerName = sc.next();
		System.out.println("Enter BusNo:");
		BusNo = sc.nextInt();
		System.out.println("enter date in this format :dd-mm-yyy");
		String dateInput = sc.next();
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyy");

		try {
			date = sf.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> bus) {
		// get capacity and booking date avaialblity then check
		// get capacity of bus from a particular busno

		int capacity = 0;

		for (Bus b : bus) {

			if (b.getBusno() == BusNo) {
				capacity = b.getCapacity();
			}

		}
		
		int booked=0;
		for(Booking b:booking) {
			if(b.BusNo==BusNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true: false;
	}

}
