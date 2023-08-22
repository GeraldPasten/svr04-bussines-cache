package com.mx.banorte.services.protostream;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;
import com.mx.banorte.services.model.Person;
import com.mx.banorte.services.model.Pet;
import com.mx.banorte.services.model.Vet;

@AutoProtoSchemaBuilder(
    includeClasses = {
        //AnimalSpecies.class,
        Person.class,
        Pet.class,
        Vet.class
    },
    schemaFileName = "pets.proto",
    schemaFilePath = "proto/",
    schemaPackageName = "pets"
)

public interface PetSchemaBuilder extends GeneratedSchema{

}