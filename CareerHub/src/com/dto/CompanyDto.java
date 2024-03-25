package com.dto;

import java.time.LocalDate;

public class CompanyDto {
	private int jobId;
	private String jobTitle;
	private String jobDescription;
	private String jobLocation;
	private double salary;
	private LocalDate postedDate;
	private int CompanyCompanyId;
	private String companyName;
	private String location;
	public CompanyDto() {	// TODO Auto-generated constructor stub
	}
	public CompanyDto(int jobId, String jobTitle, String jobDescription, String jobLocation, double salary,
			LocalDate postedDate, int companyCompanyId, String companyName, String location) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.postedDate = postedDate;
		CompanyCompanyId = companyCompanyId;
		this.companyName = companyName;
		this.location = location;
	}
	
	public CompanyDto(String jobTitle, String jobDescription, String jobLocation, double salary, LocalDate postedDate,
			int companyCompanyId, String companyName, String location) {
		super();
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.postedDate = postedDate;
		CompanyCompanyId = companyCompanyId;
		this.companyName = companyName;
		this.location = location;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
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
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
	}
	public int getCompanyCompanyId() {
		return CompanyCompanyId;
	}
	public void setCompanyCompanyId(int companyCompanyId) {
		CompanyCompanyId = companyCompanyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "CompanyDto [jobId=" + jobId + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription
				+ ", jobLocation=" + jobLocation + ", salary=" + salary + ", postedDate=" + postedDate
				+ ", CompanyCompanyId=" + CompanyCompanyId + ", companyName=" + companyName + ", location=" + location
				+ "]";
	}
	
}
