package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DBUtil;

public class ApplicantDaoImpl implements ApplicantDao{
Connection conn;
DBUtil db=new DBUtil();
public void signUp(int applicantId,String firstName,String lastName,String email,String phonenumber,String resume)throws SQLException
{
	conn=db.dbConnect();
	String sql="insert into applicant values(?,?,?,?,?,?)";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setInt(1, applicantId);
	pstmt.setString(2,firstName);
	pstmt.setString(3,lastName);
	pstmt.setString(4,email);
	pstmt.setString(5,phonenumber);
	pstmt.setString(6,resume);
	pstmt.executeUpdate();
	db.dbClose();
}
}
