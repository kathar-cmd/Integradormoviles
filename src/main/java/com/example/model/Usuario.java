package com.example.model;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private int documento;
    private String rol;
    private String idContacto;
    private String tipoDocumento;

    // Constructor vacío
    public Usuario() {
        this.tipoDocumento = "Cedula";
    }

    // Constructor con todos los parámetros
    public Usuario(String idUsuario, String nombre, int documento, String rol, String idContacto, String tipoDocumento) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.documento = documento;
        this.rol = rol;
        this.idContacto = idContacto;
        this.tipoDocumento = tipoDocumento != null ? tipoDocumento : "Cedula";
    }

    // Getters y Setters
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(String idContacto) {
        this.idContacto = idContacto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
}
