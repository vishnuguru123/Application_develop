package com.example.day1q1.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class review_dto{





    private int productId;
    private String name;
    private int qty;
    private double price;
}


