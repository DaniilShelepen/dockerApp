package com.daniil.study.dockerapp.dal.repository;

import com.daniil.study.dockerapp.dal.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Long> {

}
