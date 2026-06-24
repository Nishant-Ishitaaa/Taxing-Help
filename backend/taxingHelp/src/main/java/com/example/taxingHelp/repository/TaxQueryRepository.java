package com.example.taxingHelp.repository;

import com.example.taxingHelp.entity.TaxQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxQueryRepository
        extends JpaRepository<TaxQuery, Long> {
}