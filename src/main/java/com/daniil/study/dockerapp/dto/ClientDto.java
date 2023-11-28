package com.daniil.study.dockerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public class ClientDto {
    private String name;
    private String surname;

    private String company;
}
