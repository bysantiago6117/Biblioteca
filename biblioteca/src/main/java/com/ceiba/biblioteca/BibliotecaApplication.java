package com.ceiba.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages={
		"com.ceiba.biblioteca.controller", "com.ceiba.biblioteca.modelo","com.ceiba.biblioteca.servicios","com.ceiba.biblioteca.Repositorio"})
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

}
