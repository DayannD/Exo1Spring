package com.mycompany.invoice.repository;

import com.mycompany.invoice.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {

    public static List<Invoice> invoices = new ArrayList<>();

    public void createInvoice(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice added with number "+ invoice.getNumber()+" for customer :"+ invoice.getCustomerInvoice());
    }
}
