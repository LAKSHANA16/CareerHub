package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.CompanyDto;
import com.exception.DataBaseConnectionException;
import com.exception.InvalidIdException;


public interface CompanyDao {

	public List<CompanyDto> getByID() throws SQLException ;
	}
