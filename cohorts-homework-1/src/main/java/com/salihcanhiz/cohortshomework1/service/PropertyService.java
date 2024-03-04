package com.salihcanhiz.cohortshomework1.service;

import com.salihcanhiz.cohortshomework1.entity.House;
import com.salihcanhiz.cohortshomework1.entity.Property;
import com.salihcanhiz.cohortshomework1.entity.SummerHouse;
import com.salihcanhiz.cohortshomework1.entity.Villa;
import com.salihcanhiz.cohortshomework1.enums.EstateType;

import java.util.ArrayList;
import java.util.List;

public class PropertyService {
    public static List<House> houseList = new ArrayList<>();
    public static List<Villa> villaList = new ArrayList<>();
    public static List<SummerHouse> summerHouseList = new ArrayList<>();

    public static List<Property> propertyList = new ArrayList<>();


    public PropertyService(List<House> houseList, List<Villa> villaList, List<SummerHouse> summerHouseList, List<Property> propertyList) {
        this.houseList = houseList;
        this.villaList = villaList;
        this.summerHouseList = summerHouseList;
        this.propertyList = propertyList;
    }

    public PropertyService() {

    }


    public double getTotalHousePrice() {
        double houseTotalPrice = 0;
        for (House house : houseList) {
            houseTotalPrice += house.getPrice();
        }
        return houseTotalPrice;
    }

    public double getTotalVillaPrice() {
        double villaTotalPrice = 0;
        for (Villa villa : villaList) {
            villaTotalPrice += villa.getPrice();
        }
        return villaTotalPrice;
    }

    public double getTotalSummerHousePrice() {
        double summerHouseTotalPrice = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            summerHouseTotalPrice += summerHouse.getPrice();
        }
        return summerHouseTotalPrice;
    }

    public double getTotalAllTypePrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
    }

    public double getHouseAverageSquareMeters() {
        double totalHouseSquareMeters = 0;
        for (House house : houseList) {
            totalHouseSquareMeters += house.getSquareMeters();
        }
        return totalHouseSquareMeters / houseList.size();
    }

    public double getVillaAverageSquareMeters() {
        double totalVillaSquareMeters = 0;
        for (Villa villa : villaList) {
            totalVillaSquareMeters += villa.getSquareMeters();
        }
        return totalVillaSquareMeters / villaList.size();

    }

    public double getSummerHouseAverageSquareMeters() {
        double totalSummerHouseSquareMeters = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            totalSummerHouseSquareMeters += summerHouse.getSquareMeters();
        }
        return totalSummerHouseSquareMeters / summerHouseList.size();
    }

    public double getAllTypeAverageSquareMeters() {
        return (getSummerHouseAverageSquareMeters() + getVillaAverageSquareMeters() + getHouseAverageSquareMeters()) / 3;
    }

    public List<Property> filterPropertiesLivingRoomsAndRooms(int roomCount, int livingRoomCount, EstateType estateType) {
        List<Property> filteredProperties = new ArrayList<>();
        for (Property property : propertyList) {
            if (property.getLivingRoomCount() == livingRoomCount
                    && property.getRoomCount() == roomCount
                    && property.getPropertyType() == estateType)
                filteredProperties.add(property);
        }
        return filteredProperties;
    }


}
