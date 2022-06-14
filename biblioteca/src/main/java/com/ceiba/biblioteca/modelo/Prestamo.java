package com.ceiba.biblioteca.modelo;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Entity
@Table( name = "prestamo")
public class Prestamo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String isbn;

    @Column
    private String IdentificacionUsuario;

    @Column
    private LocalDate fechaMaximaDevolucion;

    @Column
    private int tipoUsuario;


    public Prestamo(Long id,String isbn,String identificacionUsuario, int tipoUsuario, LocalDate fechaMaximaDevolucion) {
        this.id = id;
        this.isbn = isbn;
        this.IdentificacionUsuario = identificacionUsuario;
        this.tipoUsuario = tipoUsuario;
        this.fechaMaximaDevolucion = fechaMaximaDevolucion;

    }

    public Prestamo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        IdentificacionUsuario = identificacionUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public LocalDate getFechaMaximaDevolucion() {
        return fechaMaximaDevolucion;
    }

    public void setFechaMaximaDevolucion(LocalDate fechaMaximaDevolucion) {
        this.fechaMaximaDevolucion = fechaMaximaDevolucion;
    }
}
