package taller1;

import java.util.Date;

/**
 * Representa un empleo y sus posibles caracteristicas
 * @author Arnol Garzon
 *@version 1.0
 */
public class Job {
	/**
	 * Nombre del trabajo.
	 */
	String name;
	/**
	 * Dirección del trabajo.
	 */
	String address;
	/**
	 * Salario del trabajo
	 */
	int salary;
	/**
	 * fecha de ingreso al trabajo
	 */
	Date entry;
	
	//Metodos
	
	/**
	 * Retorna el nombre del trabajo
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Modifica el nombre del trabajo
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Retorna el salario del trabajo
	 * @return
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * Modifica el salario
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
