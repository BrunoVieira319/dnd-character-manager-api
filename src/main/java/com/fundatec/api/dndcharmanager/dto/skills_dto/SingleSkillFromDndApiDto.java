package com.fundatec.api.dndcharmanager.dto.skills_dto;

import lombok.Data;

import java.util.List;

@Data
public class SingleSkillFromDndApiDto {

    private String _id;
    private int index;
    private String name;
    private List<String> desc;
    private AbilityScore ability_score;
    private String url;

}
