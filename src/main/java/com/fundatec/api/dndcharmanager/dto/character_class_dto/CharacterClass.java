
package com.fundatec.api.dndcharmanager.dto.character_class_dto;

import java.util.List;

public class CharacterClass {

    private String _id;
    private ClassLevels classLevels;
    private Long hitDie;
    private Long index;
    private String name;
    private List<Proficiency> proficiencies;
    private List<ProficiencyChoice> proficiencyChoices;
    private List<SavingThrow> savingThrows;
    private StartingEquipment startingEquipment;
    private List<Subclass> subclasses;
    private String url;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public ClassLevels getClassLevels() {
        return classLevels;
    }

    public void setClassLevels(ClassLevels classLevels) {
        this.classLevels = classLevels;
    }

    public Long getHitDie() {
        return hitDie;
    }

    public void setHitDie(Long hitDie) {
        this.hitDie = hitDie;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Proficiency> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(List<Proficiency> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public List<ProficiencyChoice> getProficiencyChoices() {
        return proficiencyChoices;
    }

    public void setProficiencyChoices(List<ProficiencyChoice> proficiencyChoices) {
        this.proficiencyChoices = proficiencyChoices;
    }

    public List<SavingThrow> getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(List<SavingThrow> savingThrows) {
        this.savingThrows = savingThrows;
    }

    public StartingEquipment getStartingEquipment() {
        return startingEquipment;
    }

    public void setStartingEquipment(StartingEquipment startingEquipment) {
        this.startingEquipment = startingEquipment;
    }

    public List<Subclass> getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(List<Subclass> subclasses) {
        this.subclasses = subclasses;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
