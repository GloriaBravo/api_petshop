package com.petShop.persistance.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import static jakarta.persistence.GenerationType.*;

//ventas//

@Entity
@Data
@Table(name = "Ventas")

public class Sales {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "IdVenta")
    private Integer id;
    @Column(name = "Fecha", nullable = false)
    private Date date;
    private Employee employer;
    @Column(name = "Total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "IdCliente")
    private Owner cliente;
    @ManyToOne
    @JoinColumn(name = "IdEmpleado")
    private Employee empleado;
}