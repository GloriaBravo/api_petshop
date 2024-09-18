package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

//Proveedores//

@Entity
@Data
@Table(name="proveedores")

public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProveedor")
    private Integer id;
    @Column(name = "nombres")
    private String firstName;
    @Column(name = "celular")
    private String phone;
    @Column(name = "correo")
    private String email;
    @Column(name = "direccion")
    private String address;
}
