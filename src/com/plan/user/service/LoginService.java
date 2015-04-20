package com.plan.user.service;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plan.common.util.EncrypeUtil;
import com.plan.user.dao.UserDao;
import com.plan.user.dto.UserDto;
import com.plan.user.entity.User;

@Service
@Transactional
public class LoginService {
	@Autowired
	private UserDao userDao;

	/**
	 * 验证用户合法性
	 * 
	 * @param userName
	 * @param passWord
	 * @return
	 * @throws Exception
	 */
	public User validUser(String userName, String password) throws Exception {
		User user = null;
		if (!StringUtils.isBlank(userName) && !StringUtils.isBlank(password)) {
			password = EncrypeUtil.encrypeString(password);
			user = userDao.getUserByLoginInfo(userName, password);
		}
		return user;
	}

	/**
	 * 保存新增用户
	 * 
	 * @param userDto
	 * @return
	 * @throws Exception
	 */
	public User saveUser(UserDto userDto) throws Exception {
		User user = new User();
		user.setBusEmail(userDto.getBusEmail());
		user.setPassword(EncrypeUtil.encrypeString(userDto.getPassword()));
		user.setUserName(userDto.getUserName());
		user.setCreatedBy(-1);
		user.setCreationDate(new Date());
		user.setModifiedBy(-1);
		user.setModifyDate(new Date());
		userDao.save(user);
		return user;

	}

	/**
	 * 向注册的客户发送注册邮件
	 * 
	 * @param busEmail
	 */
	public void sendRegisterEmail(String busEmail) {
		if (!StringUtils.isBlank(busEmail)) {

		}
	}
}
