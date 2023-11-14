package com.indra.app.models.entity;

import jakarta.persistence.*;

@Entity // mapea automaticamente atributos y campos de la clase
@Table(name = "coches") // nomenclatura tablas en miniusculas y terminan el plural asi se diferencia de la clase
public class Coche {
	
	//atributos 
	
	// anotaciones específicas JPA para definir y gestionar PK
    @Id //marca como PK 
    @GeneratedValue(strategy = GenerationType.IDENTITY)//especifica estrategia para generar valores para PK
    private Long id;

    private String marca;
    private String modelo;
    private int anioFabricacion;

    // Getters y Setters
    //para acceder y modificar los atributos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
/* Capa de Persistencia (Entity):
 *  La capa de persistencia contiene las entidades que representan los objetos de 
 *  dominio de la aplicación. 
 *  
 *  Estas entidades se mapean a tablas en la base de datos y contienen los atributos 
 *  y relaciones que queremos persistir.
 *  
 *  
 *  
 *	La clase Coche es una entidad JPA mapeada a una tabla llamada "coches".
 * 	La anotación @Entity indica que la clase es una entidad JPA.
 *	La anotación @Table especifica el nombre de la tabla en la base de datos.
 * 
 * La entidad Coche representa la estructura de los datos que queremos 
 * almacenar en la base de datos. Esta entidad se mapea a la tabla 
 * "coches" en la base de datos.
 * Aquí hemos utilizado anotaciones de JPA (@Entity, 
 * @Table, @Id, @GeneratedValue, etc.) para definir la entidad y sus atributos.
 * 
 * 
 * 
 */
