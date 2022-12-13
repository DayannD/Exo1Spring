package com.mycompany.invoice.service.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService implements InvoiceServiceInterface {


    private static long lastNumber = 0L;

    @Autowired
    private InvoiceRepositoryInterface repository ;


    public void createInvoice(Invoice invoice){
        //Donner un numéro à ma facture
        invoice.setNumber(String.valueOf(++lastNumber));
        //appeller le repository pour l'enregistrer
        repository.createInvoice(invoice);
    }
    public static void setLastNumber(long lastNumber) {
        InvoiceService.lastNumber = lastNumber;
    }
    public static long getLastNumber() {
        return InvoiceService.lastNumber;
    }
    public InvoiceRepositoryInterface getRepository() {
        return repository;
    }
    public void setRepository(InvoiceRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<Invoice> getList() {

        System.out.println(repository.list().toString());
        return repository.list();
    }
}
