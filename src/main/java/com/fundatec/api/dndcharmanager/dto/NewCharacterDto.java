package com.fundatec.api.dndcharmanager.dto;

import lombok.Data;

import java.util.List;

@Data
public class NewCharacterDto {

    private String characterName;
    private String classUrl;
    private String raceUrl;
    private List<AttributeDto> attributes;
    private List<SkillDto> skills;

}
