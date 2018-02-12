package com.smith.model.playerModels;

public class Stat {

    private StatType type;

    public Stat(StatType statType) {
        this.type = statType;
    }

    public StatType getType() {
        return type;
    }

}
