package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.exception.DataBaseConnectionException;

import com.model.JobApplication;
import com.util.DBUtil;

public class JobApplicationDaoImpl {
Connection conn;
DBUtil db=new DBUtil();
	public List<JobApplication> getdetails() throws SQLException, DataBaseConnectionException {
		List<JobApplication> list=new ArrayList<>();
		conn=db.dbConnect();
		String sql="select*from jobapplication";
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ResultSet rst=ps.executeQuery();
		while(rst.next()) {
			int applicationId=rst.getInt("application_id");
			int JobListingJobId=rst.getInt("JobListing_job_id");
			int ApplicantApplicantId=rst.getInt("Applicant_applicant_id");
			LocalDate applicationDate=rst.getDate("application_date").toLocalDate();
			String coverLetter=rst.getString("cover_letter");
		    JobApplication j=new JobApplication(applicationId,JobListingJobId,ApplicantApplicantId, applicationDate,
					coverLetter);
		    list.add(j);
		}
		db.dbClose();
		return list;
}
}
