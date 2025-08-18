package com.example.investinghelp.Service;

import com.example.investinghelp.Models.FinancialRatios;
import com.example.investinghelp.Repository.FinancialRatiosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FinancialRatiosService {
    private final FinancialRatiosRepository repository;

    public void add(FinancialRatios ratios) {
        repository.save(ratios);
    }

    public List<FinancialRatios> getAll() {
        return repository.findAll();
    }
}
