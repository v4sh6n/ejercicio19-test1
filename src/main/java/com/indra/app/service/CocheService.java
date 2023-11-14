package com.indra.app.service;

import com.indra.app.models.entity.Coche;

import java.util.List;
import java.util.Optional;
//Interfaz que define las operaciones que debe proporcionar un servicio de Coches
public interface CocheService {
	
	// Obtener todos los coches
    List<Coche> obtenerTodosLosCoches();
    
    // Obtener un coche por su identificador
    Optional<Coche> obtenerCochePorId(Long id);
    
    // Guardar un nuevo coche
    void guardarCoche(Coche coche);
    
    // Eliminar un coche por su identificador
    void eliminarCoche(Long id);
}


/*
 * Interfaz
 * define un conjunto de métodos que deben ser implementados por cualquier clase 
 * que quiera ser considerada una rueda en este contexto. El uso de interfaces en Java 
 * proporciona un mecanismo para definir un contrato común que varias clases pueden cumplir, 
 * permitiendo la creación de código más modular y flexible
 * 
 * 
 * 
 * 
 * 
 */