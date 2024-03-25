package com.service;

import java.sql.SQLException;

import com.dao.CompanyDaoImpl;
import com.dto.CompanyDto;
import com.exception.InvalidIdException;


public class CompanyService {
	CompanyDaoImpl companyDaoImpl=new CompanyDaoImpl();
	public CompanyDto getByID(int CompanyCompanyId) throws SQLException,InvalidIdException 
	{
		return companyDaoImpl.getByID(CompanyCompanyId);
	}
}
