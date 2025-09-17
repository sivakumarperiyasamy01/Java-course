package com.busReservation;

import java.util.*;

public class BookingRunner {

	public static void main(String[] args) {

		// bus objects created before taking the booking
		ArrayList<Bus> bus = new ArrayList<Bus>();
		bus.add(new Bus(1, true, 2));
		bus.add(new Bus(2, false, 30));
		bus.add(new Bus(3, true, 25));

		for (Bus b : bus) {
			b.displaybusinfo();
		}

		// once booking confirmed then add to booking collection
		ArrayList<Booking> booking = new ArrayList<Booking>();

		Scanner sc1 = new Scanner(System.in);
		int userop = 1;

		while (userop == 1) {
			System.out.println("Enter 1 to book and enter 2 exit");
			userop = sc1.nextInt();

			if (userop == 1) {

				Booking b1 = new Booking();
				
				if(b1.isAvailable(booking,bus)) {
					booking.add(b1);
					System.out.println("booking done");
				}else {
					System.out.println("bus is full try another bus");
				}

			}

		}

	}

}
