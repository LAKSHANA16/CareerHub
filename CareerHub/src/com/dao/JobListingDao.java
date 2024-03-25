package com.dao;

import java.util.List;

import com.dto.JobListingDto;

public interface JobListingDao {
	
	public List<JobListingDto> fetchDet();
}
