package com.fundatec.api.dndcharmanager.controller;

import com.fundatec.api.dndcharmanager.domain.PlayerCharacter;
import com.fundatec.api.dndcharmanager.dto.NewCharacterDto;
import com.fundatec.api.dndcharmanager.service.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/characters")
public class CharacterController {

    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    public ResponseEntity<Boolean> saveCharacter(@RequestBody NewCharacterDto characterDto) {
        boolean save = characterService.save(characterDto);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PlayerCharacter>> getAllCharacter() {
        List<PlayerCharacter> characters = characterService.findAll();
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<PlayerCharacter> getCharacterById(@PathVariable String characterId) {
        PlayerCharacter playerCharacter = characterService.findById(characterId);
        return new ResponseEntity<>(playerCharacter, HttpStatus.OK);
    }

}
