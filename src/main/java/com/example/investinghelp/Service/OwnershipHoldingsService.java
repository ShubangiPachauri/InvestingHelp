package com.example.investinghelp.Service;

import com.example.investinghelp.Models.OwnershipHoldings;
import com.example.investinghelp.Repository.OwnershipHoldingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnershipHoldingsService {
    private final OwnershipHoldingsRepository repository;

    public void add(OwnershipHoldings holdings) {
        repository.save(holdings);
    }

    public List<OwnershipHoldings> getAll() {
        return repository.findAll();
    }
}
