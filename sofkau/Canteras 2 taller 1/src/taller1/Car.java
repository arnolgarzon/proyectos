package taller1;
/**
 * Representa un carro y sus características 
 * @author Arnol Garzon
 * @version 1,0
 */

public class Car {
//Atributos
/**
 * Marca del carro
 */
	String brand;
/**
 * Color del carro
 */
	String color;
/**
 * Modelo del carro
 */
	int model;

	
//Metodos
/**
 * retorna la marca del carro
 * @return brand
 */
	public String getBrand() {
		return brand;
	}
/**
 * Modifica la marca del carro
 * @param brand
 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
/**
 * Retorna el color del carro
 * @return color
 */
	public String getColor() {
		return color;
	}
/**
 * Modifica el color del carro
 * @param color
 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * retorna el modelo del carro
	 * @return model
	 */
	public int getModel() {
		return model;
	}
	/**
	 * modifica el modelo del carro
	 * @param model
	 */
	public void setModel(int model) {
		this.model = model;
	}
	
}
