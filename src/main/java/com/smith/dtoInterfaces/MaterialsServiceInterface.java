package com.smith.dtoInterfaces;

import com.smith.model.equipmentModels.forgeModels.Material;

import java.util.List;
import java.util.Optional;

public interface MaterialsServiceInterface {

     List<Material> getAllMaterials();
     Optional<Material> getMaterialById(int materialId);
     Optional<Material> getMaterialByName(String materialName);
}
