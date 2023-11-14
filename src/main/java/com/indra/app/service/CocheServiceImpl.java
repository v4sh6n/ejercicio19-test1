package com.indra.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.app.models.dao.CocheRepository;
import com.indra.app.models.entity.Coche;

import java.util.List;
import java.util.Optional;

//Implementación concreta de la interfaz CocheService

@Service //Anotación de Spring que indica que esta clase es un componente de servicio.
public class CocheServiceImpl implements CocheService {
	
    @Autowired //Anotación de Spring que inyecta automáticamente la dependencia (CocheRepository) en la clase.
    private CocheRepository cocheRepository;

    // Implementación de obtenerTodosLosCoches
    public List<Coche> obtenerTodosLosCoches() {
        return cocheRepository.findAll();
    }

    // Implementación de obtenerCochePorId
    public Optional<Coche> obtenerCochePorId(Long id) {
        return cocheRepository.findById(id);
    }

    // Implementación de guardarCoche
    public void guardarCoche(Coche coche) {
        cocheRepository.save(coche);
    }
    
    // Implementación de eliminarCoche
    public void eliminarCoche(Long id) {
        cocheRepository.deleteById(id);
    }
}

/* Capa de Servicio (Service):
 * La clase CocheServiceImpl es un componente de servicio con la anotación @Service.
 * Utiliza la inyección de dependencias para acceder a un CocheRepository.
 * Proporciona métodos para operaciones lógicas relacionadas con coches
 * 
 * La implementación de CocheServiceImpl proporciona la lógica concreta 
 * para las operaciones definidas en CocheService. Aquí, estamos utilizando
 *  CocheRepository para interactuar con la base de datos.
 * 
 * La capa de servicio contiene la lógica de negocio de la aplicación. 
 * Aquí, definimos interfaces como CocheService y sus implementaciones, 
 * como CocheServiceImpl (en el paquete com.indra.app.models.service). 
 * Los servicios se encargan de realizar operaciones específicas
 *  relacionadas con los coches, como obtener todos los coches, 
 *  obtener un coche por su ID, guardar un nuevo coche y eliminar un coche.
 * 
 * 
 */