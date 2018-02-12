package com.smith.model;

import com.smith.model.equipmentModels.forgeModels.Blueprint;
import com.smith.model.equipmentModels.forgeModels.Material;
import com.smith.model.gameModels.Audit;
import com.smith.model.mapObjects.Interactable;
import com.smith.model.mapObjects.Location;
import com.smith.model.playerItems.craftableItems.forgeCraftable.ForgedItem;

import java.util.*;

public class Forge extends Interactable {

    private final Double level;
    private final Double forgeValue;
    private final Set<Blueprint> blueprintsList;
    private final List<Audit> forgeAudits;
    private Map<Material, Double> forgeMaterialInventory;

    public Forge(final Location forgeLocation,final String forgeName,final String forgeDescription,final Double forgeValue, final Double creationLevel) {
        super(forgeName, forgeDescription, forgeLocation.getZone(), forgeLocation.getxCord(), forgeLocation.getyCord());
        this.level = creationLevel;
        this.forgeValue = forgeValue;
        blueprintsList = new HashSet<Blueprint>();
        forgeAudits = new ArrayList<Audit>();
    }

    public ForgedItem attemptToForge(Blueprint blueprint) {
        throw new UnsupportedOperationException(" not yet implemented");
    }

    public Double getItemlevel() {
        return this.level;
    }

    public void addBlueprint(Blueprint blueprintToAdd) {
        this.blueprintsList.add(blueprintToAdd);
    }

    public Set<Blueprint> listAllBlueprints() {
        return this.blueprintsList;
    }
}
