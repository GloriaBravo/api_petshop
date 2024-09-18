package com.petShop.persistance.mapper; // Se asume un nombre de paquete consistente

import com.petShop.domain.PetDomain;
import com.petShop.persistance.entity.Pet;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring", uses = {OwnerMapper.class})
public interface PetMapper {
    @Mappings({
            @Mapping(source = "idPet", target = "id"),
            @Mapping(source = "firstNamePet", target = "firstName"),
            @Mapping(source = "typePet", target = "type"),
            @Mapping(source = "agePet", target = "age"),
            @Mapping(source = "genderPet", target = "gender"),
            @Mapping(source = "OwnerDomainPet", target = "Owner"),
    })
    PetDomain toPet (Pet Pet);
    List<PetDomain> toPet(List<Pet> pets);


}