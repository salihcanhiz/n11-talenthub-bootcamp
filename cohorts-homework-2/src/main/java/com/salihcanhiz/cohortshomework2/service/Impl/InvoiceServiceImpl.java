package com.salihcanhiz.cohortshomework2.service.Impl;

import com.salihcanhiz.cohortshomework2.dummydata.DummyData;
import com.salihcanhiz.cohortshomework2.entity.Invoice;
import com.salihcanhiz.cohortshomework2.service.InvoiceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class InvoiceServiceImpl implements InvoiceService {


    private final List<Invoice> invoices = DummyData.getInvoiceList();

    @Override
    public void calculateTotalInvoiceForJuneRegistrations() {
        double totalPrice = invoices.stream()
                .filter(invoice -> invoice.getOrder().getCustomer().getCreatedAt().getMonthValue() == 6)
                .mapToDouble(Invoice::getTotalPrice)
                .sum();
        System.out.println(totalPrice);
    }

    @Override
    public void findAll() {
        for (Invoice invoice : invoices) {
            System.out.println(invoices);
        }
    }

    @Override
    public void getInvoicesOver1500() {
        List<Invoice> invoiceList = invoices.stream()
                .filter(invoice -> invoice.getTotalPrice() > 1500.0)
                .collect(Collectors.toList());
        invoiceList.forEach(invoice -> System.out.println(invoice));
    }

    @Override
    public void averageOfInvoicesOverAmount() {
        List<Invoice> invoiceList = invoices.stream()
                .filter(invoice -> invoice.getTotalPrice() > 1500.0)
                .collect(Collectors.toList());
        double totalPrice = invoiceList.stream()
                .mapToDouble(Invoice::getTotalPrice)
                .sum();
        if (!invoiceList.isEmpty()) {
            System.out.println(totalPrice / invoiceList.size());
        } else {
            System.out.println("List is empty");
        }

    }

    @Override
    public void listOfCustomersHasBelowAmount() {
        List<String> names = new ArrayList<>();
        for (Invoice invoice : invoices) {
            if (invoice.getTotalPrice() < 500) {
                names.add(invoice.getOrder().getCustomer().getName());
            }
        }
        for (String name : names) {
            System.out.println(name);
        }

    }

    @Override
    public void listOfSectorNamesInvoiceAmountBelow() {
        Set<String> names = new HashSet<>();
        for (Invoice invoice : invoices) {
            if (invoice.getTotalPrice() < 750) {
                names.add(invoice.getOrder().getCustomer().getSector());
            }
        }
        for (String name : names) {
            System.out.println(name);
        }    }

    }

