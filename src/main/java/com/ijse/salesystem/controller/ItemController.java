package com.ijse.salesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.salesystem.entity.Item;
import com.ijse.salesystem.service.ItemService;

@RestController
public class ItemController {
    
    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems(){
        List<Item>items = itemService.getAllItems();

        return ResponseEntity.status(200).body(items);
    }
}
