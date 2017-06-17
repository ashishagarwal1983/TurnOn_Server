package com.turnon.web.model;


public class Session {
    private HourMinute startTime;
    private HourMinute endMinute;
    
    public Session() {
	}
    
	public Session(HourMinute startTime, HourMinute endMinute) {
		this.startTime = startTime;
		this.endMinute = endMinute;
	}
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
