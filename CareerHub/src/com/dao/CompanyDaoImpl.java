package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.dto.CompanyDto;
import com.exception.InvalidIdException;

import com.util.DBUtil;


public class CompanyDaoImpl implements CompanyDao 
{
	DBUtil db=new DBUtil();
	Connection conn;
	public CompanyDto getByID(int CompanyCompanyId) throws SQLException,InvalidIdException
	{
		 conn=db.dbConnect();
		String sql="select * from joblisting j,company c"
				+" where c.company_id=j.Company_company_id"
				+ " and j.Company_company_id=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, CompanyCompanyId);
		ResultSet rst=pstmt.executeQuery();
		if(rst.next())
		{
			int CompanyCompanyId1=rst.getInt("Company_company_id");
			int jobId=rst.getInt("job_id");
			String jobTitle=rst.getString("job_title");
			String jobDescription=rst.getString("job_description");
			String jobLocation=rst.getString("job_location");
			double salary=rst.getDouble("salary");
			LocalDate postedDate=rst.getDate("posted_date").toLocalDate();
			String companyName=rst.getString("company_name");
			//save to obj
			CompanyDto c=new CompanyDto();
			c.setCompanyCompanyId(CompanyCompanyId1);
			c.setJobId(jobId);
			c.setJobTitle(jobTitle);
			c.setJobDescription(jobDescription);
			c.setJobLocation(jobLocation);
			c.setSalary(salary);
			c.setPostedDate(postedDate);
			c.setCompanyName(companyName);
			return c;
		}
		db.dbClose();
		throw new InvalidIdException("Invalid Id");
		
}
}
