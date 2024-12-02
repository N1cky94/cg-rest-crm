package com.colruytgroup.restcrm.services;

import com.colruytgroup.restcrm.domain.Company;
import com.colruytgroup.restcrm.domain.Contact;
import com.colruytgroup.restcrm.domain.ContactStatus;
import com.colruytgroup.restcrm.repositories.CompanyRepository;
import com.colruytgroup.restcrm.repositories.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactPostgreSqlService implements ContactService {
    private final ContactRepository repository;
    private final CompanyRepository companyRepo;

    @Override
    public void createNewContact(String name, String email, String phone) {
        Contact newContact = new Contact(name, email, phone, ContactStatus.NEW);
        repository.save(newContact);
    }

    @Override
    public void connectToCompany(Long id, Company company) {
        Optional<Contact> optionalContact = repository.findById(id);
        Contact contact = optionalContact.orElseThrow(RuntimeException::new);

        companyRepo.save(company);
        contact.connectToCompany(company);

        repository.save(contact);

    }

    @Override
    public void disconnectFromCompany(Long id) {
        Contact contact = repository.findById(id).orElseThrow(RuntimeException::new);

        contact.removeFromCompany();

        repository.save(contact);
    }

    @Override
    public void disconnectFromCompany(String name) {
        Contact contact = repository.findByNameContaining(name).getFirst();

        contact.removeFromCompany();

        repository.save(contact);
    }

    @Override
    public Contact fetchById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
