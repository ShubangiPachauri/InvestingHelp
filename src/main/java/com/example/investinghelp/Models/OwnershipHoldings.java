package com.example.investinghelp.Models;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class OwnershipHoldings {

    // Primary Key → mandatory in DB
    private Long stockId;

    // Mandatory field → NOT NULL in DB
    private String tradingSymbol;
    
    // Optional fields → nullable in DB
    private Double marketCap;
    private Double publicHolding;
    private Double promoterHolding;
    private Double diiHolding;
    private Double fiiHolding;
    private Long numberOfEquityShares;
    private Double otherHolding;
    private Double pledgedPercentage;
    private Double unpledgedPromoterHolding;
    private Long noOfShareholders;
    
 // Mandatory field → NOT NULL in DB
    private String financialYear;
    private String quarter;
    private String createdBy;
    private LocalDateTime createdDate;

}
