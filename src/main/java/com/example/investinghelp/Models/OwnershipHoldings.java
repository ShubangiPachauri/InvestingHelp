package com.example.investinghelp.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ownership_holdings")
public class OwnershipHoldings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;   

    @Column(nullable = false)
    private String tradingSymbol;  

    @Column(nullable = true)
    private Double marketCap;   

    @Column(nullable = true)
    private Double publicHolding; 

    @Column(nullable = true)
    private Double promoterHolding;   

    @Column(nullable = true)
    private Double diiHolding;   

    @Column(nullable = true)
    private Double fiiHolding;  

    @Column(nullable = true)
    private Long numberOfEquityShares;   

    @Column(nullable = true)
    private Double otherHolding;   

    @Column(nullable = true)
    private Double pledgedPercentage;   

    @Column(nullable = true)
    private Double unpledgedPromoterHolding;   

    @Column(nullable = true)
    private Long noOfShareholders;   

    @Column(nullable = false)
    private String financialYear;   

    @Column(nullable = false)
    private String quarter;   

    @Column(nullable = false)
    private String createdBy;   

    @Column(nullable = true)
    private LocalDateTime createdDate;   
}
