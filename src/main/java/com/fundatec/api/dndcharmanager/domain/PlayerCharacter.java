package com.fundatec.api.dndcharmanager.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class PlayerCharacter {

    @Id
    private String id;
    private String nameCharacter;
    private String characterClass;
    private String race;
    private List<Attribute> attributes;
    private List<Skill> skills;
    private int level;

    public PlayerCharacter() {
        this.level = 1;
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public String getRace() {
        return race;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int getLevel() {
        return level;
    }
}
