package com.ijse.salesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.salesystem.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Long,Category>{
    
}
