package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController {

    public void createInvoiceUsingConsole(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Customer name");
        String customerInvoice = scanner.nextLine();

        Invoice newInvoice = new Invoice();
        newInvoice.setCustomerInvoice(customerInvoice);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(newInvoice);
    }
}
