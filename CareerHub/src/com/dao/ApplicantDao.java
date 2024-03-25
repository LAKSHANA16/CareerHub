package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.DataBaseConnectionException;
import com.model.ApplicantModel;

public interface ApplicantDao {
	public void signUp(int applicantId,String firstName,String lastName,String email,String phonenumber,String resume)throws SQLException;
	public List<ApplicantModel> getApplicant() throws SQLException, DataBaseConnectionException;

}
