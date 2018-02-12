package com.smith.model.equipmentModels.forgeModels;

import javax.persistence.Entity;

@Entity
public class Reagent extends Material{

    public Reagent(String reagentName, String reagentDescription, Double reagentValue) {
        super(reagentName, reagentDescription, reagentValue);
    }
}
