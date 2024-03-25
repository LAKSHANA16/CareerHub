package com.service;

import java.sql.SQLException;

import com.dao.ApplicantDaoImpl;

public class ApplicantService {
	ApplicantDaoImpl 	applicantDaoImpl=new 	ApplicantDaoImpl();
	public void signUp(int applicantId,String firstName,String lastName,String email,String phonenumber,String resume)throws SQLException
	{
		applicantDaoImpl.signUp(applicantId,firstName, lastName, email, phonenumber, resume);
	}
}
