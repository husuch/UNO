package Karten;

import java.awt.Image;

/**
* @Author Team F
* @Version 1.0
* @Date 13.06.2019
* Die Klasse aller Karten zusammen
*/

public class Cards {
	
	/*Deklaration Variabeln*/
	private String color;
	private int number;
	private String cardType;
	private Image img;
	
	/**
	 * Konstruktor normale Karten
	 * @param color
	 * @param normalCard
	 * @param img
	 * @param amoutPoints
	 */
	public Cards(String color, NormalCards normalCard, Image img, int amoutPoints) {
		this.color = color;
		this.number = normalCard.getNumber();
		this.img = img;
		cardType = "normalCard";

	}
	
	/**
	 * Konstruktor Umkehr-Karte
	 * @param color
	 * @param reverseCard
	 * @param img
	 * @param amoutPoints
	 */
	public Cards(String color, ReverseCards reverseCard, Image img, int amoutPoints) {
		this.color = color;
		this.img = img;
		cardType = "reverseCard";
	}
	
	/**
	 * Konstruktor Ziehe-Zwei-Karte
	 * @param color
	 * @param pickUpTwoCard
	 * @param img
	 * @param amoutPoints
	 */
	public Cards(String color, PickUpTwoCards pickUpTwoCard, Image img, int amoutPoints) {
		this.color = color;
		this.img = img;
		cardType  = "pickUpTwoCard";
	}
	
	/**
	 * Konstruktor f�r die R�ckseite Karte
	 * @param img
	 */
	public Cards(Image img) {
		this.img = img;
		cardType  = "UNO-Back";
	}
	
	/**
	 * Die Methode holt die Kartenfarbe.¨
	 * @return Farbe der Karte
	 */
	public String getColor() {
		 
		return color;
	}
	
	/**
	 * Die Methode holt die Zahl der Karte (Falls eine existiert).
	 * @return Zahl der Karte
	 */
	public int getNumberIfExists() {
		if (number >= 0) {
			
			return number;
		}
		else {
			return 0;
		}
			
	}
	/**
	 * Die Methode holt den Kartentyp.
	 * @return Kartentyp
	 */
	public String getCardType() {
		return cardType;
	}
	
	/**
	 * Die Methode holt das Bild der Karte.
	 * @return Bild
	 */
	public Image getImg() {
		return img;
	}

}
