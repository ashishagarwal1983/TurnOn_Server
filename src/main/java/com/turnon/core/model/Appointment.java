package com.turnon.core.model;

import java.io.Serializable;
import java.util.Date;

public class Appointment implements Serializable {

	private static final long serialVersionUID = 1L;
	// This date object will not contain any time value. It will only reprsent a
	// day
	private Date date;
	private UserProfile doctorProfile;
	private UserProfile patientProfile;
	// This is a tr
	private HourMinute appointmentTime;
	private Address address;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public UserProfile getDoctorProfile() {
		return doctorProfile;
	}

	public void setDoctorProfile(UserProfile doctorProfile) {
		this.doctorProfile = doctorProfile;
	}

	public UserProfile getPatientProfile() {
		return patientProfile;
	}

	public void setPatientProfile(UserProfile patientProfile) {
		this.patientProfile = patientProfile;
	}

	public HourMinute getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(HourMinute appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
