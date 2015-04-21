package com.plan.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.plan.common.entity.BaseEntity;

@Entity
@Table(name = "users", catalog = "customer")
public class User extends BaseEntity {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1346867279863192524L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 邮箱
     */
    private String busEmail;

    /**
     * 手机号
     */
    private String busPhone;

    /**
     * 登录密码
     */
    private String password;

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

}
