package taller1;
/**
 * Representa una cuenta bancaria y sus características
 * @author Arnol Garzon
 * @version 1.0
 */
public class BankAccount {
//Atributos
/**
* Numero de la cuenta
*/
	private int accountNumber;
/**
* Estado de la cuenta
*/
	protected boolean activate;
	
//Metodos
	public boolean isActivate() {
		return activate;
	}

/**
* Modifica el estado de la cuenta
* @param activate
*/
	public void setActivate(boolean activate) {
		this.activate = activate;
	}
/**
* Devuelve el estado de la cuenta
* @return estado de la cuenta
*/
	public boolean getActived() {
		return activate;
			
	}
}
