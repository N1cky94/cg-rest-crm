package com.colruytgroup.restcrm;

import com.colruytgroup.restcrm.domain.Company;
import com.colruytgroup.restcrm.services.ContactService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestCrmApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(RestCrmApplication.class, args);

//        ContactService service = ctx.getBean(ContactService.class);
////        service.createNewContact("Nick", "nick@cg.com", "0483618655");
////        service.connectToCompany(1L, new Company("Archilios", "Knesselaarsestraat 39, Aalter"));
//        service.disconnectFromCompany("Nick");
//        service.connectToCompany(1L, new Company("Colruyt Group", "Edingensessteenweg 196, Halle"));
    }

}
