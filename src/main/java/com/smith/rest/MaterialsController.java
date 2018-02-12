package com.smith.rest;

import com.smith.model.equipmentModels.forgeModels.Material;
import com.smith.dtoInterfaces.MaterialsServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;


@RestController
public class MaterialsController{

    @Qualifier(value = "materialService")
    @Autowired
    private MaterialsServiceInterface materialsServiceInterface;


    @RequestMapping(path = "/api/materials", method = RequestMethod.GET, produces = "application/json")
    public List<Material> getAllMaterials() {
        return materialsServiceInterface.getAllMaterials();
    }

    @ResponseBody
    @RequestMapping(path = "/api/materials/name/{reagentName}", method = RequestMethod.GET, produces = "application/json")
    public CompletableFuture<ResponseEntity> getMaterialByName(@PathVariable final String reagentName) {

        return CompletableFuture.supplyAsync(()->{

            final Optional<Material> optional = materialsServiceInterface.getMaterialByName(reagentName);
            if (!optional.isPresent())
            {
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity( optional.get(), HttpStatus.OK);
            }

        });
    }

    @ResponseBody
    @RequestMapping(path = "/api/materials/id/{reagentId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getMaterialById(@PathVariable final int reagentId) {
        final Optional<Material> optional = materialsServiceInterface.getMaterialById(reagentId);
        if (!optional.isPresent())
        {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity(optional.get(), HttpStatus.OK);
        }
    }

}
