package com.salihcanhiz.cohortshomework1;

import com.salihcanhiz.cohortshomework1.entity.House;

import com.salihcanhiz.cohortshomework1.entity.Property;
import com.salihcanhiz.cohortshomework1.entity.SummerHouse;
import com.salihcanhiz.cohortshomework1.entity.Villa;
import com.salihcanhiz.cohortshomework1.enums.EstateType;
import com.salihcanhiz.cohortshomework1.service.PropertyService;
import com.salihcanhiz.cohortshomework1.util.DummyData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class CohortsHomework1Application {

    public static void main(String[] args) {
        SpringApplication.run(CohortsHomework1Application.class, args);

        DummyData.dummyData();

        List<House> houseList = DummyData.getHouseList();
        List<Villa> villaList = DummyData.getVillaList();
        List<SummerHouse> summerHouseList = DummyData.getSummerHouseList();
        List<Property> propertyList = DummyData.propertyList;

        PropertyService propertyService = new PropertyService(houseList, villaList, summerHouseList, propertyList);


        System.out.println("Total House price: " + propertyService.getTotalHousePrice());
        System.out.println("Total Villa price: " + propertyService.getTotalVillaPrice());
        System.out.println("Total Summer House price: " + propertyService.getTotalSummerHousePrice());
        System.out.println("Total Properties price: " + propertyService.getTotalAllTypePrice());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Average square meters of Houses:  " + propertyService.getHouseAverageSquareMeters());
        System.out.println("Average square meters of Villa " + propertyService.getVillaAverageSquareMeters());
        System.out.println("Average square meters of Summer House " + propertyService.getSummerHouseAverageSquareMeters());
        System.out.println("Average square meters of all Properties " + propertyService.getAllTypeAverageSquareMeters());
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Filtering Houses by number of rooms and living rooms: " + propertyService.filterPropertiesLivingRoomsAndRooms(3, 1, EstateType.HOUSE));
        System.out.println("Filtering Villas by number of rooms and living rooms: " + propertyService.filterPropertiesLivingRoomsAndRooms(2, 1, EstateType.VILLA));
        System.out.println("Filtering Summer Houses by number of rooms and living rooms: " + propertyService.filterPropertiesLivingRoomsAndRooms(4, 2, EstateType.SUMMER_HOUSE));

    }

}
