package com.salihcanhiz.cohortshomework2.dummydata;

import com.salihcanhiz.cohortshomework2.entity.Customer;
import com.salihcanhiz.cohortshomework2.entity.Invoice;
import com.salihcanhiz.cohortshomework2.entity.Order;
import com.salihcanhiz.cohortshomework2.entity.Product;
import lombok.Getter;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DummyData {

    @Getter
    private static final List<Customer> customerList = new ArrayList<>();
    @Getter
    private static final List<Invoice> invoiceList = new ArrayList<>();

    static {
        dummyData();
    }

    private DummyData() {
    }

    private static void dummyData() {
        Customer salih = new Customer("salih", "Hız", "banking", new ArrayList<>(), LocalDate.of(2023, 6, 19));
        Customer can = new Customer("can", "Hız", "it", new ArrayList<>(), LocalDate.of(2022,6,7));
        Customer bahadir = new Customer("bahadir", "Memiş", "it", new ArrayList<>(), LocalDate.now());
        Customer yusuf = new Customer("yusuf", "Ceyhan", "it", new ArrayList<>(), LocalDate.now());
        Customer john = new Customer("john", "Jack", "teaching", new ArrayList<>(), LocalDate.now());


        Product sunglasses = new Product("sunglasses", Double.valueOf(100));
        Product book = new Product("book", Double.valueOf(15));
        Product jacket = new Product("jacket", Double.valueOf(40));
        Product pen = new Product("pen", Double.valueOf(5));
        Product shoes = new Product("shoes", Double.valueOf(2000));

        Order salihOrder = new Order(salih, List.of(shoes, sunglasses));
        Order canOrder = new Order(can, List.of(book, sunglasses));
        Order bahadirOrder = new Order(bahadir, List.of(jacket, pen));
        Order yusufOrder = new Order(yusuf, List.of(shoes, sunglasses, sunglasses, pen));
        Order johnOrder = new Order(john, List.of(book, jacket, pen, sunglasses));

        salih.getOrders().add(salihOrder);
        can.getOrders().add(canOrder);
        bahadir.getOrders().add(bahadirOrder);
        yusuf.getOrders().add(yusufOrder);
        john.getOrders().add(johnOrder);

        Invoice salihInvoice = new Invoice(LocalDateTime.now(),1750.0, salihOrder);
        Invoice canInvoice = new Invoice(LocalDateTime.now(),1000.0, canOrder);
        Invoice bahadirInvoice = new Invoice(LocalDateTime.now() ,490.0, bahadirOrder);
        Invoice yusufInvoice = new Invoice(LocalDateTime.now() ,1800.0, yusufOrder);
        Invoice johnInvoice = new Invoice(LocalDateTime.now(),730.0, johnOrder);

        customerList.add(salih);
        customerList.add(can);
        customerList.add(bahadir);
        customerList.add(yusuf);
        customerList.add(john);

        invoiceList.add(salihInvoice);
        invoiceList.add(canInvoice);
        invoiceList.add(bahadirInvoice);
        invoiceList.add(yusufInvoice);
        invoiceList.add(johnInvoice);
    }
}


