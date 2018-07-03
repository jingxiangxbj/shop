package com.shop.server;

import org.springframework.transaction.annotation.Transactional;

import com.shop.dao.AdminUserDao;
import com.shop.model.AdminUser;

@Transactional
public class AdminUserService {
	// 注入Dao
	private AdminUserDao adminUserDao;

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	public AdminUser login(AdminUser adminUser) {
		return adminUserDao.login(adminUser);
	}

}
