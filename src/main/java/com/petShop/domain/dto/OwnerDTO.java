package com.petShop.domain.dto;


import lombok.Data;

@Data
public class OwnerDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}
