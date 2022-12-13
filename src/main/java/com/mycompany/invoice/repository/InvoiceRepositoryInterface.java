package com.mycompany.invoice.repository;

import com.mycompany.invoice.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {

    public void createInvoice(Invoice invoice);

    public void setInvoiceRepositoryInterface(InvoiceRepositoryInterface invoiceRepositoryInterface);

    public List<Invoice> list();
}
