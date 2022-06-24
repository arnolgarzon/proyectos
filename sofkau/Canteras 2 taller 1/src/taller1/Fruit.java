package taller1;

import java.util.ArrayList;
/**
 * Representa un fruta y sus características
 * @author Arnol Garzon
 *@version 1.0
 */

public class Fruit {
	//Atributos
	/**
	 * Nombre de la fruta
	 */
	String name;
	/**
	 * peso promedio de la fruta
	 */
	private float averageWeight;
	/**
	 * Creacion de lista con los colores de la fruta
	 */
	ArrayList<String> colors;
	private Object color;
	//Metodos
	/**
	 * Retorna un arreglo con el color
	 * @return
	 */
	public ArrayList<String> getColors() {
		return colors;
	}
	/**
	 * 
	 * Modifica los atributos de nombre y color de la fruta
	 * @param name
	 * @param color
	 */
	public void setColor(String name, Object color) {
		this.color = color;
	}

}
