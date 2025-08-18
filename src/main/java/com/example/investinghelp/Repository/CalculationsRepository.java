package com.example.investinghelp.Repository;

import com.example.investinghelp.Models.Calculations;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CalculationsRepository {
    private final JdbcTemplate jdbcTemplate;

    public int save(Calculations calc) {
        String sql = "INSERT INTO calculations " +
                "(StockId, TradingSymbol, PriceToEarning, DebtToEquity, ReturnOnEquity, WorkingCapital, " +
                "InterestCoverageRatio, PriceToBookValue, ReturnOnAssets, ReturnOnCapitalEmployed, " +
                "CurrentRatio, QuickRatio, AssetTurnoverRatio, FinancialLeverage, SalesGrowth, ProfitGrowth, " +
                "EquityCapital, FinancialYear, Quarter, CreatedBy) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                calc.getStockId(), calc.getTradingSymbol(), calc.getPriceToEarning(),
                calc.getDebtToEquity(), calc.getReturnOnEquity(), calc.getWorkingCapital(),
                calc.getInterestCoverageRatio(), calc.getPriceToBookValue(), calc.getReturnOnAssets(),
                calc.getReturnOnCapitalEmployed(), calc.getCurrentRatio(), calc.getQuickRatio(),
                calc.getAssetTurnoverRatio(), calc.getFinancialLeverage(), calc.getSalesGrowth(),
                calc.getProfitGrowth(), calc.getEquityCapital(), calc.getFinancialYear(),
                calc.getQuarter(), calc.getCreatedBy());
    }

    public List<Calculations> findAll() {
        return jdbcTemplate.query("SELECT * FROM calculations",
                new BeanPropertyRowMapper<>(Calculations.class));
    }
}
