package com.smith.model.mapObjects;

public class Interactable extends Location {

    private String name;
    private String desc;

    public Interactable(String interacableName, String interactableDesc, Zone interactableZone, Double interactableXCord, Double interactableYCord) {
        super(interactableXCord, interactableYCord, interactableZone);
        this.name = interacableName;
        this.desc = interactableDesc;
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

    @Override
    public String toString() {
        return "Interactable{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
