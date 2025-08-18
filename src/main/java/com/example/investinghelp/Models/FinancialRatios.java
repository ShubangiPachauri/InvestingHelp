package com.example.investinghelp.Models;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class FinancialRatios {
    private Long stockId;

    // Optional financial fields (nullable = true)
    private Double currentPrice;
    private Double eps;
    private Double debt;
    private Double totalAsset;
    private Double currentAsset;
    private Double currentLiabilities;
    private Double workingCapital;
    private Double inventory;
    private Double sales;
    private Double totalCapitalEmployed;
    private Double netProfit;
    private Double profitAfterTax;
    private Double profitBeforeTax;
    private Double otherIncome;
    private Double depriciation;
    private Double interestIncome;
    private Double interestPaid;
    private Double industryPE;
    private Double ebit;
    private Double enterpriseValue;
    private Double leverage;
    private Double intrinsicValue;
    private Double operatingProfit;
    private Double netProfitMargin;
    private Double tradeReceivables;
    private Double earningYield;

    // Mandatory fields (nullable = false)
    private String financialYear;
    private String quarter;
    private String createdBy;
    private LocalDateTime createdDate;
}
