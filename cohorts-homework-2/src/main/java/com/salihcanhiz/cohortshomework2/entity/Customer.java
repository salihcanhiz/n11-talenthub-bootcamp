package com.salihcanhiz.cohortshomework2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private String surname;
    private String sector;
    private List<Order> orders;
    private LocalDate createdAt;


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name +
                ", surname='" + surname +
                ", createdAt=" + createdAt +
                '}';
    }
}
