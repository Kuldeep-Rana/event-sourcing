package com.plan.service.model;

import com.plan.service.constant.PlanType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.tuple.GeneratedValueGeneration;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "plan")
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planId;

    private String planName;

    private String planDesc;

    private Instant launchDate;

    private BigDecimal minimumPrice;

    private BigDecimal maximumPrice;

    private Boolean isActive;

    @Enumerated
    private PlanType planType;

}
