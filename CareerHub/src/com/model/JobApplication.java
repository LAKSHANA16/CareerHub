package com.model;

import java.time.LocalDate;

public class JobApplication {
	private int applicationId;
	private int JobListingJobId;
	private int ApplicantApplicantId;
	private LocalDate applicationDate;
	private String coverLetter;
	public JobApplication() {}
	public JobApplication(int applicationId, int jobListingJobId, int applicantApplicantId, LocalDate applicationDate,
			String coverLetter) {
		super();
		this.applicationId = applicationId;
		JobListingJobId = jobListingJobId;
		ApplicantApplicantId = applicantApplicantId;
		this.applicationDate = applicationDate;
		this.coverLetter = coverLetter;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getJobListingJobId() {
		return JobListingJobId;
	}
	public void setJobListingJobId(int jobListingJobId) {
		JobListingJobId = jobListingJobId;
	}
	public int getApplicantApplicantId() {
		return ApplicantApplicantId;
	}
	public void setApplicantApplicantId(int applicantApplicantId) {
		ApplicantApplicantId = applicantApplicantId;
	}
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getCoverLetter() {
		return coverLetter;
	}
	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
	@Override
	public String toString() {
		return "JobApplication [applicationId=" + applicationId + ", JobListingJobId=" + JobListingJobId
				+ ", ApplicantApplicantId=" + ApplicantApplicantId + ", applicationDate=" + applicationDate
				+ ", coverLetter=" + coverLetter + "]";
	}
	
}
