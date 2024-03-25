package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ApplicantDaoImpl;
import com.exception.DataBaseConnectionException;
import com.model.ApplicantModel;

public class ApplicantService {
	ApplicantDaoImpl 	applicantDaoImpl=new 	ApplicantDaoImpl();
	public void signUp(int applicantId,String firstName,String lastName,String email,String phonenumber,String resume)throws SQLException
	{
		applicantDaoImpl.signUp(applicantId,firstName, lastName, email, phonenumber, resume);
	}
	public List<ApplicantModel> getApplicant() throws SQLException, DataBaseConnectionException {
return applicantDaoImpl.getApplicant();
}
}