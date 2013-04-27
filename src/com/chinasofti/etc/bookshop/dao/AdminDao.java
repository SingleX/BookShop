package com.chinasofti.etc.bookshop.dao;

import java.util.List;

import com.chinasofti.etc.bookshop.po.Admin;

public interface AdminDao {
	List<Admin> findAllAdmins();
	Admin findAdminByAdminName(String adminName);
	int addAdmins(Admin admin);
	int modifyAdmins(Admin admin);
	int deleteAdmins(int adminId);
}
