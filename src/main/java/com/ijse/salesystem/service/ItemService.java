package com.ijse.salesystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.salesystem.entity.Item;

@Service
public interface ItemService {
    List<Item> getAllItems();
    Item createItem(Item item);
    Item updateItem(Long id,Item item);
    void deleteItem(Long id);
}
