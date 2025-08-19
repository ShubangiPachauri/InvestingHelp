package com.example.investinghelp.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "financial_ratios")
public class FinancialRatios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Primary Key, auto-increment
    private Long stockId;

    @Column(nullable = true)
    private Double currentPrice;

    @Column(nullable = true)
    private Double eps;

    @Column(nullable = true)
    private Double debt;

    @Column(nullable = true)
    private Double totalAsset;

    @Column(nullable = true)
    private Double currentAsset;

    @Column(nullable = true)
    private Double currentLiabilities;

    @Column(nullable = true)
    private Double workingCapital;

    @Column(nullable = true)
    private Double inventory;

    @Column(nullable = true)
    private Double sales;

    @Column(nullable = true)
    private Double totalCapitalEmployed;

    @Column(nullable = true)
    private Double netProfit;

    @Column(nullable = true)
    private Double profitAfterTax;

    @Column(nullable = true)
    private Double profitBeforeTax;

    @Column(nullable = true)
    private Double otherIncome;

    @Column(nullable = true)
    private Double depriciation;

    @Column(nullable = true)
    private Double interestIncome;

    @Column(nullable = true)
    private Double interestPaid;

    @Column(nullable = true)
    private Double industryPE;

    @Column(nullable = true)
    private Double ebit;

    @Column(nullable = true)
    private Double enterpriseValue;

    @Column(nullable = true)
    private Double leverage;

    @Column(nullable = true)
    private Double intrinsicValue;

    @Column(nullable = true)
    private Double operatingProfit;

    @Column(nullable = true)
    private Double netProfitMargin;

    @Column(nullable = true)
    private Double tradeReceivables;

    @Column(nullable = true)
    private Double earningYield;

    @Column(nullable = false)
    private String financialYear;

    @Column(nullable = false)
    private String quarter;

    @Column(nullable = false)
    private String createdBy;

    @Column(nullable = false)
    private LocalDateTime createdDate;
}
