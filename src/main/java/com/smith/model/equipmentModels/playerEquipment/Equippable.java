package com.smith.model.equipmentModels.playerEquipment;

import com.smith.model.playerModels.SlotPlace;
import com.smith.model.playerModels.Stat;

import java.util.List;
import java.util.Map;

public class Equippable {

    private String name;
    private String desc;
    private Map<Stat, Double> statIncrease;
    private List<SlotPlace> slots;

    public Equippable(String equippableName, String equippableDescription, Map<Stat, Double> equippableStatIncreases, List<SlotPlace> equippableSlotPlaces) {
        this.name = equippableName;
        this.desc = equippableDescription;
        this.statIncrease = equippableStatIncreases;
        this.slots = equippableSlotPlaces;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(final String desc) {
        this.desc = desc;
    }

    public Map<Stat, Double> getStatIncrease() {
        return statIncrease;
    }

    public void setStatIncrease(final Map<Stat, Double> statIncrease) {
        this.statIncrease = statIncrease;
    }

    public List<SlotPlace> getSlots() {
        return slots;
    }

    public void setSlots(final List<SlotPlace> slots) {
        this.slots = slots;
    }
}
