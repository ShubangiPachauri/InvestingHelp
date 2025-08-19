package com.example.investinghelp.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "calculations")
public class Calculations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long stockId;

    // Mandatory field → NOT NULL
    @Column(nullable = false)
    private String tradingSymbol;

    // Optional fields → nullable
    @Column(nullable = true)
    private Double priceToEarning;

    @Column(nullable = true)
    private Double debtToEquity;

    @Column(nullable = true)
    private Double returnOnEquity;

    @Column(nullable = true)
    private Double workingCapital;

    @Column(nullable = true)
    private Double interestCoverageRatio;

    @Column(nullable = true)
    private Double priceToBookValue;

    @Column(nullable = true)
    private Double returnOnAssets;

    @Column(nullable = true)
    private Double returnOnCapitalEmployed;

    @Column(nullable = true)
    private Double currentRatio;

    @Column(nullable = true)
    private Double quickRatio;

    @Column(nullable = true)
    private Double assetTurnoverRatio;

    @Column(nullable = true)
    private Double financialLeverage;

    @Column(nullable = true)
    private Double salesGrowth;

    @Column(nullable = true)
    private Double profitGrowth;

    @Column(nullable = true)
    private Double equityCapital;

    // Mandatory fields (business-related metadata)
    @Column(nullable = false)
    private String financialYear;

    @Column(nullable = false)
    private String quarter;

    @Column(nullable = false)
    private String createdBy;
}
