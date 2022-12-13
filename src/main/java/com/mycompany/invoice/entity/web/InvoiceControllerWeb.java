package com.mycompany.invoice.entity.web;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getNewServiceClient() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface newServiceClient) {
        this.invoiceService = newServiceClient;
    }

    public void createInvoice(){
        String customerName = "name";
        Invoice invoice = new Invoice();
        invoice.setCustomerInvoice(customerName);
        System.out.println("web");
        //InvoiceServiceNewClient newServiceClient = new InvoiceServiceNewClient();
        invoiceService.createInvoice(invoice);
    }

    @RequestMapping("/invoice-home")
    public String displayHome(){
        System.out.println("Home displayed !");
        return"";
    }
}
