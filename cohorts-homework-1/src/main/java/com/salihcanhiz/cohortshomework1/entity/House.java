package com.salihcanhiz.cohortshomework1.entity;

import com.salihcanhiz.cohortshomework1.enums.EstateType;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class House extends Property{
    public House(double price, double squareMeters, int roomCount, int livingRoomCount) {
        super(price, squareMeters, roomCount, livingRoomCount);
    }

    @Override
    public EstateType getPropertyType() {
        return EstateType.HOUSE;
    }
}
