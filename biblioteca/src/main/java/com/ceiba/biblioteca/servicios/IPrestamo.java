package com.ceiba.biblioteca.servicios;

import com.ceiba.biblioteca.modelo.Prestamo;

import java.util.List;
import java.util.Optional;

public interface IPrestamo {
    Optional<Prestamo> CrearPrestamo(Prestamo pr);
    Prestamo Prestamobyid(Long id);
    boolean isComprobar(Prestamo pr);
}
