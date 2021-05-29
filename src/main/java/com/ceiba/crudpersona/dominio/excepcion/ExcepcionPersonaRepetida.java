package com.ceiba.crudpersona.dominio.excepcion;

public class ExcepcionPersonaRepetida extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ExcepcionPersonaRepetida(String mensaje){
        super(mensaje);
    }
}
