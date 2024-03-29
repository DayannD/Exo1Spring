package com.mycompany.invoice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {
        "com.mycompany.invoice.controller.web",
        "com.mycompany.invoice.service.prefix",
        "com.mycompany.invoice.repository.memory"
})
public class AppConfig {
}
