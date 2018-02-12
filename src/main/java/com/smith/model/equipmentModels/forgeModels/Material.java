package com.smith.model.equipmentModels.forgeModels;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Material {
    private final static AtomicInteger lastId = new AtomicInteger(0);
    private final int id;
    private final String name;
    private final String desc;
    private final Double value;

    public Material(final String materialName, final String materialDescription, final Double materialValue)
    {
        id = lastId.incrementAndGet();
        this.name = materialName;
        this.desc = materialDescription;
        this.value = materialValue;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Double getValue() {
        return this.value;
    }

    public int getId() {
        return this.id;
    }

}
