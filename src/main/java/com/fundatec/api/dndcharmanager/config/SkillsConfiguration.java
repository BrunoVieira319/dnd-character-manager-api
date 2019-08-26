package com.fundatec.api.dndcharmanager.config;

import com.fundatec.api.dndcharmanager.dto.skills_dto.SingleSkillFromDndApiDto;
import com.fundatec.api.dndcharmanager.dto.skills_dto.SkillsFromDndApiDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SkillsConfiguration {

    @Bean
    public List<SingleSkillFromDndApiDto> skills() {
        RestTemplate restTemplate = new RestTemplate();
        SkillsFromDndApiDto skills = restTemplate.getForObject("http://dnd5eapi.co/api/skills", SkillsFromDndApiDto.class);
        List<SingleSkillFromDndApiDto> skillsFromApi = new ArrayList<>();
        skills.getResults().forEach(result -> {
            SingleSkillFromDndApiDto skill = restTemplate.getForObject(result.getUrl(), SingleSkillFromDndApiDto.class);
            skillsFromApi.add(skill);
        });
        return skillsFromApi;
    }
}
