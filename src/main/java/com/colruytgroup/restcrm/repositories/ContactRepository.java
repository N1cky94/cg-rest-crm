package com.colruytgroup.restcrm.repositories;

import com.colruytgroup.restcrm.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByNameContaining(String name);
}
