package com.ijse.salesystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemReqDto {
    private Long id;
    private String name;
    private Double price;
    private Long categoryId;
    private Long stockId;
    
}
