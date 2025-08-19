package com.example.investinghelp.Controller;

import com.example.investinghelp.Models.FinancialRatios;
import com.example.investinghelp.Service.FinancialRatiosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/financial-ratios")
@RequiredArgsConstructor
public class FinancialRatiosController {

    private final FinancialRatiosService financialRatiosService;

    // Save Record
    @PostMapping
    public ResponseEntity<FinancialRatios> save(@RequestBody FinancialRatios ratios) {
        return ResponseEntity.ok(financialRatiosService.save(ratios));
    }

    // Fetch All Records
    @GetMapping
    public ResponseEntity<List<FinancialRatios>> getAll() {
        return ResponseEntity.ok(financialRatiosService.findAll());
    }
}
