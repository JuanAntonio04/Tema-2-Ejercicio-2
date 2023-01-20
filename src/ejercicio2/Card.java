package ejercicio2;

public class Card {

	//Atributos de cada objeto creado.
	public String suit;
	public String value;
	
	//Esto va a crear cada "Carta" con los datos de entrada que recibirá del main "DeckCards".
	public Card (String suit, String value) {
		//Le asigna al atributo "suit" el valor de entrada "suit".
		this.suit = suit;
		//Le asigna al atributo "value" el valor de entrada "value".
		this.value = value;
	}
	
	//Muestra todos los datos de un objeto creado anteriormente.
	public String toString () {
		//Este es el String que devuelve.
		return (this.suit+"-"+this.value);
	}
	
}
