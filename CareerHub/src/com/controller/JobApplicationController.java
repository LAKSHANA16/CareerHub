package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.service.JobApplicationService;
import com.exception.DataBaseConnectionException;
import com.model.JobApplication;



public class JobApplicationController
{
	public static void main(String[] args) throws SQLException, DataBaseConnectionException {
		Scanner sc = new Scanner(System.in);
		JobApplicationService jobApplicationService = new JobApplicationService();
		while (true) {
			System.out.println("*********** OPS*************");
			System.out.println("ENTER 1 TO display");
			System.out.println("Enter 2 to fetch");
			System.out.println("ENTER 0 TO EXIT");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("EXITING......THANK YOU!!!!");
				break;
			}
			switch (input) {
			case 1:
				try {
					List<JobApplication> list=jobApplicationService.getdetails();
					for(JobApplication j:list) {
						System.out.println(j);
					}
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			
				
}
}
	}
}