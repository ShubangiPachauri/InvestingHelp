package com.example.investinghelp.Repository;

import com.example.investinghelp.Models.OwnershipHoldings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnershipHoldingsRepository extends JpaRepository<OwnershipHoldings, Long> {
	
}
