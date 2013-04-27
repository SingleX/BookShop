package com.chinasofti.etc.bookshop.service;

import java.util.List;

import com.chinasofti.etc.bookshop.po.Admin;

public interface AdminService {
	
	List<Admin> findAllAdmins();
	Admin findAdminByAdminName(String adminName);
	boolean isValidateAdmin(String adminName, String adminPassword);
	int addAdmins(Admin admin);
	int modifyAdmins(Admin admin);
	int deleteAdmins(int adminId);
}
