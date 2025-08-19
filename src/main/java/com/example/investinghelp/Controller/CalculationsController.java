package com.example.investinghelp.Controller;

import com.example.investinghelp.Models.Calculations;
import com.example.investinghelp.Service.CalculationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calculations")
@RequiredArgsConstructor
public class CalculationsController {

    private final CalculationsService calculationsService;

    //Save new calculation
    @PostMapping
    public ResponseEntity<Calculations> save(@RequestBody Calculations calculation) {
        return ResponseEntity.ok(calculationsService.save(calculation));
    }

    // Get all calculations
    @GetMapping
    public ResponseEntity<List<Calculations>> getAll() {
        return ResponseEntity.ok(calculationsService.findAll());
    }

    //Get calculation by StockId
    @GetMapping("/{id}")
    public ResponseEntity<Calculations> getById(@PathVariable Long id) {
        return calculationsService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //Update calculation by StockId
    @PutMapping("/{id}")
    public ResponseEntity<Calculations> update(@PathVariable Long id, @RequestBody Calculations updatedCalc) {
        return calculationsService.update(id, updatedCalc)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //Delete calculation by StockId
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return calculationsService.delete(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
