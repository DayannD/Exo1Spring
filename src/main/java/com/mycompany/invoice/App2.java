package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class App2 {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext(App2.class);

        ApplicationContext context = SpringApplication.run(App2.class);
        InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);

        //InvoiceControllerInterface controller = context.getBean("web",InvoiceControllerInterface.class);
        controller.createInvoice();

    }
}
