package com.chinasofti.etc.bookshop.dao.jdbcimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.bookshop.dao.EmployeeDao;
import com.chinasofti.etc.bookshop.po.Employee;

public class EmployeeDaoImpl extends BaseDao implements EmployeeDao{
	/*
	 * 显示所有员工信息
	 * */
		public List<Employee> findAllEmployee(){
			List<Employee> employees = new ArrayList<Employee>();
			getConn();
			String sql = "Select * from Employees";
			doQuery(sql);
			try {
				while(rs.next()){
					Employee employee = new Employee();
					employee.setEmployeeId(rs.getInt(1));
					employee.setEmployeeNo(rs.getString(2));
					employee.setEmployeeName(rs.getString(3));
					employee.setEmployeeRole(rs.getString(4));
					employee.setEmployeeSex(rs.getString(5));
					employees.add(employee);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			closeAll();
			return employees;
		}
	/*
	 * 根据ID查找员工信息
	 * */
		public Employee findEmployByEmployeeId(int employeeId){
			Employee employee = null;
			getConn();
			String sql = "Select * from Employees where employeeid = ?";
			doQuery(sql,employeeId);
			try {
				while(rs.next()){
				employee.setEmployeeId(rs.getInt(1));
				employee.setEmployeeNo(rs.getString(2));
				employee.setEmployeeName(rs.getString(3));
				employee.setEmployeeRole(rs.getString(4));
				employee.setEmployeeSex(rs.getString(5));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			closeAll();
			return employee;
		}
		/*
		 * 根据姓名查找员工信息
		 * */
		public Employee findEmployByEmployeeName(String employeeName){
			Employee employee = null;
			getConn();
			String sql = "Select * from Employees where employeename = ?";
			doQuery(sql,employeeName);
			try {
				while(rs.next()){
				employee.setEmployeeId(rs.getInt(1));
				employee.setEmployeeNo(rs.getString(2));
				employee.setEmployeeName(rs.getString(3));
				employee.setEmployeeRole(rs.getString(4));
				employee.setEmployeeSex(rs.getString(5));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			closeAll();
			return employee;
		}
	/*
	 * 员工信息的添加
	 * */
		public int addEmployees(Employee employee) {
			// TODO Auto-generated method stub
			getConn();
			String sql = "insert into Employees value(?,?,?,?,?)";
			doOperate(sql, employee.getEmployeeId(),employee.getEmployeeNo(),employee.getEmployeeName(),employee.getEmployeeRole(),employee.getEmployeeSex());
			closeAll();
			return 0;
		}
	 /*
	  * 员工信息的删除
	  * */
		public int deleteEmployees(int employeeId) {
			// TODO Auto-generated method stub
			getConn();
			//find
			//show
			//Customer
			//id=? name =？  
			//doOperate(sql, Customer.getId())
			String sql = "delete from Employees where employeeId = ?";
			doOperate(sql,employeeId);
			closeAll();
			return 0;
		}
	/*
	 * 员工信息的修改
	 * */
		public int modifyEmployees(int employeeId) {
			// TODO Auto-generated method stub
			getConn();
			findEmployByEmployeeId(employeeId);
			String sql = "update from Employees set employeeNo=? employeeName=? employeeRole=? employeeSex=? where employeeId=?";
			doOperate(sql,employeeId);
			closeAll();
			return 0;
		}
		/*
		 * 初始化数据库（员工部分）
		 * */
		public void doEmployeeInit() {
			// TODO Auto-generated method stub
			getConn();
			
			String sql = null;
			if (!existTable("Employees")) {
				// 初始化表Employees
				sql = "create table Employees(employeeId int primary key identity(1,1), employeeNo nvarchar(100), employeeName nvarchar(100), employeeRole nvarchar(100), employeeSex nvarchar(100))";
				doOperate(sql);
				sql = "insert into Employees values('00001', 'AAA', 'AAA', '男')";
				doOperate(sql);
				sql = "insert into Employees values('00002', 'BBB', 'BBB', '女')";
				doOperate(sql);
				sql = "insert into Employees values('00003', 'CCC', 'CCC', '男')";
				doOperate(sql);
				System.out.println("====初始化表Employees成功===");

			}
		}
}
