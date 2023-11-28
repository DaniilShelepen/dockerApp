package com.daniil.study.dockerapp.services;

import com.daniil.study.dockerapp.dto.ClientDto;
import com.daniil.study.dockerapp.dto.CompanyDto;

import java.util.List;

public interface UserService {
    void createClient(String name, String surname, String companyName);

    void createCompany(String name);

    List<CompanyDto> getCompanys();

    List<ClientDto> getClients();
}
