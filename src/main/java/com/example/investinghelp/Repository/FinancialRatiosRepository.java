package com.example.investinghelp.Repository;

import com.example.investinghelp.Models.FinancialRatios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialRatiosRepository extends JpaRepository<FinancialRatios, Long> {

}
