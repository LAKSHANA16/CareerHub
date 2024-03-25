package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.JobListingDto;
import com.util.DBUtil;





public class JobListingDaoImpl implements JobListingDao
{
	Connection conn;
	DBUtil db=new DBUtil();
	public List<JobListingDto> fetchDet()
	{
		conn=db.dbConnect();
	 List<JobListingDto>list1=new ArrayList<>();
	String sql="select *"
			+ "from joblisting j  join jobapplication a "
			+ "on j.job_id=a.JobListing_job_id join "
			+ "applicant p on p.applicant_id=a.Applicant_applicant_id";
	try {
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rst=pstmt.executeQuery();
	
	while(rst.next())
	{
		
		int applicantId=rst.getInt("applicant_id");
		String firstName=rst.getString("first_name");
		String lastName=rst.getString("last_name");
		String email=rst.getString("email");
		String phonenumber=rst.getString("phonenumber");
		String resume=rst.getString("resume");
		String jobTitle=rst.getString("job_title");
		String jobDescription=rst.getString("job_description");
		//save to obj
		JobListingDto v=new JobListingDto();
	    v.setApplicantId(applicantId);
	    v.setFirstName(firstName);
	    v.setLastName(lastName);
	    v.setPhonenumber(phonenumber); 
	    v.setResume(resume);
	    v.setJobTitle(jobTitle);
	    v.setJobDescription(jobDescription);
		
		list1.add(v);
	  
	}
	
}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	db.dbClose();
	return list1;
}

}
