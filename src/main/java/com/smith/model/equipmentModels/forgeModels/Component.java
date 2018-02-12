package com.smith.model.equipmentModels.forgeModels;

import java.util.Map;

public class Component extends Material{

    Double level;
    Map<Reagent, Double> reagentsQuantityMap;

    public Component(String componentName, String componentDescription, Double componentLevel, Double componentValue, Map<Reagent, Double> reagentsQuantity) {
        super(componentName,componentDescription,componentValue);
        this.level = componentLevel;
        this.reagentsQuantityMap = reagentsQuantity;
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(final Double level) {
        this.level = level;
    }

    public Map<Reagent, Double> getReagentsQuantityMap() {
        return reagentsQuantityMap;
    }

    public void setReagentsQuantityMap(final Map<Reagent, Double> reagentsQuantityMap) {
        this.reagentsQuantityMap = reagentsQuantityMap;
    }

}
