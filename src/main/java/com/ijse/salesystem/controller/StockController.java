package com.ijse.salesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/stocks")
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock){
        Stock createdStock = stockService.createStock(stock);

        return ResponseEntity.status(201).body(createdStock);
    }

    @PutMapping("/stocks/{stockId}")
    public ResponseEntity<Stock> updateStock(@PathVariable Long id,@RequestBody Stock stock){
        Stock updatedStock = stockService.updateStock(id, stock);

        if(updatedStock == null){
            return ResponseEntity.status(404).body(null);
        }else{
            return ResponseEntity.status(201).body(updatedStock);
        }
    }

    @DeleteMapping("/stocks/{stockId}")
    public void deleteStock(@PathVariable Long stockId){
        stockService.deleteStock(stockId);
    }
}
