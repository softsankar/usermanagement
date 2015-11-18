package com.vnps.dao.usermanagement;

import com.vnps.domain.usermanagement.User;

public interface UserManagementDao {

	public User getUserDetail(String userId) throws UserManagementDaoException;
	
	public void addUser(User user) throws UserManagementDaoException;
	
	public void updateUser(User user) throws UserManagementDaoException;
}
