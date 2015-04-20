package com.plan.myplan.web;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.plan.myplan.dto.PlanDto;
import com.plan.myplan.service.PlanService;

public class PlanAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3959846878005450363L;
	private PlanDto planDto;
	@Autowired(required = false)
	private DozerBeanMapper dozer;
	@Autowired
	private PlanService planService;
	
	
	/**
	 * 
	 * @return
	 */
	public String saveNewPlan() {
		
        planService.saveNewPlan(planDto);
		return null;
	}

	public PlanDto getPlanDto() {
		return planDto;
	}

	public void setPlanDto(PlanDto planDto) {
		this.planDto = planDto;
	}

}
