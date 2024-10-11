package com.choongang.frombirth.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "weekly_report")
public class WeeklyReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Integer reportId;

    @Column(name = "child_id")
    private Integer childId;

    @Column(name = "risk_level")
    private Integer riskLevel;

    @Column(name = "feedback")
    private String feedback;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

}

