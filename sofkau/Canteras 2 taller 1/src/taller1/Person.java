package taller1;

import java.util.Date;
/**
 * Representa una persona y sus caracteristicas
 * @author Arnol Garzon
 * @version 1.0
 */
public class Person {
	//Atributos
	/**
	 *Atributo nombre
	 */
	String name;
	/**
	 * Atributo appelido 1
	 */
	String lastName1;
	/**
	 * Atributo apellido 2
	 */
	String lastName2;
	/**
	 * Atributo para la fecha de cumpleaños
	 */
	Date dateBirth;
	/**
	 * Atributo altura
	 */
	float height;
	
	//Metodos
	/**
	 * Retorna el nombre de la persona
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Modifica el atributo nombre
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
