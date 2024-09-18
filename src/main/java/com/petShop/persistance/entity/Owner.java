package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

//Cliente
@Entity
@Data
@Table(name = "cliente")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private Integer id;
    @Column(name = "nombres")
    private String firstName;
    @Column(name = "apellidos")
    private String lastName;
    @Column(name = "correo")
    private String email;
    @Column(name = "celular")
    private String phone;
    @Column(name = "direccion")
    private String address;

    @OneToMany(mappedBy = "owner")
    private List<Pet> mascotas;

    public void setId(Integer id) {

    }
}