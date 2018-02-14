INSERT INTO Material (pk_material_id, name, description, value)
VALUES (1, 'ORE', 'Ore is ores', 10);

INSERT INTO Reagent (fk_material_id)
VALUES (1);