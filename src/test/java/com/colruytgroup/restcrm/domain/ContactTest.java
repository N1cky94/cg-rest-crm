package com.colruytgroup.restcrm.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("unit-tests")
class ContactTest {

    @Test
    @DisplayName("Given a contact without a company, when trying to connect a company to the contact, than the company should be connect correctly")
    void connectCompanyToContact_HappyFlow() {
        //Arrange
        Company cg = new Company("Colruyt Group", "Eddingensesteenweg 196, Halle");
        Contact lander = new Contact("Lander", "lander@cg.com", "0465748377", null);

        //Act
        lander.connectToCompany(cg);

        //Assert
        Company result = lander.getCurrentCompany();
        assertNotNull(result, "Expected a company object, got no company returned");
        assertEquals(cg.getName(), result.getName());
        assertEquals(cg.getAddress(), result.getAddress());

    }

    @Test
    void connectCompanyToContactWhenContactIsAlreadyConnected_UnhappyFlow() {
        // Arrange
        Company cg = new Company("Colruyt Group", "Eddingensesteenweg 196, Halle");
        Company arc = new Company("Archilios", "Eddingensesteenweg 196, Halle");
        Contact lander = new Contact("Lander", "lander@cg.com", "0465748377", ContactStatus.NEW , cg);

        // Act - Assert
        assertThrows(RuntimeException.class, () -> lander.connectToCompany(arc));
        assertEquals(cg.getName(), lander.getCurrentCompany().getName());

    }

    @Test
    void disconnectCompanyFromContact_HappyPath() {
        Company cg = new Company("Colruyt Group", "Eddingensesteenweg 196, Halle");
        Contact lander = new Contact("Lander", "lander@cg.com", "0465748377", ContactStatus.NEW , cg);

        lander.removeFromCompany();

        assertNull(lander.getCurrentCompany(), "Expected to have no company connected");
    }

}