package com.colruytgroup.restcrm.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

import static java.util.Objects.isNull;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Contact {
    private String name;
    private String email;
    private String phone;
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
