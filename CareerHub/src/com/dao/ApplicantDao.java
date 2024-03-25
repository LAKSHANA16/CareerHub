package com.dao;

import java.sql.SQLException;

public interface ApplicantDao {
	public void signUp(int applicantId,String firstName,String lastName,String email,String phonenumber,String resume)throws SQLException;
	
}
