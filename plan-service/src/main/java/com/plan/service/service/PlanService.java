package com.plan.service.service;

import com.plan.service.model.Plan;

import java.util.List;
import java.util.Optional;

public interface PlanService {

    Optional<Plan> getPlan(Integer planId);

    Optional<List<Plan>> getAllPlan();

    Plan create(Plan plan);

    Plan update(Plan plan);
}
