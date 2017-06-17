package com.turnon.web.model;

import java.util.List;

public class Clinic {
	private Address address;
	private List<TimeSlot> timeSlots;

	public Clinic() {
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	public List<TimeSlot> getTimeSlots() {
		return timeSlots;
	}


	public void setTimeSlots(List<TimeSlot> timeSlots) {
		this.timeSlots = timeSlots;
	}


	public Clinic(Address address, List<TimeSlot> timeSlots) {
		super();
		this.address = address;
		this.timeSlots = timeSlots;
	}


}
