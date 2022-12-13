package com.mycompany.invoice.controller.console;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
//@Controller
public class InvoiceController  implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Customer name");
        String customerInvoice = scanner.nextLine();

        Invoice newInvoice = new Invoice();
        newInvoice.setCustomerInvoice(customerInvoice);

        invoiceService.createInvoice(newInvoice);
    }


}
