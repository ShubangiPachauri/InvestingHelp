package com.example.investinghelp.Controller;

import com.example.investinghelp.Models.OwnershipHoldings;
import com.example.investinghelp.Service.OwnershipHoldingsService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ownership-holdings")
@RequiredArgsConstructor
public class OwnershipHoldingsController {
    private static final Logger log = LoggerFactory.getLogger(OwnershipHoldingsController.class);
    private final OwnershipHoldingsService service;

    @PostMapping
    public String add(@RequestBody OwnershipHoldings holdings) {
        log.info("Adding ownership holdings");
        service.add(holdings);
        return "Ownership Holdings Added Successfully!";
    }

    @GetMapping
    public List<OwnershipHoldings> getAll() {
        log.info("Fetching all ownership holdings");
        return service.getAll();
    }
}

