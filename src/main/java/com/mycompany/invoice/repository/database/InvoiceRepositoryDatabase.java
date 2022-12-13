package com.mycompany.invoice.repository.database;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.mycompany.invoice.repository.memory.InvoiceRepository.invoices;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
    private InvoiceRepositoryInterface invoiceRepositoryInterface;

    public InvoiceRepositoryInterface getInvoiceRepositoryInterface() {
        return invoiceRepositoryInterface;
    }

    public void setInvoiceRepositoryInterface(InvoiceRepositoryInterface invoiceRepositoryInterface) {
        this.invoiceRepositoryInterface = invoiceRepositoryInterface;
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice("50","dayann");
        Invoice invoice2 = new Invoice("50","dayann");

        return List.of(invoice1,invoice2);
    }

    public void createInvoice(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice added with number " + invoice.getNumber() + " for customer :" + invoice.getCustomerInvoice());
    }
}
