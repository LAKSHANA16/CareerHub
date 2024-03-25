package com.model;

public class ApplicantModel {
private int applicantId;
private String firstName;
private String lastName;
private String email;
private String phonenumber;
private String resume;
public ApplicantModel() {}
public ApplicantModel(int applicantId, String firstName, String lastName, String email, String phonenumber,
		String resume) {
	super();
	this.applicantId = applicantId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phonenumber = phonenumber;
	this.resume = resume;
}

public ApplicantModel(String firstName, String lastName, String email, String phonenumber, String resume) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phonenumber = phonenumber;
	this.resume = resume;
}
public int getApplicantId() {
	return applicantId;
}
public void setApplicantId(int applicantId) {
	this.applicantId = applicantId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getResume() {
	return resume;
}
public void setResume(String resume) {
	this.resume = resume;
}
@Override
public String toString() {
	return "ApplicantModel [applicantId=" + applicantId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", email=" + email + ", phonenumber=" + phonenumber + ", resume=" + resume + "]";
}

}
