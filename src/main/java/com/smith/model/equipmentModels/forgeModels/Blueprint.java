package com.smith.model.equipmentModels.forgeModels;

import java.util.Map;

public class Blueprint extends Material {

    private Map<Component, Double> componentList;
    private Double level;

    public Blueprint(final String materialName, final String materialDescription, final Double materialValue, Double blueprintLevel) {
        super(materialName, materialDescription, materialValue);
        this.level = blueprintLevel;
    }
    public Double getLevel(){
        return this.level;
    }

    public Map<Component, Double> getComponentList() {
        return componentList;
    }

    public void setComponentList(Map<Component, Double> componentList) {
        this.componentList = componentList;
    }
}