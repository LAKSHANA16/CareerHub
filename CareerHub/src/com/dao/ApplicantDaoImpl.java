package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.DataBaseConnectionException;
import com.model.ApplicantModel;
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
public List<ApplicantModel> getApplicant() throws SQLException, DataBaseConnectionException {
	List<ApplicantModel> list=new ArrayList<>();
	conn=db.dbConnect();
	String sql="select*from applicant";
	PreparedStatement ps=conn.prepareStatement(sql);
	
	ResultSet rst=ps.executeQuery();
	while(rst.next()) {
		int applicantId=rst.getInt("applicant_id");
		String firstName=rst.getString("first_name");
		String lastName=rst.getString("last_name");
		String email=rst.getString("email");
		String phonenumber=rst.getString("phonenumber");
		String resume=rst.getString("resume");
	    ApplicantModel a=new ApplicantModel(applicantId,firstName,lastName,email,phonenumber,resume);
	    list.add(a);
	}
	db.dbClose();
	return list;
}


}
