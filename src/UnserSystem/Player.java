package UnserSystem;

import java.awt.Image;

import java.util.Vector;

import javax.swing.DefaultListModel;


import Karten.Cards;
import Karten.NormalCards;

/**
 * @Author Team F
 * @Version 1.0
 * @Date 13.06.2019 Die Klasse des Spielers
 */
public class Player {

	/* Deklaration der Variabeln */
	private String name = "";
	private int points;
	private CardStack handStack;
	private int activePlayer = 1;
	private boolean roudDirectionClockwise = true;
	private boolean playerHasAlreadyPickedUp = false;
	private boolean saidUno = false;
	private CardStack gameCardStack;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param gameCardStack
	 */
	public Player(String name, CardStack gameCardStack) {
		this.name = name;
		this.gameCardStack = gameCardStack;
		handStack = new CardStack();

	}

	/**
	 * Diese Methode regelt das Aufnehmen der Karten.
	 * 
	 * @param newCard
	 */
	public void pickUpCard(Cards newCard) {
		saidUno = false;
		setPlayerAlreadyPickedUp();
		handStack.addCard(newCard);
		gameCardStack.removeCard(newCard);
	}

	/**
	 * Diese Methode regelt, dass die gelegte Karte von dem Deck der Hand weggeht.
	 * 
	 * @param removeCard
	 */
	public void removeCardFormStack(Cards removeCard) {
		handStack.removeCard(removeCard);
	}

	/**
	 * Diese Methode regelt, dass die Karte gelegt wird.
	 * 
	 * @param cardLayed
	 */
	public void layCard(Cards cardLayed) {
		handStack.removeCard(cardLayed);
	}

	/**
	 * Diese Methode regelt, wie der Spieler die 7 Startkarten erhält.
	 */
	public void getCardsFirstTime() {

		for (int i = 0; i < 7; i++) {

			handStack.addCard(gameCardStack.getCardsForPlayerFirstTime(i));
		}
	}

	/**
	 * Methode liefert den Namen
	 * 
	 * @return den Namen
	 */
	public String getName() {
		return name;

	}

	/**
	 * Methode setzt den Namen
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Methode regelt die Punktevergabe für den Sieger.
	 * 
	 * @param amountPoints
	 */
	public void addPoints(int amountPoints) {
		points = points + amountPoints;
		if (points == 500) {
			System.exit(0);
		}
	}

	/**
	 * Die Methode liefert die Anzahl der Karten, die der Spieler hat.
	 * 
	 * @return den momentanen aktiven Spieler
	 */
	public Integer getAmountCards() {
		return handStack.getSizeOfStack();
	}

	/**
	 * Mehode liefert den aktiven Spieler.
	 * 
	 * @return Spieler
	 */
	public int getActivePlayer() {

		return activePlayer;
	}

	/**
	 * Methode regelt, wer als nächstes an der Reihe ist.
	 * 
	 * @return den nächsten aktiven Spieler
	 */
	public int setNextPlayer() {

		if (roudDirectionClockwise == true && activePlayer < 4) {
			activePlayer++;
		} else if (roudDirectionClockwise == true && activePlayer == 4) {
			activePlayer = 1;

		} else if (roudDirectionClockwise == false && activePlayer > 1) {
			activePlayer--;
		} else if (roudDirectionClockwise == false && activePlayer == 1) {
			activePlayer = 4;
		}

		return activePlayer;
	}

	/**
	 * Methode liefert den nächsten Spieler.
	 * 
	 * @return nächsten Spieler
	 */
	public int getNextPlayer() {
		int nextPlayer = activePlayer;

		if (roudDirectionClockwise == true && nextPlayer < 4) {
			nextPlayer++;
		} else if (roudDirectionClockwise == true && nextPlayer == 4) {
			nextPlayer = 1;

		} else if (roudDirectionClockwise == false && nextPlayer > 1) {
			nextPlayer--;
		} else if (roudDirectionClockwise == false && nextPlayer == 1) {
			nextPlayer = 4;
		}

		return nextPlayer;
	}

	/**
	 * Methode liefert die Karte die gerade gespielt wurded
	 * 
	 * @param i
	 * @return die Karte
	 */
	public Cards getCardAt(int i) {

		if (handStack.getSizeOfStack() > 0 && i <= handStack.getSizeOfStack()) {
			Cards playedCard = handStack.getCardAtElement(i);
			return playedCard;
		} else {

			return gameCardStack.getCardAtElement(gameCardStack.getSizeOfStack());
		}

	}

	/**
	 * Methode liefert die Spielrichtung (ob sie dem Uhrzeigersinn entspricht).
	 * 
	 * @return die Spielrichtung
	 */
	public boolean getRoundDirectionClockwise() {

		return roudDirectionClockwise;
	}

	/**
	 * Die Methode regelt den Wechsel der Spielrichtung.
	 */
	public void changeRoundDirectionClockwise() {

		if (roudDirectionClockwise == true) {
			roudDirectionClockwise = false;
		} else {
			roudDirectionClockwise = true;
		}

	}

	/**
	 * Methode liefert die Anzahl der Karten, die der Spieler hat.
	 * 
	 * @param player
	 * @return Anzahl Karten
	 */
	public Integer getValueAmountCards(Player player) {

		return player.getAmountCards();

	}

	/**
	 * Methode prüft, ob das Spiel beendet ist.
	 * 
	 * @param trueFalse
	 */
	public void gameFinished(boolean trueFalse) {

	}

	/**
	 * Die Methode regelt, dass alle Karten vom Spieler weggenommen werden.
	 */
	public void clearHandStack() {

		handStack.removeAllCards();

	}

	/**
	 * Methode prüft, ob die gewählte Karte gültig ist.
	 * 
	 * @param cardOnDeck
	 * @param cardToPlay
	 * @return Ob gültig
	 */
	public boolean doesCardFit(Cards cardOnDeck, Cards cardToPlay) {

		/* Wenn die Karten vom Typ sind. */
		if (cardToPlay.getCardType().equals(cardOnDeck.getCardType())) {

			if (cardToPlay.getCardType().equals("reverseCard")) {

				changeRoundDirectionClockwise();
				return true;

			} else if (cardToPlay.getCardType().equals("normalCard")) {

				if (cardToPlay.getNumberIfExists() == cardOnDeck.getNumberIfExists()) {

					return true;
				}else if (cardOnDeck.getColor().equalsIgnoreCase(cardToPlay.getColor())) {
					return true;
				}
				else {

					return false;
				}

			}
			return true;
		}

		/* Wenn die Karten die gleiche Farbe haben. */

		if (cardOnDeck.getColor().equalsIgnoreCase(cardToPlay.getColor())) {

			if (cardToPlay.getCardType().equals("reverseCard")) {

				changeRoundDirectionClockwise();
				return true;

			} else {

					return true;
				}

			}
		/*
		 * Ansonsten ist die Karte weder fom gleichen Typ, noch von der gleichen Farbe
		 * bzw. Nummer
		 */
			return false;
		
		
	}

	/**
	 * Methode regelt das Aufnehmen von zwei Karten, was man tun muss, wenn die +2
	 * Karte zuvor gelegt wurde
	 */
	public void pickUpTwoCards() {
		saidUno = false;
		handStack.addCard(gameCardStack.getCardAtElement(0));
		handStack.addCard(gameCardStack.getCardAtElement(0));

	}

	/**
	 * Methode setzt den aktiven Spieler
	 * 
	 * @param i
	 */
	public void setActivePlayer(int i) {
		activePlayer = i;
	}

	/**
	 * Methode prüft, ob der Spieler bereits eine Karte aufgenommen hat.
	 * 
	 * @return Ob Aufnahme schon stattfand
	 */
	public boolean playerHasAlreadyPickedUp() {
		return playerHasAlreadyPickedUp;

	}

	/**
	 * Methode setzt fest, dass der Spieler bereits eine Karte aufgenommen hat.
	 */
	public void setPlayerAlreadyPickedUp() {

		playerHasAlreadyPickedUp = true;

	}

	/**
	 * Methode setzt fest, dass der Spieler noch keine KArte aufgenommen hat.
	 */
	public void setPlayerDidNotPickedUp() {

		playerHasAlreadyPickedUp = false;
	}

	/**
	 * Methode prüft, ob der Spieler schon "UNO" gesagt hat.
	 * 
	 * @return ob UNO schon gesagt wurde
	 */
	public boolean getSaidUno() {
		// TODO Auto-generated method stub
		return saidUno;
	}

	/**
	 * Methode setzt fest, dass der Spieler bereits "UNO" gesagt hat.
	 */
	public void setSaidUno() {
		// TODO Auto-generated method stub
		saidUno = true;
	}

	/**
	 * Methode gibt anzahl Punkte zurück.
	 * 
	 * @return anzahl Points
	 */
	public int getPoints() {
		// TODO Auto-generated method stub
		return points;
	}
}
