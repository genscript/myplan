package com.plan.myplan.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plan.common.dao.BaseDao;
import com.plan.myplan.entity.Plan;

@Repository
public class PlanDao extends BaseDao<Plan, Integer> {
	public List<Plan> getPlanByUserId(Integer userId) {
		String hql = "FROM Plan WHERE status = 'ACTIVE' AND userId = " + userId;
		return this.getListByHQL(hql);
	}
}
