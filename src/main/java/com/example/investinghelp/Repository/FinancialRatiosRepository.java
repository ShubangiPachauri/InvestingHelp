package com.example.investinghelp.Repository;

import com.example.investinghelp.Models.FinancialRatios;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class FinancialRatiosRepository {
    private final JdbcTemplate jdbcTemplate;

    public int save(FinancialRatios ratios) {
        String sql = "INSERT INTO financial_ratios " +
                "(CurrentPrice, EPS, Debt, TotalAsset, CurrentAsset, CurrentLiabilities, " +
                "WorkingCapital, Inventory, Sales, TotalCapitalEmployed, NetProfit, ProfitAfterTax, " +
                "ProfitBeforeTax, OtherIncome, Depriciation, InterestIncome, InterestPaid, " +
                "IndustryPE, EBIT, EnterpriseValue, Leverage, IntrinsicValue, OperatingProfit, " +
                "NetProfitMargin, TradeReceivables, EarningYield, FinancialYear, Quarter, CreatedBy) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                ratios.getCurrentPrice(), ratios.getEps(), ratios.getDebt(), ratios.getTotalAsset(),
                ratios.getCurrentAsset(), ratios.getCurrentLiabilities(), ratios.getWorkingCapital(),
                ratios.getInventory(), ratios.getSales(), ratios.getTotalCapitalEmployed(), ratios.getNetProfit(),
                ratios.getProfitAfterTax(), ratios.getProfitBeforeTax(), ratios.getOtherIncome(),
                ratios.getDepriciation(), ratios.getInterestIncome(), ratios.getInterestPaid(),
                ratios.getIndustryPE(), ratios.getEbit(), ratios.getEnterpriseValue(),
                ratios.getLeverage(), ratios.getIntrinsicValue(), ratios.getOperatingProfit(),
                ratios.getNetProfitMargin(), ratios.getTradeReceivables(), ratios.getEarningYield(),
                ratios.getFinancialYear(), ratios.getQuarter(), ratios.getCreatedBy());
    }

    public List<FinancialRatios> findAll() {
        return jdbcTemplate.query("SELECT * FROM financial_ratios",
                new BeanPropertyRowMapper<>(FinancialRatios.class));
    }
}
