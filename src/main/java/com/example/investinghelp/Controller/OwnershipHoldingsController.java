package com.example.investinghelp.Controller;

import com.example.investinghelp.Models.OwnershipHoldings;
import com.example.investinghelp.Service.OwnershipHoldingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownership-holdings")
@RequiredArgsConstructor
public class OwnershipHoldingsController {

    private final OwnershipHoldingsService ownershipHoldingsService;

    // Create / Save
    @PostMapping
    public OwnershipHoldings save(@RequestBody OwnershipHoldings holdings) {
        return ownershipHoldingsService.save(holdings);
    }

    // Get All Records
    @GetMapping
    public List<OwnershipHoldings> getAll() {
        return ownershipHoldingsService.findAll();
    }
}
