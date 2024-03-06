package com.salihcanhiz.cohortshomework2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    private LocalDateTime invoiceDateTime;
    private Double totalPrice;
    private Order order;



    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceDateTime=" + invoiceDateTime +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
