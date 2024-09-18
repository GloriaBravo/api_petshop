package com.petShop.persistance.entity;


import jakarta.persistence.*;
import lombok.Data;

// Empleado//

@Entity
@Data
@Table(name = "empleado")


public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempleado")
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
    @Column(name = "fecha_contratacion")
    private String hiring_date;
    @Column(name = "salario")
    private Double salary;

}
