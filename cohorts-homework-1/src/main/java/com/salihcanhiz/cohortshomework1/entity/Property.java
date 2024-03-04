package com.salihcanhiz.cohortshomework1.entity;

import com.salihcanhiz.cohortshomework1.enums.EstateType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Property {
    private double price;
    private double squareMeters;
    private int roomCount;
    private int livingRoomCount;

    protected Property() {
        this.price = 0;
        this.squareMeters = 0;
        this.roomCount = 0;
        this.livingRoomCount = 0;
    }

    public abstract EstateType getPropertyType() ;

    public String toString() {
        return "Property{" +
                ", price=" + price +
                ", squareMeters=" + squareMeters +
                ", roomCount=" + roomCount +
                ", livingRoomCount=" + livingRoomCount +
                '}';
    }
}

