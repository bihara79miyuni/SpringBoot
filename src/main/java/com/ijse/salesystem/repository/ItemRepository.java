package com.ijse.salesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.salesystem.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Long,Item>{
    
}