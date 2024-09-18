package com.petShop.domain;

import com.petShop.persistance.entity.Owner;
import lombok.Data;

@Data
public class PetDomain {
    private Integer idPet;
    private String firstNamePet;
    private String typePet;
    private int agePet;
    private String genderPet;
    private OwnerDomain ownerDomain;
}
