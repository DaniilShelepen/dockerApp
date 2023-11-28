package com.daniil.study.dockerapp.services.impl;

import com.daniil.study.dockerapp.dal.entity.Client;
import com.daniil.study.dockerapp.dal.entity.Company;
import com.daniil.study.dockerapp.dal.repository.ClientRepo;
import com.daniil.study.dockerapp.dal.repository.CompanyRepo;
import com.daniil.study.dockerapp.dto.ClientDto;
import com.daniil.study.dockerapp.dto.CompanyDto;
import com.daniil.study.dockerapp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final ClientRepo clientRepo;

    private final CompanyRepo companyRepo;

    @Override
    public void createClient(String name, String surname, String companyName) {

        clientRepo.save(Client.builder()
                .name(name)
                .surname(surname)
                .company(companyRepo.findByName(companyName))
                .build());

    }

    @Override
    public void createCompany(String name) {
        companyRepo.save(Company.builder()
                .name(name)
                .build());
    }

    @Override
    public List<CompanyDto> getCompanys() {
        return companyRepo.findAll().stream().map(company -> CompanyDto.builder().name(company.getName()).build()).collect(Collectors.toList());
    }

    @Override
    public List<ClientDto> getClients() {
        return clientRepo.findAll().stream().map(client -> ClientDto.builder().name(client.getName())
                .surname(client.getSurname())
                .company(client.getCompany().getName())
                .build()).collect(Collectors.toList());
    }
}
