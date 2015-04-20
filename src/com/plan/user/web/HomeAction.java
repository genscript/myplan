package com.plan.user.web;

import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.plan.common.util.DateUtil;
import com.plan.common.util.SessionUtil;
import com.plan.myplan.dto.PlanDto;
import com.plan.myplan.entity.PlanType;
import com.plan.myplan.service.PlanService;

@Results({ @Result(name = "top", location = "home/top.jsp"),
		@Result(name = "left_menu", location = "home/left_menu.jsp"),
		@Result(name = "main_right", location = "home/main_right.jsp"),
		@Result(name = "main_top", location = "home/main_top.jsp"),
		@Result(name = "main", location = "home/main.jsp") })
public class HomeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String dateStr;
	private int week;
	@Autowired
	private PlanService planService;
	private List<PlanDto> planList ;
	private List<PlanType> planTypeList;

	/**
	 * 框架上部
	 * 
	 * @return
	 */
	public String top() {
		userName = SessionUtil.getUserName();
		return "top";
	}

	/**
	 * 框架左菜单
	 * 
	 * @return
	 */
	public String leftMenu() {
		return "left_menu";
	}

	/**
	 * 框架主界面
	 * 
	 * @return
	 */
	public String main() {
		// 根据user id 得到所有的用户没有完成任务
		Integer userId = SessionUtil.getUserId();
		planList = planService.getPlanByUserId(userId);	
		planTypeList = planService.getPlanType("Y");
		return "main";
	}

	/**
	 * 主框架右侧
	 * 
	 * @return
	 */
	public String mainRight() {
		return "main_right";
	}

	/**
	 * 主框架顶部
	 * 
	 * @return
	 * @throws Exception
	 */
	public String mainTop() throws Exception {
		dateStr = DateUtil.formatDate2Str(new Date(),
				DateUtil.C_DATE_PATTON_DEFAULT);
		week = DateUtil.dayForWeek(new Date());
		return "main_top";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public List<PlanDto> getPlanList() {
		return planList;
	}

	public void setPlanList(List<PlanDto> planList) {
		this.planList = planList;
	}

	public List<PlanType> getPlanTypeList() {
		return planTypeList;
	}

	public void setPlanTypeList(List<PlanType> planTypeList) {
		this.planTypeList = planTypeList;
	}
    
}
