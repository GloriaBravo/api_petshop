package com.petShop.domain.dto;


import lombok.Data;

// sirve para guardar datos //
@Data
public class PetDTO {
    private Integer idPet;
    private String firstNamePet;
    private String typePet;
    private int agePet;
    private String genderPet;
    private Integer ownerIdPet;
}

