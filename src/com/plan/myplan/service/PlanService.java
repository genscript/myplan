package com.plan.myplan.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plan.common.util.SessionUtil;
import com.plan.myplan.dao.PlanDao;
import com.plan.myplan.dao.PlanTypeDao;
import com.plan.myplan.dto.PlanDto;
import com.plan.myplan.entity.Plan;
import com.plan.myplan.entity.PlanType;

@Service
@Transactional
public class PlanService {
	@Autowired
	private PlanDao planDao;
	@Autowired
	private PlanTypeDao planTypeDao;
	@Autowired(required = false)
	private DozerBeanMapper dozer;

	public List<PlanDto> getPlanByUserId(Integer userId) {
		List<PlanDto> planDtoList = null;
		List<Plan> planList = planDao.getPlanByUserId(userId);
		if (planList != null && !planList.isEmpty()) {
			for (Plan plan : planList) {
				planDtoList = new ArrayList<PlanDto>();
				PlanDto planDto = dozer.map(plan, PlanDto.class);
				if (planDto.getPlanType() != null) {
					PlanType planType = planTypeDao.get(planDto.getPlanType());
					planDto.setPlanTypeEntity(planType);
				}
				planDtoList.add(planDto);

			}
			return planDtoList;
		}
		return null;
	}

	public void savePlan(Plan plan) {
		planDao.save(plan);
	}

	public void saveNewPlan(PlanDto planDto) {
		Plan plan = new Plan();
		try {
			plan = dozer.map(planDto, Plan.class);
		} catch (Exception e) {
			e.printStackTrace();

		}
		plan.setCreatedBy(SessionUtil.getUserId());
		plan.setCreationDate(new Date());
		plan.setModifiedBy(SessionUtil.getUserId());
		plan.setModifyDate(new Date());
	}

	public List<PlanType> getPlanType(String defaultPlan) {
		return planTypeDao.getPlanType(defaultPlan);
	}
}
