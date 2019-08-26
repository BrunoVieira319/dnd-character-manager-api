
package com.fundatec.api.dndcharmanager.dto.race_dto;

import java.util.List;

public class StartingProficiencyOptions {

    private Long choose;
    private List<From> from;
    private String type;

    public Long getChoose() {
        return choose;
    }

    public void setChoose(Long choose) {
        this.choose = choose;
    }

    public List<From> getFrom() {
        return from;
    }

    public void setFrom(List<From> from) {
        this.from = from;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
