package com.visog.services;

import java.util.List;

import com.visog.model.Employee;
import com.visog.model.req.EmployeeReq;

public interface DataServices {
	
	public boolean addEntity(EmployeeReq employee) throws Exception;
	public Employee getEntityById(long id) throws Exception;
	public List<Employee> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;

}
