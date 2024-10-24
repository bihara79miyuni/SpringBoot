package com.ijse.salesystem.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Integer currentQty;

    private LocalDateTime lastUpdated;

    @PrePersist
    protected void onCreate() {
        if(this.lastUpdated == null) {
            this.lastUpdated = LocalDateTime.now();
        }
    }
    
    @JsonIgnore
    @OneToMany(mappedBy = "stock")
    private List<Item> stocks;
}
