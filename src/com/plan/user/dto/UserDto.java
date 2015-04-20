package com.plan.user.dto;

public class UserDto {
	private Integer id;
	private String userName;
	private String busEmail;
	private String busPhone;
	private String password;
	private String reConfrimPassword;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBusEmail() {
		return busEmail;
	}

	public void setBusEmail(String busEmail) {
		this.busEmail = busEmail;
	}

	public String getBusPhone() {
		return busPhone;
	}

	public void setBusPhone(String busPhone) {
		this.busPhone = busPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReConfrimPassword() {
		return reConfrimPassword;
	}

	public void setReConfrimPassword(String reConfrimPassword) {
		this.reConfrimPassword = reConfrimPassword;
	}

}
