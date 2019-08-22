package UnserSystem;
/**
* @Author Team F
* @Version 1.0
* @Date 13.06.2019
* Klasse des Stapels, die der Spieler in der Hand hat.
*/

import java.awt.Image;
import java.util.Collections;
import java.util.Vector;

import javax.swing.ImageIcon;

import Karten.Cards;
import Karten.NormalCards;
import Karten.PickUpTwoCards;
import Karten.ReverseCards;

public class CardStack {

	/* Deklaration der Variabeln */
	private Cards backCard;
	private Image backCardImage = new ImageIcon(this.getClass().getResource("/UNO-Back.png")).getImage();
	private Vector<Cards> cards;
	private Cards cardOnDeck;
	private Cards nextCard;

	/**
	 * Konstruktor
	 */
	public CardStack() {
		cards = new Vector<Cards>();

		// Letzte Karte des Stapels
		backCard = new Cards(backCardImage);

	}

	/**
	 * Erstellt ein Komplett neues Karten Deck, und fügt sie dem Vector hinzu.
	 */
	public void makeNewCardGame() {
		// Bilder für die Karten
		Image bluezero, blueone, bluetwo, bluethree, bluefour, bluefive, bluesix, blueseven, blueeight, bluenine,
				blueswitch, blueplus2;
		Image greenzero, greenone, greentwo, greenthree, greenfour, greenfive, greensix, greenseven, greeneight,
				greennine, greenswitch, greenplus2;
		Image redzero, redone, redtwo, redthree, redfour, redfive, redsix, redseven, redeight, rednine, redswitch,
				redplus2;

		Image yellowzero, yellowone, yellowtwo, yellowthree, yellowfour, yellowfive, yellowsix, yellowseven,
				yelloweight, yellownine, yellowswitch, yellowplus2;

		bluezero = new ImageIcon(this.getClass().getResource("/bluezero.png")).getImage();
		blueone = new ImageIcon(this.getClass().getResource("/blueone.png")).getImage();
		bluetwo = new ImageIcon(this.getClass().getResource("/bluetwo.png")).getImage();
		bluethree = new ImageIcon(this.getClass().getResource("/bluethree.png")).getImage();
		bluefour = new ImageIcon(this.getClass().getResource("/bluefour.png")).getImage();
		bluefive = new ImageIcon(this.getClass().getResource("/bluefive.png")).getImage();
		bluesix = new ImageIcon(this.getClass().getResource("/bluesix.png")).getImage();
		blueseven = new ImageIcon(this.getClass().getResource("/blueseven.png")).getImage();
		blueeight = new ImageIcon(this.getClass().getResource("/blueeight.png")).getImage();
		bluenine = new ImageIcon(this.getClass().getResource("/bluenine.png")).getImage();
		blueswitch = new ImageIcon(this.getClass().getResource("/blueswitch.png")).getImage();
		blueplus2 = new ImageIcon(this.getClass().getResource("/blueplus2.png")).getImage();

		greenzero = new ImageIcon(this.getClass().getResource("/greenzero.png")).getImage();
		greenone = new ImageIcon(this.getClass().getResource("/greenone.png")).getImage();
		greentwo = new ImageIcon(this.getClass().getResource("/greentwo.png")).getImage();
		greenthree = new ImageIcon(this.getClass().getResource("/greenthree.png")).getImage();
		greenfour = new ImageIcon(this.getClass().getResource("/greenfour.png")).getImage();
		greenfive = new ImageIcon(this.getClass().getResource("/greenfive.png")).getImage();
		greensix = new ImageIcon(this.getClass().getResource("/greensix.png")).getImage();
		greenseven = new ImageIcon(this.getClass().getResource("/greenseven.png")).getImage();
		greeneight = new ImageIcon(this.getClass().getResource("/greeneight.png")).getImage();
		greennine = new ImageIcon(this.getClass().getResource("/greennine.png")).getImage();
		greenswitch = new ImageIcon(this.getClass().getResource("/greenswitch.png")).getImage();
		greenplus2 = new ImageIcon(this.getClass().getResource("/greenplus2.png")).getImage();

		redzero = new ImageIcon(this.getClass().getResource("/redzero.png")).getImage();
		redone = new ImageIcon(this.getClass().getResource("/redone.png")).getImage();
		redtwo = new ImageIcon(this.getClass().getResource("/redtwo.png")).getImage();
		redthree = new ImageIcon(this.getClass().getResource("/redthree.png")).getImage();
		redfour = new ImageIcon(this.getClass().getResource("/redfour.png")).getImage();
		redfive = new ImageIcon(this.getClass().getResource("/redfive.png")).getImage();
		redsix = new ImageIcon(this.getClass().getResource("/redsix.png")).getImage();
		redseven = new ImageIcon(this.getClass().getResource("/redseven.png")).getImage();
		redeight = new ImageIcon(this.getClass().getResource("/redeight.png")).getImage();
		rednine = new ImageIcon(this.getClass().getResource("/rednine.png")).getImage();
		redswitch = new ImageIcon(this.getClass().getResource("/redswitch.png")).getImage();
		redplus2 = new ImageIcon(this.getClass().getResource("/redplus2.png")).getImage();

		yellowzero = new ImageIcon(this.getClass().getResource("/yellowzero.png")).getImage();
		yellowone = new ImageIcon(this.getClass().getResource("/yellowone.png")).getImage();
		yellowtwo = new ImageIcon(this.getClass().getResource("/yellowtwo.png")).getImage();
		yellowthree = new ImageIcon(this.getClass().getResource("/yellowthree.png")).getImage();
		yellowfour = new ImageIcon(this.getClass().getResource("/yellowfour.png")).getImage();
		yellowfive = new ImageIcon(this.getClass().getResource("/yellowfive.png")).getImage();
		yellowsix = new ImageIcon(this.getClass().getResource("/yellowsix.png")).getImage();
		yellowseven = new ImageIcon(this.getClass().getResource("/yellowseven.png")).getImage();
		yelloweight = new ImageIcon(this.getClass().getResource("/yelloweight.png")).getImage();
		yellownine = new ImageIcon(this.getClass().getResource("/yellownine.png")).getImage();
		yellowswitch = new ImageIcon(this.getClass().getResource("/yellowswitch.png")).getImage();
		yellowplus2 = new ImageIcon(this.getClass().getResource("/yellowplus2.png")).getImage();

		/* Alle Karten */

		/* Alle normalen blauen Kartn */
		Cards b0_1, b1_1, b2_1, b3_1, b4_1, b5_1, b6_1, b7_1, b8_1, b9_1, b1_2, b2_2, b3_2, b4_2, b5_2, b6_2, b7_2,
				b8_2, b9_2;

		// Alle Karten dem Vector hinzuf�gen
		cards.add(b0_1 = new Cards("Blue", new NormalCards(0), bluezero, 0));

		cards.add(b1_1 = new Cards("Blue", new NormalCards(1), blueone, 1));
		cards.add(b1_2 = new Cards("Blue", new NormalCards(1), blueone, 1));

		cards.add(b2_1 = new Cards("Blue", new NormalCards(2), bluetwo, 2));
		cards.add(b2_2 = new Cards("Blue", new NormalCards(2), bluetwo, 2));

		cards.add(b3_1 = new Cards("Blue", new NormalCards(3), bluethree, 3));
		cards.add(b3_2 = new Cards("Blue", new NormalCards(3), bluethree, 3));

		cards.add(b4_1 = new Cards("Blue", new NormalCards(4), bluefour, 4));
		cards.add(b4_2 = new Cards("Blue", new NormalCards(4), bluefour, 4));

		cards.add(b5_1 = new Cards("Blue", new NormalCards(5), bluefive, 5));
		cards.add(b5_2 = new Cards("Blue", new NormalCards(5), bluefive, 5));

		cards.add(b6_1 = new Cards("Blue", new NormalCards(6), bluesix, 6));
		cards.add(b6_2 = new Cards("Blue", new NormalCards(6), bluesix, 6));

		cards.add(b7_1 = new Cards("Blue", new NormalCards(7), blueseven, 7));
		cards.add(b7_2 = new Cards("Blue", new NormalCards(7), blueseven, 7));

		cards.add(b8_1 = new Cards("Blue", new NormalCards(8), blueeight, 8));
		cards.add(b8_2 = new Cards("Blue", new NormalCards(8), blueeight, 8));

		cards.add(b9_1 = new Cards("Blue", new NormalCards(9), bluenine, 8));
		cards.add(b9_2 = new Cards("Blue", new NormalCards(9), bluenine, 8));

		/* Alle normalen roten Karten */
		Cards r0_1, r1_1, r2_1, r3_1, r4_1, r5_1, r6_1, r7_1, r8_1, r9_1, r1_2, r2_2, r3_2, r4_2, r5_2, r6_2, r7_2,
				r8_2, r9_2;

		cards.add(r0_1 = new Cards("Red", new NormalCards(0), redzero, 0));

		cards.add(r1_1 = new Cards("Red", new NormalCards(1), redone, 1));
		cards.add(r1_2 = new Cards("Red", new NormalCards(1), redone, 1));

		cards.add(r2_1 = new Cards("Red", new NormalCards(2), redtwo, 2));
		cards.add(r2_2 = new Cards("Red", new NormalCards(2), redtwo, 2));

		cards.add(r3_1 = new Cards("Red", new NormalCards(3), redthree, 3));
		cards.add(r3_2 = new Cards("Red", new NormalCards(3), redthree, 3));

		cards.add(r4_1 = new Cards("Red", new NormalCards(4), redfour, 4));
		cards.add(r4_2 = new Cards("Red", new NormalCards(4), redfour, 4));

		cards.add(r5_1 = new Cards("Red", new NormalCards(5), redfive, 5));
		cards.add(r5_2 = new Cards("Red", new NormalCards(5), redfive, 5));

		cards.add(r6_1 = new Cards("Red", new NormalCards(6), redsix, 6));
		cards.add(r6_2 = new Cards("Red", new NormalCards(6), redsix, 6));

		cards.add(r7_1 = new Cards("Red", new NormalCards(7), redseven, 7));
		cards.add(r7_2 = new Cards("Red", new NormalCards(7), redseven, 7));

		cards.add(r8_1 = new Cards("Red", new NormalCards(8), redeight, 8));
		cards.add(r8_2 = new Cards("Red", new NormalCards(8), redeight, 8));

		cards.add(r9_1 = new Cards("Red", new NormalCards(9), rednine, 9));
		cards.add(r9_2 = new Cards("Red", new NormalCards(9), rednine, 9));

		/* Alle normalen gelben Karten */
		Cards y0_1, y1_1, y2_1, y3_1, y4_1, y5_1, y6_1, y7_1, y8_1, y9_1, y1_2, y2_2, y3_2, y4_2, y5_2, y6_2, y7_2,
				y8_2, y9_2;

		cards.add(y0_1 = new Cards("Yellow", new NormalCards(0), yellowzero, 0));

		cards.add(y1_1 = new Cards("Yellow", new NormalCards(1), yellowone, 1));
		cards.add(y1_2 = new Cards("Yellow", new NormalCards(1), yellowone, 1));

		cards.add(y2_1 = new Cards("Yellow", new NormalCards(2), yellowtwo, 2));
		cards.add(y2_2 = new Cards("Yellow", new NormalCards(2), yellowtwo, 2));

		cards.add(y3_1 = new Cards("Yellow", new NormalCards(3), yellowthree, 3));
		cards.add(y3_2 = new Cards("Yellow", new NormalCards(3), yellowthree, 3));

		cards.add(y4_1 = new Cards("Yellow", new NormalCards(4), yellowfour, 4));
		cards.add(y4_2 = new Cards("Yellow", new NormalCards(4), yellowfour, 4));

		cards.add(y5_1 = new Cards("Yellow", new NormalCards(5), yellowfive, 5));
		cards.add(y5_2 = new Cards("Yellow", new NormalCards(5), yellowfive, 5));

		cards.add(y6_1 = new Cards("Yellow", new NormalCards(6), yellowsix, 6));
		cards.add(y6_2 = new Cards("Yellow", new NormalCards(6), yellowsix, 6));

		cards.add(y7_1 = new Cards("Yellow", new NormalCards(7), yellowseven, 7));
		cards.add(y7_2 = new Cards("Yellow", new NormalCards(7), yellowseven, 7));

		cards.add(y8_1 = new Cards("Yellow", new NormalCards(8), yelloweight, 8));
		cards.add(y8_2 = new Cards("Yellow", new NormalCards(8), yelloweight, 8));

		cards.add(y9_1 = new Cards("Yellow", new NormalCards(9), yellownine, 9));
		cards.add(y9_2 = new Cards("Yellow", new NormalCards(9), yellownine, 9));

		/* Alle normalen grünen Karten */
		Cards g0_1, g1_1, g2_1, g3_1, g4_1, g5_1, g6_1, g7_1, g8_1, g9_1, g1_2, g2_2, g3_2, g4_2, g5_2, g6_2, g7_2,
				g8_2, g9_2;

		cards.add(g0_1 = new Cards("Green", new NormalCards(0), greenzero, 0));

		cards.add(g1_1 = new Cards("Green", new NormalCards(1), greenone, 1));
		cards.add(g1_2 = new Cards("Green", new NormalCards(1), greenone, 1));

		cards.add(g2_1 = new Cards("Green", new NormalCards(2), greentwo, 2));
		cards.add(g2_2 = new Cards("Green", new NormalCards(2), greentwo, 2));

		cards.add(g3_1 = new Cards("Green", new NormalCards(3), greenthree, 3));
		cards.add(g3_2 = new Cards("Green", new NormalCards(3), greenthree, 3));

		cards.add(g4_1 = new Cards("Green", new NormalCards(4), greenfour, 4));
		cards.add(g4_2 = new Cards("Green", new NormalCards(4), greenfour, 4));

		cards.add(g5_1 = new Cards("Green", new NormalCards(5), greenfive, 5));
		cards.add(g5_2 = new Cards("Green", new NormalCards(5), greenfive, 5));

		cards.add(g6_1 = new Cards("Green", new NormalCards(6), greensix, 6));
		cards.add(g6_2 = new Cards("Green", new NormalCards(6), greensix, 6));

		cards.add(g7_1 = new Cards("Green", new NormalCards(7), greenseven, 7));
		cards.add(g7_2 = new Cards("Green", new NormalCards(7), greenseven, 7));

		cards.add(g8_1 = new Cards("Green", new NormalCards(8), greeneight, 8));
		cards.add(g8_2 = new Cards("Green", new NormalCards(8), greeneight, 8));

		cards.add(g9_1 = new Cards("Green", new NormalCards(9), greennine, 9));
		cards.add(g9_2 = new Cards("Green", new NormalCards(9), greennine, 9));

		/* Alle aufnehmkarten (p für PickUp) */
		Cards pb_1, pb_2, pr_1, pr_2, pg_1, pg_2, py_1, py_2;

		cards.add(pb_1 = new Cards("Blue", new PickUpTwoCards(), blueplus2, 20));
		cards.add(pb_2 = new Cards("Blue", new PickUpTwoCards(), blueplus2, 20));
		cards.add(pr_1 = new Cards("Red", new PickUpTwoCards(), redplus2, 20));
		cards.add(pr_2 = new Cards("Red", new PickUpTwoCards(), redplus2, 20));
		cards.add(pg_1 = new Cards("Green", new PickUpTwoCards(), greenplus2, 20));
		cards.add(pg_2 = new Cards("Green", new PickUpTwoCards(), greenplus2, 20));
		cards.add(py_1 = new Cards("Yellow", new PickUpTwoCards(), yellowplus2, 20));
		cards.add(py_2 = new Cards("Yellow", new PickUpTwoCards(), yellowplus2, 20));

		/* Alle Retourkarten (r f�r Reverse) */
		Cards rb_1, rb_2, rr_1, rr_2, rg_1, rg_2, ry_1, ry_2;

		cards.add(rb_1 = new Cards("Blue", new ReverseCards(), blueswitch, 20));
		cards.add(rb_2 = new Cards("Blue", new ReverseCards(), blueswitch, 20));
		cards.add(rr_1 = new Cards("Red", new ReverseCards(), redswitch, 20));
		cards.add(rr_2 = new Cards("Red", new ReverseCards(), redswitch, 20));
		cards.add(rg_1 = new Cards("Green", new ReverseCards(), greenswitch, 20));
		cards.add(rg_2 = new Cards("Green", new ReverseCards(), greenswitch, 20));
		cards.add(ry_1 = new Cards("Yellow", new ReverseCards(), yellowswitch, 20));
		cards.add(ry_2 = new Cards("Yellow", new ReverseCards(), yellowswitch, 20));

		shuffleStack();

		Cards backCard;
		cards.add(backCard = new Cards(backCardImage));

		nextCard = cards.elementAt(0);

	}

	/**
	 * Methode regelt die Wegnahmen der Karten.
	 * 
	 * @param card
	 */
	public void removeCard(Cards card) {
		cardOnDeck = card;
		cards.remove(card);
	}

	/**
	 * Methode liefert die Karte auf dem Stapel.
	 * 
	 * @return Karte auf dem Stapel
	 */
	public Cards getCardOnDeck() {
		return cardOnDeck;
	}

	/**
	 * Methode löscht alle Karten.
	 */
	public void removeAllCards() {
		cards.removeAllElements();
	}

	/**
	 * Methode regelt das Mischen der Karten im Stapel.
	 */
	public void shuffleStack() {
		Collections.shuffle(cards);

	}

	/**
	 * Die Methode liefert die Anzahl Karten auf dem Stapel.
	 * 
	 * @return
	 */
	public Integer getSizeOfStack() {
		return cards.size();
	}

	/**
	 * Methode liefert die Karten.
	 * 
	 * @param i
	 * @return Karte
	 */
	public Cards getCardAtElement(int i) {
		if (i >= cards.size()) {
			return backCard;
		}

		return cards.elementAt(i);
	}

	/**
	 * Methode liefert die nächste Karte.
	 * 
	 * @return nächste Karte
	 */
	public Cards getNextCard() {
		if (cards.size() >= 0) {
			nextCard = cards.get(0);
			cards.remove(0);
			return nextCard;
		} else {
			return null;
		}

	}

	/**
	 * Methode regelt das Hinzufügen von Karten zum Stapel.
	 * 
	 * @param newCard
	 */
	public void addCard(Cards newCard) {
		cards.add(newCard);

	}

	/**
	 * Methode liefert die Karte für den Player für das erste Mal.
	 * 
	 * @param i
	 * @return Karte
	 */
	public Cards getCardsForPlayerFirstTime(int i) {
		Cards saveCard = cards.elementAt(i);
		cards.remove(cards.elementAt(i));
		return saveCard;

	}

	/**
	 * Methode setzt neue Karte für den Stapel.
	 * 
	 * @param newCardOnDeck
	 */
	public void setCardOnDeck(Cards newCardOnDeck) {
		// TODO Auto-generated method stub
		cardOnDeck = newCardOnDeck;
	}

}
