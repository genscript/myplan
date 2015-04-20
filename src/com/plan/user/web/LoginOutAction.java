package com.plan.user.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.plan.common.constant.StrutsActionContant;

@Results({ @Result(location = "login/login.jsp"), })
public class LoginOutAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8745834056861158776L;

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Map<String, Object> session = ctx.getSession();
		session.remove(StrutsActionContant.USER_ID);
		session.remove(StrutsActionContant.USER_NAME);
		session.clear();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		request.getSession().invalidate();
		return SUCCESS;
	}

}
