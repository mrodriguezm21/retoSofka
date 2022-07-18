package com.spaceStation.spaceShip.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Nave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nave")
    private Long idNave;
    private String nombre;
    private String pais;
    private Long potencia;
    private Long altura;
    private Long peso;

    @Column(name = "id_categoria")
    private Long idCategoria;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private CategoriaNave categoriaNave;
}
