package com.smith.model.mapObjects;

import java.util.ArrayList;
import java.util.List;

public class Zone {

    final String name;
    final String desc;
    final List<Location> locations;

    public Zone(final String zoneName, final String zoneDesc) {
        this.name = zoneName;
        this.desc = zoneDesc;
        this.locations = new ArrayList<Location>();
    }

        public void addInteractable(Interactable interactableToAddToZone) {
        this.locations.add(interactableToAddToZone);
    }

    public List<Location> getInteractables() {
        return this.locations;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", locations=" + locations +
                '}';
    }
}
