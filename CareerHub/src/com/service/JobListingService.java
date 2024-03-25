package com.service;

import java.util.List;

import com.dao.JobListingDaoImpl;
import com.dto.JobListingDto;

public class JobListingService {
	JobListingDaoImpl jobListingDaoImpl=new JobListingDaoImpl();
	public List<JobListingDto> fetchDet()
	{
		return jobListingDaoImpl.fetchDet();
	}
}
