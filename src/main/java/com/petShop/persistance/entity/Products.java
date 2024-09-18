package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="productos")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProducto")
    private Integer id;

    @Column(name = "nombres")
    private String firstName;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "precio")
    private String price;

    @Column(name = "stock")
    private String stocks;

    @ManyToOne
    @JoinColumn(name = "proveedorId") // Debe coincidir con el nombre de la columna en la tabla
    private Suppliers supplier;
}
