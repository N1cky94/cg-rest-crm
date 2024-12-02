package com.colruytgroup.restcrm.domain;

import jakarta.persistence.*;
import lombok.*;

import static java.util.Objects.isNull;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
@Table(name = "People")
public class Contact {
    @Id
    private Long id;
    @Column(name = "contact_name")
    private String name;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private ContactStatus status;
    @ManyToOne
    private Company currentCompany;


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
