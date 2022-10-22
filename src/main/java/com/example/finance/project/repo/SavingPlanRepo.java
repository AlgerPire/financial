package com.example.finance.project.repo;

import com.example.finance.project.model.SavingPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingPlanRepo extends JpaRepository<SavingPlan, Long> {
}
