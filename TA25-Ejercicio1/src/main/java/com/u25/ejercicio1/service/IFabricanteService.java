package com.u25.ejercicio1.service;

import java.util.List;

import com.u25.ejercicio1.dto.Fabricante;

public interface IFabricanteService {

			public List<Fabricante> listarFabricantes(); 
			
			public Fabricante guardarFabricante(Fabricante fabricante);	
			
			public Fabricante fabricanteXID(int codigo); 
			
			public Fabricante actualizarFabricante(Fabricante fabricante); 
			
			public void eliminarFabricante(int codigo);
}
