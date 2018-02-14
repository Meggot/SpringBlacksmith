CREATE TABLE Material(
   pk_material_id INTEGER IDENTITY PRIMARY KEY,
   name varchar(10) DEFAULT NULL,
   description varchar(255) DEFAULT NULL,
   value INTEGER
)
CREATE TABLE Reagent(
  fk_material_id INTEGER UNIQUE FOREIGN KEY REFERENCES Material(pk_material_id)
);