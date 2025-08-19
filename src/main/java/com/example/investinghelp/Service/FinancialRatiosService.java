package com.example.investinghelp.Service;

import com.example.investinghelp.Models.FinancialRatios;
import com.example.investinghelp.Repository.FinancialRatiosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FinancialRatiosService {

    private final FinancialRatiosRepository financialRatiosRepository;

    public FinancialRatios save(FinancialRatios ratios) {
        return financialRatiosRepository.save(ratios);
    }

    public List<FinancialRatios> findAll() {
        return financialRatiosRepository.findAll();
    }
}
