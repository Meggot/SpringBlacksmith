package com.smith.entityUtils;

import com.smith.model.playerModels.SlotPlace;

import java.util.ArrayList;
import java.util.List;

public class EntityEquipmentUtils {


    public static List<SlotPlace> getGenericSlots() {
        return new ArrayList<SlotPlace>() {{
            //Armor Slots
            add(SlotPlace.Belt);
            add(SlotPlace.Shoulders);
            add(SlotPlace.Head);
            add(SlotPlace.Bracers);
            add(SlotPlace.Cape);
            add(SlotPlace.Chest);
            add(SlotPlace.Gloves);
            add(SlotPlace.Legpiece);
            //Weapons
            add(SlotPlace.Mainhand);
            add(SlotPlace.Offhand);
            //Rings and Trinkets
            add(SlotPlace.Ring1);
            add(SlotPlace.Ring2);
            add(SlotPlace.Trinket1);
            add(SlotPlace.Trinket2);
        }};
    }

}
