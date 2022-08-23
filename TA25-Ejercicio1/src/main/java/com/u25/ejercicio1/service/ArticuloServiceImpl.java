package com.u25.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.u25.ejercicio1.dao.IArticuloDAO;
import com.u25.ejercicio1.dto.Articulo;

/**
 * ArticuloServicioImpl.java
 *
 */
@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(int codigo) {
		return iArticuloDAO.findById(codigo).get();
	}


	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int codigo) {
		iArticuloDAO.deleteById(codigo);

	}

}
