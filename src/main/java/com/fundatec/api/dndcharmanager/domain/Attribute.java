package com.fundatec.api.dndcharmanager.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attribute {

    private String name;
    private String abbreviationName;
    private int value;
    private int modifier;

}
