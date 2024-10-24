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

    @Override
    public Stock getStockById(Long id){
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public Stock createStock(Stock stock){
        return stockRepository.save(stock);
    }

    @Override
    public Stock updateStock(Long id,Stock stock){
        Stock existingStock = stockRepository.findById(id).orElse(null);

        if(existingStock == null){
            return null;
        }else{
            existingStock.setName(stock.getName());
            existingStock.setCurrentQty(stock.getCurrentQty());
            existingStock.setLastUpdated(stock.getLastUpdated());

            return stockRepository.save(existingStock);
        }
    }

    @Override
    public void deleteStock(Long id){
        stockRepository.deleteById(id);
    }

}
