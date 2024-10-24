package com.ijse.salesystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.salesystem.entity.Stock;

@Service
public interface StockService {
    List<Stock> getAllStocks();
    Stock getStockById(Long id);
    Stock createStock(Stock stock);
}
