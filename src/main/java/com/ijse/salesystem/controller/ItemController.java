package com.ijse.salesystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.salesystem.dto.ItemReqDto;
import com.ijse.salesystem.entity.Item;
import com.ijse.salesystem.entity.Category;
import com.ijse.salesystem.entity.Stock;
import com.ijse.salesystem.service.CategoryService;
import com.ijse.salesystem.service.ItemService;
import com.ijse.salesystem.service.StockService;

@RestController
public class ItemController {
    
    @Autowired
    private ItemService itemService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private StockService stockService;

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems(){
        List<Item>items = itemService.getAllItems();

        return ResponseEntity.status(200).body(items);
    }

    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody ItemReqDto itemReqDto){
        Item item = new Item();
        item.setName(itemReqDto.getName());
        item.setPrice(itemReqDto.getPrice());
        
        Category category = categoryService.getCategoryById(itemReqDto.getCategoryId());
        item.setCategory(category);

        Stock stock = stockService.getStockById(itemReqDto.getStockId());
        item.setStock(stock);

        Item createdItem = itemService.createItem(item);
        return ResponseEntity.status(201).body(createdItem);
    }
}
