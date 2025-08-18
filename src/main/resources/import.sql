
-- ================================
-- 1. Calculations Table
-- ================================
CREATE TABLE calculations (
    stock_id BIGINT AUTO_INCREMENT PRIMARY KEY,

    trading_symbol VARCHAR(50) NOT NULL UNIQUE,

    price_to_earning DOUBLE NULL,
    debt_to_equity DOUBLE NULL,
    return_on_equity DOUBLE NULL,
    working_capital DOUBLE NULL,
    interest_coverage_ratio DOUBLE NULL,
    price_to_book_value DOUBLE NULL,
    return_on_assets DOUBLE NULL,
    return_on_capital_employed DOUBLE NULL,
    current_ratio DOUBLE NULL,
    quick_ratio DOUBLE NULL,
    asset_turnover_ratio DOUBLE NULL,
    financial_leverage DOUBLE NULL,
    sales_growth DOUBLE NULL,
    profit_growth DOUBLE NULL,
    equity_capital DOUBLE NULL,

    financial_year VARCHAR(10) NOT NULL,
    quarter VARCHAR(5) NOT NULL,

    created_by VARCHAR(50) NOT NULL,
    created_date TIMESTAMP NOT NULL
);

INSERT INTO calculations (
    trading_symbol, price_to_earning, debt_to_equity, return_on_equity,
    working_capital, interest_coverage_ratio, price_to_book_value,
    return_on_assets, return_on_capital_employed, current_ratio, quick_ratio,
    asset_turnover_ratio, financial_leverage, sales_growth, profit_growth,
    equity_capital, financial_year, quarter, created_by, created_date
) VALUES (
    'TCS', 28.5, 0.6, 15.2, 1200000.0, 8.4, 6.2, 12.3, 18.5,
    2.1, 1.5, 1.8, 1.2, 10.5, 8.3, 5000.0,
    '2024-25', 'Q1', 'admin', NOW()
);

-- ================================
-- 2. Financial Ratios Table
-- ================================
CREATE TABLE financial_ratios (
    stock_id BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- Optional (NULL allowed)
    current_price DOUBLE NULL,
    eps DOUBLE NULL,
    debt DOUBLE NULL,
    total_asset DOUBLE NULL,
    current_asset DOUBLE NULL,
    current_liabilities DOUBLE NULL,
    working_capital DOUBLE NULL,
    inventory DOUBLE NULL,
    sales DOUBLE NULL,
    total_capital_employed DOUBLE NULL,
    net_profit DOUBLE NULL,
    profit_after_tax DOUBLE NULL,
    profit_before_tax DOUBLE NULL,
    other_income DOUBLE NULL,
    depriciation DOUBLE NULL,
    interest_income DOUBLE NULL,
    interest_paid DOUBLE NULL,
    industry_pe DOUBLE NULL,
    ebit DOUBLE NULL,
    enterprise_value DOUBLE NULL,
    leverage DOUBLE NULL,
    intrinsic_value DOUBLE NULL,
    operating_profit DOUBLE NULL,
    net_profit_margin DOUBLE NULL,
    trade_receivables DOUBLE NULL,
    earning_yield DOUBLE NULL,

    -- Mandatory (NOT NULL)
    financial_year VARCHAR(10) NOT NULL,
    quarter VARCHAR(5) NOT NULL,
    created_by VARCHAR(50) NOT NULL,
    created_date TIMESTAMP NOT NULL
);

INSERT INTO financial_ratios (
    current_price, eps, debt, total_asset, current_asset, current_liabilities,
    working_capital, inventory, sales, total_capital_employed, net_profit,
    profit_after_tax, profit_before_tax, other_income, depriciation,
    interest_income, interest_paid, industry_pe, ebit, enterprise_value,
    leverage, intrinsic_value, operating_profit, net_profit_margin,
    trade_receivables, earning_yield,
    financial_year, quarter, created_by, created_date
) VALUES (
    3500.75, 50.2, 1400.0, 500000.0, 150000.0, 80000.0,
    70000.0, 25000.0, 120000.0, 300000.0, 28000.0,
    25000.0, 30000.0, 5000.0, 2000.0,
    1000.0, 800.0, 25.5, 40000.0, 700000.0,
    1.5, 2800.0, 35000.0, 12.3,
    45000.0, 5.8,
    '2024-25', 'Q3', 'system', NOW()
);


-- ================================
-- 3. Ownership Holdings Table
-- ================================
CREATE TABLE ownership_holdings (
    stock_id BIGINT AUTO_INCREMENT PRIMARY KEY,       

    trading_symbol VARCHAR(50) NOT NULL,            

    market_cap DOUBLE NULL,                          
    public_holding DOUBLE NULL,                      
    promoter_holding DOUBLE NULL,                    
    dii_holding DOUBLE NULL,                         
    fii_holding DOUBLE NULL,                        
    number_of_equity_shares BIGINT NULL,            
    other_holding DOUBLE NULL,                      
    pledged_percentage DOUBLE NULL,                 
    unpledged_promoter_holding DOUBLE NULL,         
    no_of_shareholders BIGINT NULL,                 

    financial_year VARCHAR(10) NOT NULL,            
    quarter VARCHAR(5) NOT NULL,                    
    created_by VARCHAR(50) NOT NULL,                
    created_date TIMESTAMP NOT NULL                 
);


INSERT INTO ownership_holdings (
    trading_symbol, market_cap, public_holding, promoter_holding, dii_holding,
    fii_holding, number_of_equity_shares, other_holding, pledged_percentage,
    unpledged_promoter_holding, no_of_shareholders, financial_year, quarter,
    created_by, created_date
) VALUES (
    'RELIANCE', 1500000.0, 25.0, 60.0, 5.0,
    10.0, 200000000, 2.0, 3.0,
    57.0, 5000, '2024-25', 'Q2',
    'system', NOW()
);
