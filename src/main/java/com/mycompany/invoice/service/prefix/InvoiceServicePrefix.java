package com.mycompany.invoice.service.prefix;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.memory.InvoiceRepository;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

//@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {
    @Value("${invoice.lastNumber}")
    private long lastNumber = 0L;
    @Value("${invoice.prefix}")
    private String prefix;
    @Value("${invoice.file}")
    private File file;
    @Autowired
    private InvoiceRepositoryInterface repository = new InvoiceRepository();

    public void createInvoice(Invoice invoice){
        //Donner un numéro à ma facture
        invoice.setNumber(prefix + String.valueOf(++lastNumber));
        //appeller le repository pour l'enregistrer
        repository.createInvoice(invoice);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public InvoiceRepositoryInterface getRepository() {
        return repository;
    }

    public void setRepository(InvoiceRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<Invoice> getList() {
        return null;
    }

    public long getLastNumber() {
        return lastNumber;
    }

    public  void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

}
