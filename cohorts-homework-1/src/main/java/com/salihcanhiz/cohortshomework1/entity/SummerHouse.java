package com.salihcanhiz.cohortshomework1.entity;

import com.salihcanhiz.cohortshomework1.enums.EstateType;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class SummerHouse extends Property{

    public SummerHouse(double price, double squareMeters, int roomCount, int livingRoomCount) {
        super(price, squareMeters, roomCount, livingRoomCount);
    }

    @Override
    public EstateType getPropertyType() {
        return EstateType.SUMMER_HOUSE;
    }
}
