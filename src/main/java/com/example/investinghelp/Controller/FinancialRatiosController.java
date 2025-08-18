package com.example.investinghelp.Controller;

import com.example.investinghelp.Models.FinancialRatios;
import com.example.investinghelp.Service.FinancialRatiosService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/financial-ratios")
@RequiredArgsConstructor
public class FinancialRatiosController {
    private static final Logger log = LoggerFactory.getLogger(FinancialRatiosController.class);
    private final FinancialRatiosService service;

    @PostMapping
    public String add(@RequestBody FinancialRatios ratios) {
        log.info("Adding financial ratios for stock");
        service.add(ratios);
        return "Financial Ratios Added Successfully!";
    }

    @GetMapping
    public List<FinancialRatios> getAll() {
        log.info("Fetching all financial ratios");
        return service.getAll();
    }
}

