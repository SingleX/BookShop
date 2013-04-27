package com.chinasofti.etc.bookshop.dao.jdbcimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.bookshop.dao.AdminDao;
import com.chinasofti.etc.bookshop.po.Admin;

public class AdminDaoImpl extends BaseDao implements AdminDao {

	public Admin findAdminByAdminName(String adminName) {
		// TODO Auto-generated method stub

		Admin admin = null;
		getConn();
		String sql = "select * from Admins where adminName like ?";
		doQuery(sql, adminName);

		try {
			if (rs.next()) {
				admin = new Admin();
				admin.setAdminId(rs.getInt(1));
				admin.setAdminName(rs.getString(2));
				admin.setAdminPassword(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return admin;
	}

	public List<Admin> findAllAdmins() {
		// TODO Auto-generated method stub
		List<Admin> admins = new ArrayList<Admin>();
		getConn();

		String sql = "select * from Admins";
		doQuery(sql);

		try {
			while (rs.next()) {
				Admin admin = new Admin();
				admin.setAdminId(rs.getInt(1));
				admin.setAdminName(rs.getString(2));
				admin.setAdminPassword(rs.getString(3));

				admins.add(admin);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		closeAll();
		return admins;
	}

	public int addAdmins(Admin admin) {
		// TODO Auto-generated method stub
		getConn();

		String sql = "insert into Admins values(?,?)";
		doOperate(sql, admin.getAdminName(), admin.getAdminPassword());
		System.out.println("--管理员添加成功--");

		closeAll();
		return 0;
	}

	public int modifyAdmins(Admin admin) {
		// TODO Auto-generated method stub
		getConn();
		
		String sql = "update Admins set adminPassword = ? where adminId = ?";
		doOperate(sql, admin.getAdminPassword(), admin.getAdminId());
		
		closeAll();
		return 0;
	}

	public int deleteAdmins(int adminId) {
		// TODO Auto-generated method stub
		
		getConn();
		
		String sql = "delete from Admins where adminId = ?";
		doOperate(sql, adminId);
		
		closeAll();
		return 0;
	}

}
