package com.smith.model.playerModels;

import com.smith.model.equipmentModels.playerEquipment.Equippable;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EntityTest {

    private Entity entityModel;
    private String testName = "Testname";
    private String testDesc = "Testdesc";

    @BeforeEach
    void setUp() {
        entityModel = new Entity(testName, testDesc);
    }

    @Test
    void equipPiece() {
        final List<Equippable> equippableList = entityModel.viewEquippedItems().values().stream()
                .filter(v -> v != null)
                .collect(Collectors.toList());
        assertThat(equippableList).isNull();
    }

}