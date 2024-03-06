package com.salihcanhiz.cohortshomework2.service;

public interface InvoiceService {

    void calculateTotalInvoiceForJuneRegistrations();

    void findAll();

    void getInvoicesOver1500();

    void averageOfInvoicesOverAmount();

    void listOfCustomersHasBelowAmount();

    void listOfSectorNamesInvoiceAmountBelow();

}
