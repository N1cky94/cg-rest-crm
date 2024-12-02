package com.colruytgroup.restcrm.domain;

import jakarta.persistence.*;
import lombok.*;

import static java.util.Objects.isNull;

@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
@Table(name = "People")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "contact_name", unique = true)
    private String name;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private ContactStatus status;
    @ManyToOne
    private Company currentCompany;

    public Contact(String name, String email, String phone, ContactStatus status) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    public Contact(String name, String email, String phone, ContactStatus status, Company currentCompany) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.currentCompany = currentCompany;
    }

    public void connectToCompany(Company company) {
        if (! isNull(currentCompany)) {
            throw new RuntimeException("Can't connect company to contact, as there is already a company connected.");
        }

        currentCompany = company;
    }

    public void removeFromCompany() {
        currentCompany = null;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", currentCompany=" + currentCompany +
                '}';
    }


}
