package com.smith.dtoInterfaces;

import com.smith.model.equipmentModels.forgeModels.Blueprint;
import com.smith.model.equipmentModels.forgeModels.Material;
import com.smith.model.equipmentModels.forgeModels.Reagent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Component
public class MaterialService implements MaterialsServiceInterface {

    private List<Material> materials = new CopyOnWriteArrayList<Material>() {{
        add(new Reagent("Copper", "A orange ore which sparkles in the moonlight", 2D));
        add(new Reagent("Iron", "A Iron ore which looks dull in the moonlight", 3D));
        add(new Blueprint("Iron Sword", "A  basic blueprint on how to forge a crude Iron Sword", 4.3D,1D));
    }};

    @Override
    public List<Material> getAllMaterials() {
        return materials;
    }

    @Override
    public Optional<Material> getMaterialById(final int materialId) {
        return materials.stream()
                .filter(material -> material.getId() == materialId)
                .findFirst();
    }

    @Override
    public Optional<Material> getMaterialByName(final String materialName) {
        return materials.stream()
                .filter(material -> material.getName().equalsIgnoreCase(materialName))
                .findFirst();
    }
}
