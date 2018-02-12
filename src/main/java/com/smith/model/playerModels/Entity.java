package com.smith.model.playerModels;

import com.smith.model.equipmentModels.playerEquipment.Equippable;
import com.smith.entityUtils.EntityEquipmentUtils;
import com.smith.entityUtils.EntityStatUtils;

import java.rmi.UnexpectedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entity {

    private String name;
    private String desc;
    private Map<SlotPlace, Equippable> equipped;
    private Map<Stat, Double> stats;

    public Entity(String entityName, String entityDesc) {
        this.name = entityName;
        this.desc = entityDesc;
        equipped = new HashMap<SlotPlace, Equippable>();
        stats = new HashMap<Stat, Double>();
        List<SlotPlace> slotPlaces = EntityEquipmentUtils.getGenericSlots();
        for (SlotPlace slotPlace : slotPlaces)
        {
            equipped.put(slotPlace, null);
        }
        List<StatType> statTypes = EntityStatUtils.getGenericStats();
        for (StatType statType : statTypes) {
            stats.put(new Stat(statType), new Double(0));
        }
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Map<SlotPlace, Equippable> viewEquippedItems() {
        return equipped;
    }

    public void equipPiece(Equippable equippable) throws UnexpectedException {
        List<SlotPlace> slotPlaces = equippable.getSlots();
        SlotPlace placedSlot = null;
        for (SlotPlace place : slotPlaces) {
            if (equipped.containsKey(place))
            {
                placedSlot = place;
                if (equipped.get(place)==null) {
                    placedSlot = place;
                    break;
                }
             }
        }
        if (placedSlot == null) {
            throw new UnexpectedException("EquippedSlot could not be found regardless of equipment matching algo");
        }
        equipped.put(placedSlot, equippable);
    }
}
