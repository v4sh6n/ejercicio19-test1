package com.indra.app.models.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.app.models.entity.Coche;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
    // Se pueden agregar métodos personalizados si es necesario
}


/* Capa de Acceso a Datos (DAO/Repository):
 * En esta capa, gestionamos el acceso a la base de datos. 
 * Utilizamos Spring Data JPA y definimos la interfaz CocheRepository 
 * que extiende JpaRepository
 * "Data Access Object" DAO
 * Clase de persistencia que se encarga de acceder a los datos
 * 
 * La anotación Repository marca la clase como componente de persistencia
 * de acceso a datos
 * 
 * La interfaz CocheRepository extiende JpaRepository de Spring Data JPA 
 * y proporciona métodos para realizar operaciones CRUD en la base de datos 
 * para la entidad Coche
 * 
 * 
 * 
 * 
 * 
 */