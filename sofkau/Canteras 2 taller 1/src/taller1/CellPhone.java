package taller1;
/**
 * Reprecenta un celular y sus caractiriscas 
 * @author Arnol Garzon
 *
 */

public class CellPhone {
	/**
	 * Marca del celular
	 */
	String brand;
	/**
	 * Referencia del celular
	 */
	String ref;
	/**
	 * Estado de la señal del celular
	 */
	private Boolean sign;
	/**
	 * Numero del celular
	 */
	int number;
	/**
	 * Obtiene el estado true o false de la señal
	 * @return señal
	 */
	public Boolean getSign() {
		return sign;
	}
	/**
	 * modifica el estado de la señal
	 * @param sign
	 */
	public void setSign(Boolean sign) {
		this.sign = sign;
	}

}
