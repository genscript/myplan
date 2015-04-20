package com.plan.user.web;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.plan.common.constant.StrutsActionContant;
import com.plan.common.web.BaseAction;
import com.plan.user.dto.UserDto;
import com.plan.user.entity.User;
import com.plan.user.service.LoginService;

@Results({ @Result(name = "home", location = "home/home.jsp"),
		@Result(name = "register", location = "login/register.jsp"),
		@Result(name = "login", location = "login/login.jsp") })
public class LoginAction extends BaseAction<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private LoginService loginService;
	/**
	 * 用户名保存到cookie
	 */
	private String cookieUserId;
	/**
	 * 用户信息数据传输对象封装
	 */
	private UserDto userDto;

	public User getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 用户登录
	 */
	@Override
	public String list() throws Exception {
		// TODO Auto-generated method stub
		if (userDto != null) {
			this.setUserCookie();
			String userName = userDto.getUserName();
			String password = userDto.getPassword();
			User user = loginService.validUser(userName, password);
			if (user != null) {
				setHttpSessionUserValue(user);
				return "home";
			}
		}
		return "login";
	}

	/**
	 * 向session容器中添加user name ,user ID作为key
	 * 
	 * @param user
	 */
	public void setHttpSessionUserValue(User user) {
		ActionContext.getContext().getSession()
				.put(StrutsActionContant.USER_ID, user.getId());
		ActionContext.getContext().getSession()
				.put(StrutsActionContant.USER_NAME, user.getUserName());
	}

	/**
	 * 用户注册
	 * 
	 * @return
	 * @throws Exception
	 */
	public String register() throws Exception {

		if (userDto != null) {
			User user = loginService.saveUser(userDto);
			this.setHttpSessionUserValue(user);
			try {
				loginService.sendRegisterEmail(userDto.getBusEmail());
			} catch (Exception e) {
				e.printStackTrace();
			}

			return "home";
		}
		return "register";
	}

	/**
	 * 设置用户的cookie
	 */
	public void setUserCookie() {
		Cookie cookieId = new Cookie("userName", userDto.getUserName());
		cookieId.setMaxAge(30 * 60 * 60 * 24);
		ServletActionContext.getResponse().addCookie(cookieId);
		this.setCookieUserId(userDto.getUserName());
	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void prepareModel() throws Exception {
		// TODO Auto-generated method stub

	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public String getCookieUserId() {
		return cookieUserId;
	}

	public void setCookieUserId(String cookieUserId) {
		this.cookieUserId = cookieUserId;
	}

}
