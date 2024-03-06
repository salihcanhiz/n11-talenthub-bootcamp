package com.salihcanhiz.cohortshomework2.dummydata;

import com.salihcanhiz.cohortshomework2.service.Impl.CustomerServiceImpl;
import com.salihcanhiz.cohortshomework2.service.Impl.InvoiceServiceImpl;

import java.util.Scanner;

public class AppMenu {


    public static void appRun() {
        Scanner keyboard = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();
        boolean temp = true;


        while (temp) {
            appMenu();
            int number = keyboard.nextInt();
            switch (number) {
                case 1:
                    customerService.save(keyboard);
                    break;
                case 2:
                    customerService.findAll();
                    break;
                case 3:
                    customerService.filterByLetterC();
                    break;
                case 4:
                    invoiceService.calculateTotalInvoiceForJuneRegistrations();
                    break;
                case 5:
                    invoiceService.findAll();
                    break;
                case 6:
                    invoiceService.getInvoicesOver1500();
                    break;
                case 7:
                    invoiceService.averageOfInvoicesOverAmount();
                    break;
                case 8:
                    invoiceService.listOfCustomersHasBelowAmount();
                    break;
                case 9:
                    invoiceService.listOfSectorNamesInvoiceAmountBelow();
                    break;
                case 0:
                    temp = false;
                    System.out.println("Exit successful");
                    break;
                default:
                    System.out.println("Invalid menu operation!");
            }
        }


    }

    private static void appMenu() {

        System.out.println("|----------------------------------- Menu------------------------------------|");

        System.out.println(" 1 Add new customer ");
        System.out.println(" 2 List all customers ");
        System.out.println(" 3 List all customers which has letter 'c' in their name");
        System.out.println(" 4 List the total amount of invoices of customers who registered in June");
        System.out.println(" 5 List all invoices ");
        System.out.println(" 6 List invoices over 1500TL ");
        System.out.println(" 7 Calculate the average of invoices over 1500TL ");
        System.out.println(" 8 List the names of customers with invoices under 500TL ");
        System.out.println(" 9 Sectors of companies whose average invoices in June were below 750");
        System.out.println(" 0 Exit");
        System.out.println("|----------------------------------------------------------------------------|");
        System.out.print("Please enter operation number: ");
    }

}
