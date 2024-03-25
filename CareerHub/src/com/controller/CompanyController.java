package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.CompanyDto;
import com.exception.InvalidIdException;
import com.model.ApplicantModel;
import com.service.CompanyService;


public class CompanyController {
	public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner(System.in);
	CompanyService companyService = new CompanyService();
	while (true){
		System.out.println("*********** OPS*************");
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
			try
			{
				List<CompanyDto> list=companyService.getByID();
				for(CompanyDto c:list) {
					System.out.println(c);
				}
				
			}
			catch(SQLException e)
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
