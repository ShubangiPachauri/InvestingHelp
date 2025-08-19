package com.example.investinghelp.Service;

import com.example.investinghelp.Models.OwnershipHoldings;
import com.example.investinghelp.Repository.OwnershipHoldingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnershipHoldingsService {

    private final OwnershipHoldingsRepository ownershipHoldingsRepository;

    public OwnershipHoldings save(OwnershipHoldings holdings) {
        return ownershipHoldingsRepository.save(holdings);
    }

    public List<OwnershipHoldings> findAll() {
        return ownershipHoldingsRepository.findAll();
    }
}
