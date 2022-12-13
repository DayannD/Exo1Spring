package com.mycompany.invoice.controller.list;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListController {
    @Autowired
    private InvoiceServiceInterface service;

    @RequestMapping("/list")
    public @ModelAttribute("invoices") List<Invoice> displayList(){
        List<Invoice> listInvoice = service.getList();
        return listInvoice;
    }
}
