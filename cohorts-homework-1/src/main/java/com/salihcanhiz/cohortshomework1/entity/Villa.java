package com.salihcanhiz.cohortshomework1.entity;

import com.salihcanhiz.cohortshomework1.enums.EstateType;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Villa extends Property{

    public Villa(double price, double squareMeters, int roomCount, int livingRoomCount) {
        super(price, squareMeters, roomCount, livingRoomCount);
    }

    @Override
    public EstateType getPropertyType() {
        return EstateType.VILLA;
    }
}
