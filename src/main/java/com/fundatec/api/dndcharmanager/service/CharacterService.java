package com.fundatec.api.dndcharmanager.service;

import com.fundatec.api.dndcharmanager.domain.PlayerCharacter;
import com.fundatec.api.dndcharmanager.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public boolean save(PlayerCharacter character) {
        characterRepository.save(character);
        return true;
    }

    public List<PlayerCharacter> findAll() {
        return characterRepository.findAll();
    }
}
