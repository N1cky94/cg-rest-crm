package com.colruytgroup.restcrm.services;

import com.colruytgroup.restcrm.domain.Company;
import com.colruytgroup.restcrm.domain.Contact;

public interface ContactService {
    void createNewContact(String name, String email, String phone);
    void connectToCompany(Long id, Company company);
    void disconnectFromCompany(Long id);
    void disconnectFromCompany(String name);
    Contact fetchById(Long id);
}
