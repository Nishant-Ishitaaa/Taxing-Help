package com.example.taxingHelp.controller;

import com.example.taxingHelp.entity.TaxQuery;
import com.example.taxingHelp.service.TaxQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/query")
@CrossOrigin(origins = "http://localhost:5173")
public class TaxQueryController {

    @Autowired
    private TaxQueryService service;

    @PostMapping
    public TaxQuery saveQuery(@RequestBody TaxQuery query) {
        return service.saveQuery(query);
    }

    @GetMapping
    public List<TaxQuery> getAllQueries() {
        return service.getAllQueries();
    }
}