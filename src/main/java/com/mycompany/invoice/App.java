package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // instancie un conteneur léger qui se trouve dans mon classe path qui s'appel ApplicationContext.xml
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/*        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Pour récuperer mon controller je peux pas soit par son id soit par son interface
        //context.getBean("controller"); mais je n'ai pas d'id pour mon controller

        //En précisant l'interface, je vais récupérer InvoiceControllerWeb car c'est celui que j'ai déclaré dans mon applicationContext.xml
        InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);

        //InvoiceControllerInterface controller = context.getBean("web",InvoiceControllerInterface.class);
        controller.createInvoice();*/
        ApplicationContext context = SpringApplication.run(App.class);
        InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);

        //InvoiceControllerInterface controller = context.getBean("web",InvoiceControllerInterface.class);
        //controller.createInvoice();



        /*      System.out.println("Dans quel scénario étons ? ");
        Scanner scanner = new Scanner(System.in);
        int scenario = scanner.nextInt();


        if (scenario == 1){
            InvoiceController invoiceController = new InvoiceController();

            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);

            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceService.setRepository(invoiceRepository);

            invoiceController.createInvoice();
        }
        if (scenario == 2){

            InvoiceControllerNewClient invoiceControllerNewClient = new InvoiceControllerNewClient();

            InvoiceServiceNewClient invoiceServiceNewClient = new InvoiceServiceNewClient();
            invoiceControllerNewClient.setNewServiceClient(invoiceServiceNewClient);

            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceServiceNewClient.setRepository(invoiceRepository);

            invoiceControllerNewClient.createInvoice();
        }*/

/*        Scanner scanner = new Scanner(System.in);

        System.out.println("quelle est le controller que vous voulez");
        String controllerName = scanner.nextLine();

        System.out.println("quelle est le service que vous voulez");
        String serviceName = scanner.nextLine();

        System.out.println("quelle est le repository que vous voulez");
        String repositoryName = scanner.nextLine();*/

        //com.mycompany.invoice.controller.console.InvoiceController   ou com.mycompany.invoice.controller.InvoiceControllerNewController
        //om.mycompany.invoice.service.InvoiceService ou om.mycompany.invoice.service.InvoiceServiceNewClient
        //om.mycompany.invoice.repository.InvoiceRepository

/*        InvoiceControllerInterface controller = null;
        InvoiceServiceInterface service = null;
        InvoiceRepositoryInterface repository = null;

        controller = (InvoiceControllerInterface) Class.forName(controllerName).getDeclaredConstructor().newInstance();
        service = (InvoiceServiceInterface) Class.forName(serviceName).getDeclaredConstructor().newInstance();
        repository = (InvoiceRepositoryInterface) Class.forName(repositoryName).getDeclaredConstructor().newInstance();


        controller.setInvoiceService(service);
        service.setRepository(repository);

        controller.createInvoice();*/

    }
}
