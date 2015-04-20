package com.plan.myplan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.plan.common.entity.BaseEntity;

@Entity
@Table(name = "plan_type", catalog = "customer")
public class PlanType extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2695748285915679875L;
	/**
	 * 类型Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer typeId;
	/**
	 * 类型名称
	 */
	private String name;
	/**
	 * 类型描述
	 */
	private String description;
	/**
	 * 是否为自定义创建
	 */
	private String newPlanFlag;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNewPlanFlag() {
		return newPlanFlag;
	}

	public void setNewPlanFlag(String newPlanFlag) {
		this.newPlanFlag = newPlanFlag;
	}

}
