package com.example.investinghelp.Controller;

import com.example.investinghelp.Models.Calculations;
import com.example.investinghelp.Service.CalculationsService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/calculations")
@RequiredArgsConstructor
public class CalculationsController {
    private static final Logger log = LoggerFactory.getLogger(CalculationsController.class);
    private final CalculationsService service;

    @PostMapping
    public String add(@RequestBody Calculations calc) {
        log.info("Adding calculations");
        service.add(calc);
        return "Calculations Added Successfully!";
    }

    @GetMapping
    public List<Calculations> getAll() {
        log.info("Fetching all calculations");
        return service.getAll();
    }
}
