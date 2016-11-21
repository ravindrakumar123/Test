package com.visog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.visog.dao.DataDao;
import com.visog.model.Employee;
import com.visog.model.req.EmployeeReq;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(EmployeeReq employeeReq) throws Exception {
		Employee employee= new Employee();
		employee.setEmail(employeeReq.getEmail());
		employee.setFirstName(employeeReq.getFirstName());
		employee.setLastName(employeeReq.getLastName());
		employee.setPhone(employeeReq.getPhone());
		
		// TODO Auto-generated method stub
		return dataDao.addEntity(employee);
	}

	@Override
	public Employee getEntityById(long id) throws Exception {
		// TODO Auto-generated method stub
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {
		// TODO Auto-generated method stub
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		// TODO Auto-generated method stub
		return dataDao.deleteEntity(id);
	}

}
