package com.chinasofti.etc.bookshop.service;

import java.util.List;

import com.chinasofti.etc.bookshop.po.Employee;

public interface EmployeeService {
	List<Employee> findAllEmployee();
    Employee findEmployByEmployeeId(int employeeId);
    Employee findEmployByEmployeeName(String employeeName);
    int addEmployees(Employee employee);
    int deleteEmployees(int employeeId);
    int modifyEmployees(int employeeId);
    public void doEmployeeInit();
}
