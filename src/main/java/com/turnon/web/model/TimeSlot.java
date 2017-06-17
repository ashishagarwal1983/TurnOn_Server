package com.turnon.web.model;

import java.time.DayOfWeek;
import java.util.List;

public class TimeSlot {
	private DayOfWeek day;
	private List<Session> sessions;

	public TimeSlot() {
	}

	public TimeSlot(DayOfWeek day, List<Session> sessions) {
		super();
		this.day = day;
		this.sessions = sessions;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
}
