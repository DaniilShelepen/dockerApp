package com.daniil.study.dockerapp.dal.repository;

import com.daniil.study.dockerapp.dal.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company, Long> {

    Company findByName(String name);

}
