package com.plan.user.dao;

import org.springframework.stereotype.Repository;

import com.plan.common.dao.BaseDao;
import com.plan.user.entity.User;

@Repository
public class UserDao extends BaseDao<User,Integer> {
     /**
      * 根据用户名和密码查询客户
      * @param userName
      * @param passWord
      * @return
      */
	 public User getUserByLoginInfo(String userName ,String passWord){
		 String hql ="FROM User WHERE userName= '" + userName + "' AND passWord = '"+ passWord+"'" ;
		 return  this.getByHQL(hql);
	 }
}
