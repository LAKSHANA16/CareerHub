package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.exception.DataBaseConnectionException;
import com.model.ApplicantModel;
import com.service.ApplicantService;

public class ApplicantController {
	public static void main(String[] args) throws SQLException, DataBaseConnectionException {
		Scanner sc = new Scanner(System.in);
		ApplicantService applicantService = new ApplicantService();
		while (true) {
			System.out.println("***********APPLICANT OPS*************");
			System.out.println("ENTER 1 TO SIGN UP");
			System.out.println("Enter 2 to fetch");
			System.out.println("ENTER 0 TO EXIT");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("EXITING......THANK YOU!!!!");
				break;
			}
			switch (input) {
			case 1:
				System.out.println("TO CREATE PROFILE SIGN UP@@@");
				System.out.println("ENTER ID:");
				int applicantId=sc.nextInt();
				System.out.println("ENTER FIRST NAME:");
				sc.nextLine();
				String firstName = sc.nextLine();
				System.out.println("ENTER LAST NAME:");
				String lastName = sc.nextLine();
				System.out.println("ENTER EMAIL:");
				String email = sc.nextLine();
				System.out.println("ENTER PHONENUMBER:");
				String phonenumber = sc.nextLine();
				System.out.println("ENTER RESUME LINK:");
				String resume = sc.nextLine();
				applicantService.signUp(applicantId,firstName, lastName, email, phonenumber, resume);
				break;
case 2:
				
				System.out.println("all applicants details");
				try {
					List<ApplicantModel> list=applicantService.getApplicant();
					for(ApplicantModel a:list) {
						System.out.println(a);
					}
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
default:
				System.out.println("INVALID INPUT");
				break;
			}
		}
	}
}
