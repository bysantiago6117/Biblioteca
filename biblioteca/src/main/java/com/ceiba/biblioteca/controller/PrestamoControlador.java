package com.ceiba.biblioteca.controller;


import com.ceiba.biblioteca.modelo.Prestamo;
import com.ceiba.biblioteca.servicios.IPrestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("prestamo")
public class PrestamoControlador {

    @Autowired
    private IPrestamo pr;

    @PostMapping
    public ResponseEntity<?> Crear_prestamo(@RequestBody Prestamo pre){
        PrestamoResponseError error = new PrestamoResponseError(String.format("El usuario con identificación %s ya tiene un libro prestado por lo cual no se le puede realizar otro préstamo",pre.getIdentificacionUsuario()));
        Optional<Prestamo> prestamo = pr.CrearPrestamo(pre);
        if (prestamo.isPresent()) {
            return new ResponseEntity<>(prestamo.get(), HttpStatus.OK);
        }
        else {
            if(!pr.isComprobar(pre)){
                return new ResponseEntity<>("{mensaje: 'Tipo de usuario no permitido en la biblioteca'}", HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<?> BuscarPrestamo(@PathVariable("id") Long id){
            Prestamo resourceById = pr.Prestamobyid(id);
            PrestamoResponse prestamoResponse = PrestamoResponse.buildPrestamoResponse(resourceById);
            return new ResponseEntity<>(prestamoResponse, HttpStatus.OK) ;
    }
}



