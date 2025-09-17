package com.busReservation;

public class Bus {

	private int busNo;
	private boolean isAc;
	private int capacity;

	Bus(int busno, boolean isac, int capacity) {

		this.busNo = busno;
		this.isAc = isac;
		this.capacity = capacity;

	}

	public void setBusNo(int busno) {
		this.busNo = busno;
	}

	public void isAc(boolean istrue) {
		this.isAc = istrue;
	}

	public void capacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean getAc() {
		return isAc;
	}

	public int getBusno() {
		return busNo;
	}

	public void displaybusinfo() {
		System.out.println(busNo + " " + isAc + " " + capacity);
	}

}
