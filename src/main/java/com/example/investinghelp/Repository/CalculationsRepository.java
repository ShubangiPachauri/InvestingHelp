package com.example.investinghelp.Repository;

import com.example.investinghelp.Models.Calculations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationsRepository extends JpaRepository<Calculations, Long> {
    
}
