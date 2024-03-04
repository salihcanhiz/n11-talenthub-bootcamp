package com.salihcanhiz.cohortshomework1.util;

import com.salihcanhiz.cohortshomework1.entity.House;
import com.salihcanhiz.cohortshomework1.entity.Property;
import com.salihcanhiz.cohortshomework1.entity.SummerHouse;
import com.salihcanhiz.cohortshomework1.entity.Villa;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DummyData {

    @Getter
    public static final List<House> houseList = new ArrayList<>();

    @Getter
    public static final List<Villa> villaList = new ArrayList<>();

    @Getter
    public static final List<SummerHouse> summerHouseList = new ArrayList<>();

    public static final List<Property> propertyList= new ArrayList<>();

    public DummyData() {
    }

    public static void dummyData() {
        villaList.add(new Villa(150000, 180, 2, 1));
        villaList.add(new Villa(175000, 170, 4, 1));
        villaList.add(new Villa(145000, 155, 5, 2));
        houseList.add(new House(157000, 125, 2, 1));
        houseList.add(new House(160000, 120, 3, 1));
        houseList.add(new House(120050, 110, 1, 1));
        summerHouseList.add(new SummerHouse(350000, 210, 3, 1));
        summerHouseList.add(new SummerHouse(345000, 185, 4, 2));
        summerHouseList.add(new SummerHouse(268000, 190, 2, 1));

        propertyList.addAll(villaList);
        propertyList.addAll(houseList);
        propertyList.addAll(summerHouseList);
    }



}
