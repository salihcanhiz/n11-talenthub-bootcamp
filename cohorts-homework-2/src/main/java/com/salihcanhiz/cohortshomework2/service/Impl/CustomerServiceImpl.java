package com.salihcanhiz.cohortshomework2.service.Impl;

import com.salihcanhiz.cohortshomework2.dummydata.DummyData;
import com.salihcanhiz.cohortshomework2.entity.Customer;
import com.salihcanhiz.cohortshomework2.service.CustomerService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customerList = DummyData.getCustomerList();

    @Override
    public void findAll() {
       for(Customer customer:customerList){
           System.out.println(customer);
       }
    }
    @Override
    public void filterByLetterC() {
        List<Customer> filteredList = customerList.stream()
                .filter(customer -> customer.getName().toLowerCase().contains("c") || customer.getSurname().toLowerCase().contains("c"))
                .collect(Collectors.toList());
        filteredList.forEach(customer -> System.out.println(customer.getName()+ " " + customer.getSurname()));

    }
    @Override
    public void save(Scanner scanner) {
        System.out.print("Please enter a name: ");
        String name = scanner.next();
        System.out.print("Please enter a surname: ");
        String surname = scanner.next();
        System.out.print("Please enter a sector: ");
        String sector = scanner.next();

        Customer customer = new Customer(name, surname, sector,new ArrayList<>(), LocalDate.now());
        customerList.add(customer);

    }



}
