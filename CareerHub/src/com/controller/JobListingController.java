package com.controller;

import java.util.List;
import java.util.Scanner;
import com.service.JobListingService;
import com.dto.JobListingDto;

public class JobListingController
{
	public static void main(String[] args) 
	{
		JobListingService jobListingService=new JobListingService();
		Scanner sc = new Scanner(System.in);
	     
		while (true){
			System.out.println("***********APPLICANT OPS*************");
			System.out.println("ENTER 1 TO List all details");
			System.out.println("ENTER 0 TO EXIT");
			int input = sc.nextInt();
			if (input == 0) 
			{
				System.out.println("EXITING......THANK YOU!!!!");
				break;
			}
			switch (input) 
			{
			case 1:
				System.out.println("Fetch");
				System.out.println("FETCH ALL DETAILS");
				List<JobListingDto>list=jobListingService.fetchDet();
				for(JobListingDto v:list)
				{
					System.out.println("JobListingDto [applicantId=" + v.getApplicantId() + ", firstName=" + v.getFirstName() + ", lastName=" + v.getLastName()
							+ ", email=" +v.getEmail()  + ", phonenumber=" + v.getPhonenumber() + ", resume=" +v.getResume() + ", jobTitle=" + v.getJobTitle()
							+ ", jobDescription=" + v.getJobDescription() + "]");
				}
				break;
				default:
					System.out.println("Invalid input");
					break;
			}
		}
	}
}
