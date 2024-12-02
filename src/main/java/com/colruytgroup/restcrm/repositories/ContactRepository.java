package com.colruytgroup.restcrm.repositories;

import com.colruytgroup.restcrm.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
