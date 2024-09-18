package com.petShop.persistance.mapper;


import com.petShop.domain.OwnerDomain;
import com.petShop.persistance.entity.Owner;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OwnerMapper {
    @Mappings({
            @Mapping(source = "idOwner", target = "id"),
            @Mapping(source = "firstNameOwner", target = "firstName"),
            @Mapping(source = "lastNameOwner", target = "lastName"),
            @Mapping(source = "emailOwner", target = "email"),
            @Mapping(source = "phoneOwner", target = "phone"),
            @Mapping(source = "addressOwner", target = "address"),

    })

    OwnerDomain toOwner(Owner owner);
    List<OwnerDomain> toOwner(List<Owner> owners);

}
