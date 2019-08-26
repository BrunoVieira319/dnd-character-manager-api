package com.fundatec.api.dndcharmanager.dto.skills_dto;

import lombok.Data;

import java.util.List;

@Data
public class SkillsFromDndApiDto {

    private int count;
    private List<Results> results;

}
