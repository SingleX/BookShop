package com.chinasofti.etc.bookshop.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.bookshop.dao.EmployeeDao;
import com.chinasofti.etc.bookshop.po.Employee;
import com.chinasofti.etc.bookshop.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	File file = new File("F:\\myeclipse\\Config.properties");
	Properties properties = new Properties();

	public List<Employee> findAllEmployee() {
		try {
			properties.load(new FileInputStream(file));
			String employeeDaoString = properties
					.getProperty("employeeDaoString");
			EmployeeDao employeeDao = (EmployeeDao) Class.forName(
					employeeDaoString).newInstance();
			return employeeDao.findAllEmployee();
		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Employee findEmployByEmployeeId(int employeeId) {
		try {
			properties.load(new FileInputStream(file));
			String employeeDaoString = properties
					.getProperty("employeeDaoString");
			EmployeeDao employeeDao = (EmployeeDao) Class.forName(
					employeeDaoString).newInstance();
			return employeeDao.findEmployByEmployeeId(employeeId);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Employee findEmployByEmployeeName(String employeeName) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String employeeDaoString = properties
					.getProperty("employeeDaoString");
			EmployeeDao employeeDao = (EmployeeDao) Class.forName(
					employeeDaoString).newInstance();
			return employeeDao.findEmployByEmployeeName(employeeName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int addEmployees(Employee employee) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String employeeDaoString = properties
					.getProperty("employeeDaoString");
			EmployeeDao employeeDao = (EmployeeDao) Class.forName(
					employeeDaoString).newInstance();
			return employeeDao.addEmployees(employee);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteEmployees(int employeeId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String employeeDaoString = properties
					.getProperty("employeeDaoString");
			EmployeeDao employeeDao = (EmployeeDao) Class.forName(
					employeeDaoString).newInstance();
			return employeeDao.deleteEmployees(employeeId);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int modifyEmployees(int employeeId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String employeeDaoString = properties
					.getProperty("employeeDaoString");
			EmployeeDao employeeDao = (EmployeeDao) Class.forName(
					employeeDaoString).newInstance();
			return employeeDao.modifyEmployees(employeeId);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public void doEmployeeInit() {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String employeeDaoString = properties
					.getProperty("employeeDaoString");
			EmployeeDao employeeDao = (EmployeeDao) Class.forName(
					employeeDaoString).newInstance();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
