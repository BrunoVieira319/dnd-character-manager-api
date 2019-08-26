
package com.fundatec.api.dndcharmanager.dto.character_class_dto;

import com.fasterxml.jackson.annotation.JsonSetter;

public class StartingEquipment {

    @JsonSetter("class")
    private String characterClass;
    private String url;

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
