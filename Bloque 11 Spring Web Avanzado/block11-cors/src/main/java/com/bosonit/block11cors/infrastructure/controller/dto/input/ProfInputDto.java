package com.bosonit.block11cors.infrastructure.controller.dto.input;

import lombok.Data;

@Data

public class ProfInputDto {
    private int id;
    private String comments;
    private String branch;
    private PersonInputDto person;

}
