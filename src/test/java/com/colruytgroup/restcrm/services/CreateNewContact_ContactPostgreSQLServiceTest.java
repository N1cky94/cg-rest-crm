package com.colruytgroup.restcrm.services;

import com.colruytgroup.restcrm.repositories.ContactRepository;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@Tag("unit-tests")
class CreateNewContact_ContactPostgreSQLServiceTest {
    @Mock
    private ContactRepository repository;

    @Test
    void test() {
        ContactPostgreSqlService service = new ContactPostgreSqlService(repository);

        service.createNewContact("test", "test@test.com", "test00");

        verify(repository).save(any());
    }

    void test2() {

    }

}