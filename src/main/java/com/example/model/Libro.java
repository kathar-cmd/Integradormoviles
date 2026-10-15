package com.example.model;

public class Libro {


    private String idLibro;
    private String nombre;
    private String genero;
    private String seccion;
    private int ejemplares;
    private Integer anioPublicacion;

  
    public Libro(String idLibro, String nombre, String genero,
            String seccion, int ejemplares, Integer anioPublicacion) {
        this.idLibro = idLibro;
        this.nombre = nombre;
        this.genero = genero;
        this.seccion = seccion;
        this.ejemplares = ejemplares;
        this.anioPublicacion = anioPublicacion;
    }


    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getter y Setter de seccion
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro='" + idLibro + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", seccion='" + seccion + '\'' +
                ", ejemplares=" + ejemplares +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}
