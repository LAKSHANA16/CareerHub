package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.dto.CompanyDto;
import com.exception.InvalidIdException;

import com.service.CompanyService;


public class CompanyController {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CompanyService companyService = new CompanyService();
	while (true){
		System.out.println("***********APPLICANT OPS*************");
		System.out.println("ENTER 1 TO List all Job");
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
			System.out.println("SEARCH BY Id");
			System.out.println("Enter the id");
			int CompanyCompanyId=sc.nextInt();
			try
			{
				CompanyDto c=companyService.getByID(CompanyCompanyId);
				System.out.println(c);
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
			catch(InvalidIdException e)
			{
				System.out.println(e.getMessage());
			}
			break;
			default:
				System.out.println("Invalid Id");
				break;
}
	}
}
}
