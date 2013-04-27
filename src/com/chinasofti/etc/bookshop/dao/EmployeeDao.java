package com.chinasofti.etc.bookshop.dao;

import java.util.List;

import com.chinasofti.etc.bookshop.po.Employee;

public interface EmployeeDao {
	List<Employee> findAllEmployee();
    Employee findEmployByEmployeeId(int employeeId);
    Employee findEmployByEmployeeName(String employeeName);
    int addEmployees(Employee employee);
    int deleteEmployees(int employeeId);
    int modifyEmployees(int employeeId);
    public void doEmployeeInit();
}
