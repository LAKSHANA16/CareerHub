package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.DataBaseConnectionException;
import com.model.JobApplication;

public interface JobApplicationDao {
	public List<JobApplication> getdetails() throws SQLException, DataBaseConnectionException;
}
