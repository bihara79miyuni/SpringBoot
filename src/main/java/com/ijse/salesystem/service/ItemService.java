package com.ijse.salesystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.salesystem.entity.Item;

@Service
public interface ItemService {
    List<Item> getAllItems();
    
}
