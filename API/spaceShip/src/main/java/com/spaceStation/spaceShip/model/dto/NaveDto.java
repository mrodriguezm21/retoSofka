package com.spaceStation.spaceShip.model.dto;

import com.spaceStation.spaceShip.model.CategoriaNave;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NaveDto {
    private Long idNave;
    private String nombre;
    private String pais;
    private Long potencia;
    private Long altura;
    private Long peso;
    private Long idCategoria;
    private CategoriaNave categoriaNave;
}
