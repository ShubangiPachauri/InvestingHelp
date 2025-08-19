package com.example.investinghelp.Service;

import com.example.investinghelp.Models.Calculations;
import com.example.investinghelp.Repository.CalculationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CalculationsService {

    private final CalculationsRepository calculationsRepository;

    public Calculations save(Calculations calc) {
        return calculationsRepository.save(calc);
    }

    public List<Calculations> findAll() {
        return calculationsRepository.findAll();
    }

    public Optional<Calculations> findById(Long id) {
        return calculationsRepository.findById(id);
    }

    public Optional<Calculations> update(Long id, Calculations updatedCalc) {
        return calculationsRepository.findById(id).map(existing -> {
            updatedCalc.setStockId(existing.getStockId()); // keep same ID
            return calculationsRepository.save(updatedCalc);
        });
    }

    public boolean delete(Long id) {
        return calculationsRepository.findById(id).map(existing -> {
            calculationsRepository.delete(existing);
            return true;
        }).orElse(false);
    }
}
