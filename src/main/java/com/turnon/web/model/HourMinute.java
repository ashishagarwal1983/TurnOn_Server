package com.turnon.web.model;

import org.joda.time.Hours;
import org.joda.time.Minutes;

public class HourMinute {
	/*
	 * private Hours hour; private Minutes minute;
	 */

	String hours;
	String minutes;

	public HourMinute() {
	}

	public HourMinute(String hours, String minutes) {
		super();
		this.hours = hours;
		this.minutes = minutes;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}


	
	
}
