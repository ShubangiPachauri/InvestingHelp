package com.example.investinghelp.Service;

import com.example.investinghelp.Models.Calculations;
import com.example.investinghelp.Repository.CalculationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CalculationsService {
    private final CalculationsRepository repository;

    public void add(Calculations calc) {
        repository.save(calc);
    }

    public List<Calculations> getAll() {
        return repository.findAll();
    }
}
