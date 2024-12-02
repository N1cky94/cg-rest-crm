package com.colruytgroup.restcrm.apis;

import com.colruytgroup.restcrm.domain.Contact;
import com.colruytgroup.restcrm.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/contacts")
@RequiredArgsConstructor
public class ContactRestController {
    private final ContactService contactService;

    @GetMapping("{id}")
    public Contact getContactById(@PathVariable String id) {
        return contactService.fetchById(Long.valueOf(id));
    }

}
