package com.u25.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.u25.ejercicio1.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

}
