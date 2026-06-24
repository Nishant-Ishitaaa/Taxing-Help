package com.example.taxingHelp.service;

import com.example.taxingHelp.entity.TaxQuery;
import com.example.taxingHelp.repository.TaxQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxQueryService {

    @Autowired
    private TaxQueryRepository repository;

    public TaxQuery saveQuery(TaxQuery query) {
        return repository.save(query);
    }

    public List<TaxQuery> getAllQueries() {
        return repository.findAll();
    }
}