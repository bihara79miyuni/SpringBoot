package com.ijse.salesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.salesystem.entity.Stock;
import com.ijse.salesystem.service.StockService;

@RestController
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping("/stocks")
    public ResponseEntity<List<Stock>> getAllStocks(){
        List<Stock> stock = stockService.getAllStocks();
        return ResponseEntity.status(200).body(stock);
    }
}
