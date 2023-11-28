package com.daniil.study.dockerapp.controller;

import com.daniil.study.dockerapp.dto.ClientDto;
import com.daniil.study.dockerapp.dto.CompanyDto;
import com.daniil.study.dockerapp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("client")
    void createClient(@RequestParam String name, @RequestParam String surname,
                      @RequestParam String companyName) {
        userService.createClient(name, surname, companyName);

    }

    @PostMapping("company")
    void createCompany(@RequestParam String companyName) {
        userService.createCompany(companyName);
    }

    @GetMapping("getCompany")
    List<CompanyDto> get() {
        return userService.getCompanys();
    }

    @GetMapping("getClient")
    List<ClientDto> getCl() {
        return userService.getClients();
    }
}
