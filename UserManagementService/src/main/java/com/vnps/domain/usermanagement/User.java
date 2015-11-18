package com.vnps.domain.usermanagement;

import java.util.Date;

import com.vnps.domain.Person;

public class User extends Person {

	private String userId;
	
	private Date creationDate;
	
	private Date confirmationDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getConfirmationDate() {
		return confirmationDate;
	}

	public void setConfirmationDate(Date confirmationDate) {
		this.confirmationDate = confirmationDate;
	}
}
