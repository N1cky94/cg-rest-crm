package com.colruytgroup.restcrm.repositories;

import com.colruytgroup.restcrm.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
