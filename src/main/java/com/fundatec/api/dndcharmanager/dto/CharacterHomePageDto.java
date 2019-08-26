package com.fundatec.api.dndcharmanager.dto;

import lombok.Data;

@Data
public class CharacterHomePageDto {

    private String id;
    private String characterName;
    private String race;
    private String characterClass;
    private int level;

}
