package com.plan.myplan.dto;

import java.util.Date;

import com.plan.myplan.entity.PlanType;

public class PlanDto {
	/**
	 * plan Id
	 */
	private Integer planId;
	/**
	 * 用户 Id
	 */
	private Integer userId;
	/**
	 * 计划开始日期
	 */
	private Date dateFrom;
	/**
	 * 计划结束日期
	 */
	private Date dateTo;
	/**
	 * 学习内容
	 */
	private String content;
	/**
	 * 打卡开始
	 */
	private String punchIn;
	/**
	 * 打卡结束
	 */
	private String punchOut;
	/**
	 * 计划类型
	 */
	private Integer planType;
	/**
	 * 计划状态
	 */
	private Integer status;

	private PlanType planTypeEntity;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPunchIn() {
		return punchIn;
	}

	public void setPunchIn(String punchIn) {
		this.punchIn = punchIn;
	}

	public String getPunchOut() {
		return punchOut;
	}

	public void setPunchOut(String punchOut) {
		this.punchOut = punchOut;
	}

	public Integer getPlanType() {
		return planType;
	}

	public void setPlanType(Integer planType) {
		this.planType = planType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public PlanType getPlanTypeEntity() {
		return planTypeEntity;
	}

	public void setPlanTypeEntity(PlanType planTypeEntity) {
		this.planTypeEntity = planTypeEntity;
	}

}
