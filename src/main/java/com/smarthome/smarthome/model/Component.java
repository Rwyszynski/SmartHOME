package com.smarthome.smarthome.model;


import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;


@Getter
@Setter
public class Component {

    private String componentName;
    private String componentType;
    private String componentDescription;
    private BigDecimal componentPrice;
    private String componentPhoto;

    public Component(String componentName, String componentType, String componentDescription, BigDecimal componentPrice, String componentPhoto) {
        this.componentName = componentName;
        this.componentType = componentType;
        this.componentDescription = componentDescription;
        this.componentPrice = componentPrice;
        this.componentPhoto = componentPhoto;
    }
}
