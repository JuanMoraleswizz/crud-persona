package com.ceiba.crudpersona.dominio.modelo;

public class Persona {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String noDocumento;

    public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String noDocumento ){
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.noDocumento = noDocumento;
    }
}
