package com.chinasofti.etc.bookshop.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.bookshop.dao.AdminDao;
import com.chinasofti.etc.bookshop.po.Admin;
import com.chinasofti.etc.bookshop.service.AdminService;

public class AdminServiceImpl implements AdminService {

	File file = new File("F:\\myeclipse\\Config.properties");
	Properties properties = new Properties();

	public Admin findAdminByAdminName(String adminName) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String adminDaoString = properties.getProperty("adminDaoString");
			AdminDao adminDao = (AdminDao) Class.forName(adminDaoString).newInstance();
			return adminDao.findAdminByAdminName(adminName);

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

	public boolean isValidateAdmin(String adminName, String adminPassword) {
		// TODO Auto-generated method stub
		boolean result = false;

		try {
			properties.load(new FileInputStream(file));
			String adminDaoString = properties.getProperty("adminDaoString");
			AdminDao adminDao = (AdminDao) Class.forName(adminDaoString).newInstance();

			Admin admin = adminDao.findAdminByAdminName(adminName);
			if (admin != null && admin.getAdminPassword().equals(adminPassword)) {
				result = true;
			}

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
		return result;
	}

	public List<Admin> findAllAdmins() {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String adminDaoString = properties.getProperty("adminDaoString");
			AdminDao adminDao = (AdminDao) Class.forName(adminDaoString).newInstance();

			return adminDao.findAllAdmins();

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

	public int addAdmins(Admin admin) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String adminDaoString = properties.getProperty("adminDaoString");
			AdminDao adminDao = (AdminDao) Class.forName(adminDaoString).newInstance();

			return adminDao.addAdmins(admin);

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

	public int modifyAdmins(Admin admin) {
		// TODO Auto-generated method stub
		
		try {
			properties.load(new FileInputStream(file));
			String adminDaoString = properties.getProperty("adminDaoString");
			AdminDao adminDao = (AdminDao) Class.forName(adminDaoString).newInstance();

			return adminDao.modifyAdmins(admin);

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

	public int deleteAdmins(int adminId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String adminDaoString = properties.getProperty("adminDaoString");
			AdminDao adminDao = (AdminDao) Class.forName(adminDaoString).newInstance();

			return adminDao.deleteAdmins(adminId);

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

}
