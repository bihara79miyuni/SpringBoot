package com.ijse.salesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.salesystem.entity.Stock;
import com.ijse.salesystem.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService{
    
    @Autowired
    private StockRepository stockRepository;

    @Override
    public List<Stock> getAllStocks(){
        return stockRepository.findAll();
    }
}