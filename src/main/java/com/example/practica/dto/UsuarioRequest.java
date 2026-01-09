package com.example.practica.dto;

public class UsuarioRequest {
    private String nombre;

    public UsuarioRequest() {

    }

    public UsuarioRequest(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
