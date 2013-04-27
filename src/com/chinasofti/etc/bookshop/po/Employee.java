package com.chinasofti.etc.bookshop.po;

public class Employee {
	 private int employeeId;
    private String employeeNo;
    private String employeeName;
    private String employeeRole;
    private String employeeSex;
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeSex(String employeeSex) {
		this.employeeSex = employeeSex;
	}
	public String getEmployeeSex() {
		return employeeSex;
	}
	 public Employee(){
	 super();	
	 }
 public Employee(int employeeId,String employeeNo,String employeeName,
 		String employeeRole,String employeeSex){
 super();
   this.employeeId=employeeId;
   this.employeeNo=employeeNo;
   this.employeeName=employeeName;
   this.employeeRole=employeeRole;
   this.employeeSex=employeeSex;
 }
}