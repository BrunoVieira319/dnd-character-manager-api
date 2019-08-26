package com.fundatec.api.dndcharmanager.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Getter
@Setter
public class PlayerCharacter {

    @Id
    private String id;
    private String characterName;
    private String characterClass;
    private String race;
    private String classUrl;
    private String raceUrl;
    private String image;
    private List<Attribute> attributes;
    private List<Skill> skills;
    private int level;
    private int proficiencyBonus;

    public PlayerCharacter() {
        this.attributes = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.level = 1;
        this.proficiencyBonus = 2;
        this.image = "https://i.pinimg.com/originals/94/23/79/942379f620f5dde322a35fe2eb834830.jpg";
    }

}
