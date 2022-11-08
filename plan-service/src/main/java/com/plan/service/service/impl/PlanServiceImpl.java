package com.plan.service.service.impl;

import com.plan.service.model.Plan;
import com.plan.service.repository.PlanRepository;
import com.plan.service.service.PlanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlanServiceImpl implements PlanService {

    private final PlanRepository planRepository;

    @Override
    public Optional<Plan> getPlan(Integer planId) {
        return Optional.ofNullable(planRepository.getReferenceById(planId));
    }

    @Override
    public Optional<List<Plan>> getAllPlan() {
        return Optional.ofNullable(planRepository.findAll());
    }

    @Override
    public Plan create(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public Plan update(Plan plan) {
        return planRepository.save(plan);
    }
}
