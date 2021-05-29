package com.ceiba.crudpersona.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DtoPersona {

    private String nombre;
    private String apellido;
    private String Identificacion;
    private String sexo;
}
