package com.turnon.web.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="doctor")
public class DoctorProfile { // extends UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	private String registrationNo;
	private List<String> qualifications;
	private List<String> specialities;
	private List<Clinic> clinics;
	private String treatmentTime;
	

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public DoctorProfile() {
	}

	
	public DoctorProfile(String registrationNo, List<String> qualifications, List<String> specialities,
			List<Clinic> clinics, String treatmentTime) {
		this.registrationNo = registrationNo;
		this.qualifications = qualifications;
		this.specialities = specialities;
		this.clinics = clinics;
		this.treatmentTime = treatmentTime;
	}

	public List<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}

	public List<String> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(List<String> specialities) {
		this.specialities = specialities;
	}

	public List<Clinic> getClinics() {
		return clinics;
	}

	public void setClinics(List<Clinic> clinics) {
		this.clinics = clinics;
	}

	public String getTreatmentTime() {
		return treatmentTime;
	}

	public void setTreatmentTime(String treatmentTime) {
		this.treatmentTime = treatmentTime;
	} 

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
