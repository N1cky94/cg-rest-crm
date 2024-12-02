package com.colruytgroup.restcrm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@Entity
public class Company {
    @Id private Long id;
    @Setter private String name;
    @Setter private String address;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
