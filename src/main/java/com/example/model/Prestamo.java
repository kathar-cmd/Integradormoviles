package com.example.model;

import java.time.LocalDate;

public class Prestamo {
    private String idPrestamo;
    private String idUsuario;
    private String idLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private int cantidadLibros;

    public Prestamo() {
        this.fechaPrestamo = LocalDate.now();
    }

    public Prestamo(String idPrestamo, String idUsuario, String idLibro, LocalDate fechaPrestamo,
            LocalDate fechaEntrega, int cantidadLibros) {
        this.idPrestamo = idPrestamo;
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.fechaPrestamo = fechaPrestamo != null ? fechaPrestamo : LocalDate.now();
        this.fechaEntrega = fechaEntrega;
        this.cantidadLibros = cantidadLibros;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }
}
