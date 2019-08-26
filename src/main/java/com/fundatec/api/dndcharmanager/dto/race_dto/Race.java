
package com.fundatec.api.dndcharmanager.dto.race_dto;

import java.util.List;

public class Race {

    private String _id;
    private List<Long> abilityBonuses;
    private String age;
    private String alignment;
    private Long index;
    private String languageDesc;
    private List<Language> languages;
    private String name;
    private String size;
    private String sizeDescription;
    private Long speed;
    private List<StartingProficiency> startingProficiencies;
    private StartingProficiencyOptions startingProficiencyOptions;
    private List<Subrace> subraces;
    private List<Trait> traits;
    private String url;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public List<Long> getAbilityBonuses() {
        return abilityBonuses;
    }

    public void setAbilityBonuses(List<Long> abilityBonuses) {
        this.abilityBonuses = abilityBonuses;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public String getLanguageDesc() {
        return languageDesc;
    }

    public void setLanguageDesc(String languageDesc) {
        this.languageDesc = languageDesc;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeDescription() {
        return sizeDescription;
    }

    public void setSizeDescription(String sizeDescription) {
        this.sizeDescription = sizeDescription;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public List<StartingProficiency> getStartingProficiencies() {
        return startingProficiencies;
    }

    public void setStartingProficiencies(List<StartingProficiency> startingProficiencies) {
        this.startingProficiencies = startingProficiencies;
    }

    public StartingProficiencyOptions getStartingProficiencyOptions() {
        return startingProficiencyOptions;
    }

    public void setStartingProficiencyOptions(StartingProficiencyOptions startingProficiencyOptions) {
        this.startingProficiencyOptions = startingProficiencyOptions;
    }

    public List<Subrace> getSubraces() {
        return subraces;
    }

    public void setSubraces(List<Subrace> subraces) {
        this.subraces = subraces;
    }

    public List<Trait> getTraits() {
        return traits;
    }

    public void setTraits(List<Trait> traits) {
        this.traits = traits;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
