package com.turnon.core.model;

public class Session {
	private HourMinute startTime;
	private HourMinute endMinute;

	public HourMinute getStartTime() {
		return startTime;
	}

	public void setStartTime(HourMinute startTime) {
		this.startTime = startTime;
	}

	public HourMinute getEndMinute() {
		return endMinute;
	}

	public void setEndMinute(HourMinute endMinute) {
		this.endMinute = endMinute;
	}
}
