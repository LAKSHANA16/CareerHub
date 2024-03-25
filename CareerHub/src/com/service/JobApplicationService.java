package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.JobApplicationDaoImpl;
import com.exception.DataBaseConnectionException;
import com.model.JobApplication;

public class JobApplicationService {
	JobApplicationDaoImpl jobApplicationDaoImpl=new JobApplicationDaoImpl();
	public List<JobApplication> getdetails() throws SQLException, DataBaseConnectionException 
		{
			return jobApplicationDaoImpl.getdetails();
		}
}
