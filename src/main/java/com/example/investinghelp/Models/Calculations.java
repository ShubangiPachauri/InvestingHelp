package com.example.investinghelp.Models;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Calculations {

    // Primary Key → mandatory in DB
    private Long stockId;  

    // Mandatory field → NOT NULL in DB
    private String tradingSymbol; 

    // Optional fields → nullable in DB
    private Double priceToEarning;
    private Double debtToEquity;
    private Double returnOnEquity;
    private Double workingCapital;
    private Double interestCoverageRatio;
    private Double priceToBookValue;
    private Double returnOnAssets;
    private Double returnOnCapitalEmployed;
    private Double currentRatio;
    private Double quickRatio;
    private Double assetTurnoverRatio;
    private Double financialLeverage;
    private Double salesGrowth;
    private Double profitGrowth;
    private Double equityCapital;
    
 // Mandatory field → NOT NULL in DB
    private String financialYear;
    private String quarter;
    private String createdBy;
    private LocalDateTime createdDate;

}
