package com.dao;

import java.sql.SQLException;

import com.dto.CompanyDto;
import com.exception.InvalidIdException;


public interface CompanyDao {
	public CompanyDto getByID(int CompanyCompanyId) throws SQLException, InvalidIdException ;
}
