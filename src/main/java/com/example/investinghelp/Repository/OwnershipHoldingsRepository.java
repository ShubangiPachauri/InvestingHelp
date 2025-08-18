package com.example.investinghelp.Repository;

import com.example.investinghelp.Models.OwnershipHoldings;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OwnershipHoldingsRepository {
    private final JdbcTemplate jdbcTemplate;

    public int save(OwnershipHoldings holdings) {
        String sql = "INSERT INTO ownership_holdings " +
                "(StockId, TradingSymbol, MarketCap, PublicHolding, PromoterHolding, DIIHolding, FIIHolding, " +
                "NumberOfEquityShares, OtherHolding, PledgedPercentage, UnpledgedPromoterHolding, NoOfShareholders, " +
                "FinancialYear, Quarter, CreatedBy) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                holdings.getStockId(), holdings.getTradingSymbol(), holdings.getMarketCap(),
                holdings.getPublicHolding(), holdings.getPromoterHolding(), holdings.getDiiHolding(),
                holdings.getFiiHolding(), holdings.getNumberOfEquityShares(), holdings.getOtherHolding(),
                holdings.getPledgedPercentage(), holdings.getUnpledgedPromoterHolding(),
                holdings.getNoOfShareholders(), holdings.getFinancialYear(),
                holdings.getQuarter(), holdings.getCreatedBy());
    }

    public List<OwnershipHoldings> findAll() {
        return jdbcTemplate.query("SELECT * FROM ownership_holdings",
                new BeanPropertyRowMapper<>(OwnershipHoldings.class));
    }
}
