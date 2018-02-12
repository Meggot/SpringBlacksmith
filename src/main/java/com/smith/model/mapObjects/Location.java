package com.smith.model.mapObjects;

public class Location {

    private Double xCord;
    private Double yCord;
    private Zone zone;

    public Location(final Double locationXCord, final Double locationYCord, final Zone locationZone) {
        this.xCord = locationXCord;
        this.yCord = locationYCord;
        this.zone = locationZone;
    }

    public Double getxCord() {
        return xCord;
    }

    public void setxCord(final Double xCord) {
        this.xCord = xCord;
    }

    public Double getyCord() {
        return yCord;
    }

    public void setyCord(final Double yCord) {
        this.yCord = yCord;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(final Zone zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Location{" +
                "xCord=" + xCord +
                ", yCord=" + yCord +
                ", zone=" + zone +
                '}';
    }
}
