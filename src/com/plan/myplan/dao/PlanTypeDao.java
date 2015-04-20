package com.plan.myplan.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plan.common.dao.BaseDao;
import com.plan.myplan.entity.PlanType;
@Repository
public class PlanTypeDao extends BaseDao<PlanType,Integer> {
  public List<PlanType> getPlanType(String defaultPlan){
	  String hql =" FROM PlanType WHERE newPlanFlag = 'N'";
	  return this.getListByHQL(hql);
	 
  }
}
