package com.example.model;

public class Contacto {
    private String idcontacto;
    private String correo;
    private String telefono;
    private String direccion;

    public Contacto(String idcontacto, String correo, String telefono, String direccion) {
        this.idcontacto = idcontacto;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getIdcontacto() {
        return idcontacto;
    }
    public void setIdcontacto(String idcontacto) {
        this.idcontacto = idcontacto;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



}
