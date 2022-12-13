package com.mycompany.invoice.repository.memory;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//@Repository
public class InvoiceRepository implements InvoiceRepositoryInterface {

    public static List<Invoice> invoices = new ArrayList<>();

    private InvoiceRepositoryInterface invoiceRepositoryInterface;

    public InvoiceRepositoryInterface getInvoiceRepositoryInterface() {
        return invoiceRepositoryInterface;
    }

    public void setInvoiceRepositoryInterface(InvoiceRepositoryInterface invoiceRepositoryInterface) {
        this.invoiceRepositoryInterface = invoiceRepositoryInterface;
    }

    @Override
    public List<Invoice> list() {
        return null;
    }

    public void createInvoice(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice added with number "+ invoice.getNumber()+" for customer :"+ invoice.getCustomerInvoice());
    }
}
