package com.petShop.domain;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class OwnerDomain {
    private Integer idOwner;
    private String firstNameOwner;
    private String lastNameOwner;
    private String emailOwner;
    private String phoneOwner;
    private String addressOwner;
}
