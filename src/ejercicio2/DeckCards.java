package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		//Arrays con los nombres de las cartas.
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		//Arrays con los valores de las cartas.
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();

		//Bucle que se va a ejecutar mientras que el contador "i", sea menor a la longitud del arrays "Suits".
		for (int i = 0; i < suits.length; i++) {
			
			//Bucle que se ejecutara mientras el contador "j" sea menor a la longitud del Arrays "Values".
			for (int j = 0; j < values.length; j++) {
				//Crea un objeto "Card" cada vez que se ejecute el bucle con los siguientes datos: Cogerá del arrays "Suits" el dato que ocupe la posición del contador "i" y del arrays "Values" el dato que ocupe la posición del contador "j".
				Card card = new Card(suits[i], values[j]);
				//Va a ir añadiendo al Arrays "Deck" el objeto "Card" que va a ir variando el contenido según se vaya ejecutando el bucle.
				deck.add(card);
			}
		}

		//Bucle que se va a ejecutar mientras que el contador "i", sea menor a la longitud del arrays "Deck".
		for (int i = 0; i < deck.size(); i++) {
			//Crea una variable "j".
			int j = (int) Math.floor(Math.random() * i);
			//Crea un objeto "tmp" con el contenido de "deck" y el contenido de la posicion que ocupe el contador "i".
			Card tmp = deck.get(i);
			//Cambia el contenido de "Deck" que ocupa la posición de "i" por el contenido de "Deck" que ocupa la posicion "j". 
			deck.set(i, deck.get(j));
			//Cambia el contenido de "Deck" que ocupa la posición de "j" por el contenido de "tmp". 
			deck.set(j, tmp);
		}

		//Bucle que se va a ejecutar mientras que el contador "i", sea menor a 5.
		for (int i = 0; i < 5; i++) {
			//Mostrará el contenido del hueco que ocupe el numero del contador en el arrays "Deck".
			System.out.println(deck.get(i));
		}

	}

}
