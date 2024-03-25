package com.dto;

public class JobListingDto {
	private int applicantId;
	private String firstName;
	private String lastName;
	private String email;
	private String phonenumber;
	private String resume;
	private String jobTitle;
	private String jobDescription;
	public JobListingDto() {// TODO Auto-generated constructor stub
	}
	public JobListingDto(int applicantId, String firstName, String lastName, String email, String phonenumber,
			String resume, String jobTitle, String jobDescription) {
		super();
		this.applicantId = applicantId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phonenumber = phonenumber;
		this.resume = resume;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	@Override
	public String toString() {
		return "JobListingDto [applicantId=" + applicantId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phonenumber=" + phonenumber + ", resume=" + resume + ", jobTitle=" + jobTitle
				+ ", jobDescription=" + jobDescription + "]";
	}
	
	
}
