package com.plan.common.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.plan.common.constant.StrutsActionContant;

public class AuthenticationInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -974346620154644331L;

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		String name = actionInvocation.getInvocationContext().getName();
		ActionContext ctx = actionInvocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) ctx
				.get(ServletActionContext.HTTP_REQUEST);
		String paramters = request.getQueryString();
		Map<String, Object> session = actionInvocation.getInvocationContext()
				.getSession();
		String userId = String
				.valueOf(session.get(StrutsActionContant.USER_ID));

		if (paramters == null) {
			paramters = "";
		} else {
			paramters = "?" + paramters;
		}
		if (("login").equalsIgnoreCase(name)) {
			if (!("null").equals(userId)) {
				return "home";
			}
			return actionInvocation.invoke();
		}
		if (StringUtils.isBlank(userId) || ("null").equals(userId)) {
			return Action.LOGIN;
		}
		return actionInvocation.invoke();
	}

}
