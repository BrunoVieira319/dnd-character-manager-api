package com.fundatec.api.dndcharmanager.service;

import com.fundatec.api.dndcharmanager.domain.Attribute;
import com.fundatec.api.dndcharmanager.domain.PlayerCharacter;
import com.fundatec.api.dndcharmanager.domain.Skill;
import com.fundatec.api.dndcharmanager.dto.AttributeDto;
import com.fundatec.api.dndcharmanager.dto.NewCharacterDto;
import com.fundatec.api.dndcharmanager.dto.SkillDto;
import com.fundatec.api.dndcharmanager.dto.character_class_dto.CharacterClass;
import com.fundatec.api.dndcharmanager.dto.race_dto.Race;
import com.fundatec.api.dndcharmanager.dto.skills_dto.SingleSkillFromDndApiDto;
import com.fundatec.api.dndcharmanager.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;
    private List<SingleSkillFromDndApiDto> skills;
    private RestTemplate restTemplate;

    @Autowired
    public CharacterService(CharacterRepository characterRepository, List<SingleSkillFromDndApiDto> skills) {
        this.characterRepository = characterRepository;
        this.skills = skills;
        this.restTemplate = new RestTemplate();
    }

    public boolean save(NewCharacterDto characterDto) {
        CharacterClass characterClass = restTemplate.getForObject(characterDto.getClassUrl(), CharacterClass.class);
        Race race = restTemplate.getForObject(characterDto.getRaceUrl(), Race.class);

        PlayerCharacter character = new PlayerCharacter();
        character.setCharacterName(characterDto.getCharacterName());
        character.setCharacterClass(characterClass.getName());
        character.setRace(race.getName());
        character.setClassUrl(characterDto.getClassUrl());
        character.setRaceUrl(characterDto.getRaceUrl());
        characterDto.getAttributes().forEach(att ->
                character.getAttributes().add(createAttribute(att))
        );

        List<String> proficientSkills = characterDto.getSkills()
                .stream()
                .filter(SkillDto::isSelected)
                .map(skillDto -> skillDto.getSkillName().substring(7))
                .collect(Collectors.toList());

        skills.forEach(skillDtoFromApi -> {
            Skill skill = new Skill();
            skill.setName(skillDtoFromApi.getName());
            Optional<Attribute> attribute = character.getAttributes()
                    .stream()
                    .filter(a -> a.getAbbreviationName().equals(skillDtoFromApi.getAbility_score().getName()))
                    .findFirst();

            if (proficientSkills.contains(skillDtoFromApi.getName())) {
                skill.setProficient(true);
                skill.setValue(attribute.get().getModifier() + character.getProficiencyBonus());
            } else {
                skill.setValue(attribute.get().getModifier());
            }

            character.getSkills().add(skill);
        });

        characterRepository.save(character);
        return true;
    }

    public List<PlayerCharacter> findAll() {
        return characterRepository.findAll();
    }

    public PlayerCharacter findById(String characterId) {
        return characterRepository.findById(characterId).orElseThrow(IllegalArgumentException::new);
    }

    private Attribute createAttribute(AttributeDto att) {
        Attribute attribute = new Attribute();
        attribute.setName(att.getName());
        attribute.setAbbreviationName(att.getName().substring(0, 3).toUpperCase());
        attribute.setValue(att.getValue());
        if (att.getValue() == 8 || att.getValue() == 9) attribute.setModifier(-1);
        if (att.getValue() == 10 || att.getValue() == 11) attribute.setModifier(0);
        if (att.getValue() == 12 || att.getValue() == 13) attribute.setModifier(1);
        if (att.getValue() == 14 || att.getValue() == 15) attribute.setModifier(2);
        if (att.getValue() == 16 || att.getValue() == 17) attribute.setModifier(3);
        if (att.getValue() == 18 || att.getValue() == 19) attribute.setModifier(4);
        if (att.getValue() == 20 || att.getValue() == 21) attribute.setModifier(5);
        return attribute;
    }
}
