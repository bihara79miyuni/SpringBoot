package com.ijse.salesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.salesystem.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long>{
    
}
