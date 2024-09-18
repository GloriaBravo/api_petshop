package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

// mascotas//

@Entity
@Data
@Table (name = "pet")

public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String firstName;
    @Column(name = "tipo")
    private String type;
    @Column(name = "edad")
    private int age;
    @Column(name = "genero")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "Id_owner", nullable = false)
    private Owner owner;

}