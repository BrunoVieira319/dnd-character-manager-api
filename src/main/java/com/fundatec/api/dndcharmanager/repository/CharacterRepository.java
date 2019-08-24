package com.fundatec.api.dndcharmanager.repository;

import com.fundatec.api.dndcharmanager.domain.PlayerCharacter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<PlayerCharacter, String> {
}
