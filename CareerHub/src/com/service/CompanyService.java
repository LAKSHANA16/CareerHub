package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.CompanyDaoImpl;
import com.dto.CompanyDto;
import com.exception.InvalidIdException;


public class CompanyService {
	CompanyDaoImpl companyDaoImpl=new CompanyDaoImpl();
	public List<CompanyDto> getByID() throws SQLException 
	{
		return companyDaoImpl.getByID();
	}
	
}
