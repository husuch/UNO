package main;

import GUI.GUIStart;
import GUI.SpielGUI;
import Karten.Cards;
import UnserSystem.CardStack;
import UnserSystem.Player;

/**
* @Author Team F
* @Version 1.0
* @Date 13.06.2019
* Das Main
*/
public class UnoApp {

	/* Deklaration derr Variabeln */
	private static Player playerOne, playerTwo, playerThree, playerFour;
	private static CardStack gameCardStack = new CardStack();

	/**
	 * Die Main-Methode
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		gameCardStack.makeNewCardGame();

		playerOne = new Player("", gameCardStack);
		playerTwo = new Player("", gameCardStack);
		playerThree = new Player("", gameCardStack);
		playerFour = new Player("", gameCardStack);
		

		playerOne.getCardsFirstTime();
		playerTwo.getCardsFirstTime();
		playerThree.getCardsFirstTime();
		playerFour.getCardsFirstTime();

		GUIStart start = new GUIStart(gameCardStack);

	}

	/**
	 * Methode setzt die Namen der Spieler.
	 * 
	 * @param nameOne
	 * @param nameTwo
	 * @param nameThree
	 * @param nameFour
	 */
	public void setNameOfPlayers(String nameOne, String nameTwo, String nameThree, String nameFour) {

		playerOne.setName(nameOne);
		playerTwo.setName(nameTwo);
		playerThree.setName(nameThree);
		playerFour.setName(nameFour);

	}

	/**
	 * Methode liefert die Namen der Spieler
	 * 
	 * @param playerNum
	 * @return Name
	 */
	public String getNameOfPlayer(int playerNum) {
		String name = " ";
		switch (playerNum) {
		case 1:

			name = playerOne.getName();
			break;
		case 2:
			name = playerTwo.getName();
			break;
		case 3:
			name = playerThree.getName();
			break;
		case 4:
			name = playerFour.getName();
			break;
		}
		return name;

	}

	/**
	 * Methode liefert die Anzahl der Karten für den jeweiligen Spieler.
	 * 
	 * @param playerNum
	 * @return Anzahl Karten
	 */
	public Integer getAmountOfCardsOfPlayer(int playerNum) {

		int i = 0;
		switch (playerNum) {

		case 1:
			i = playerOne.getAmountCards();
			break;

		case 2:
			i = playerTwo.getAmountCards();
			break;
		case 3:
			i = playerThree.getAmountCards();
			break;
		case 4:
			i = playerFour.getAmountCards();
			break;

		}
		return i;
	}

	/**
	 * Die Methode regelt das Hinzufügen einer Karte zum persönlichen Stapel.
	 * 
	 * @param playerNum
	 * @param newCard
	 */
	public void addCardToStackOfPlayer(int playerNum, Cards newCard) {
		// TODO Auto-generated method stub
		switch (playerNum) {
		case 1:
			playerOne.pickUpCard(newCard);
			break;
		case 2:
			playerTwo.pickUpCard(newCard);
			break;
		case 3:
			playerThree.pickUpCard(newCard);
			break;
		case 4:
			playerFour.pickUpCard(newCard);
			break;
		}

	}

	/**
	 * Die Methode prüft, ob der Spieler eine Karte aufgenommen hat.
	 * 
	 * @return ob Spieler Karte aufgenommen hat
	 */
	public boolean playerHasPickedUpCard() {
		// Player One ist der Spielleiter
		boolean bool = false;
		switch (getPlayerInTurn()) {
		case 1:
			bool = playerOne.playerHasAlreadyPickedUp();
			break;
		case 2:
			bool = playerTwo.playerHasAlreadyPickedUp();
			break;
		case 3:
			bool = playerThree.playerHasAlreadyPickedUp();
			break;
		case 4:
			bool = playerFour.playerHasAlreadyPickedUp();
			break;

		default:
			break;
		}
		return bool;
	}

	/**
	 * Methode regelt das Löschen einer Karte vom persönlichen Stapel des Spielers.
	 * 
	 * @param playerNum
	 * @param removeCard
	 */
	public void removeCardOfPlayerStack(int playerNum, Cards removeCard) {
		switch (playerNum) {
		case 1:
			playerOne.removeCardFormStack(removeCard);
			break;
		case 2:
			playerTwo.removeCardFormStack(removeCard);
			break;
		case 3:
			playerThree.removeCardFormStack(removeCard);
			break;
		case 4:
			playerFour.removeCardFormStack(removeCard);
			break;

		default:
			break;
		}
	}

	/**
	 * Die Methode liefert den Spieler, der an der Reihe ist.
	 * 
	 * @return Spieler
	 */
	public int getPlayerInTurn() {
		// Player One ist der Spielleiter
		return playerOne.getActivePlayer();
	}

	/**
	 * Die Methode liefert den aktuellen Spieler.
	 * 
	 * @return aktuellen Spieler
	 */
	public Player getPlayerInTurnPlayer() {
		// Player One ist der Spielleiter
		int player = playerOne.getActivePlayer();
		Player playerInTurn;

		switch (player) {
		case 1:
			playerInTurn = playerOne;
			break;
		case 2:
			playerInTurn = playerTwo;
			break;
		case 3:
			playerInTurn = playerThree;
			break;
		case 4:
			playerInTurn = playerFour;
			break;
		default:
			playerInTurn = null;
			break;
		}
		return playerInTurn;
	}

	/**
	 * Methode prüft ob die Spielrichtung im Uhrzeigersinn ist.
	 * 
	 * @return ob Uhrzeigersinn
	 */
	public boolean roundDirectionClockwise() {
		// Player One ist der Spielleiter
		return playerOne.getRoundDirectionClockwise();
	}

	/**
	 * Die Methode setzt den nächsten Spieler
	 */
	public void setNextPlayer() {
		// Player One ist der Spielleiter
		getPlayerInTurnPlayer().setPlayerDidNotPickedUp();
		playerOne.setNextPlayer();

	}

	/**
	 * Die Methode liefert die Karte auf dem Stapel.
	 * 
	 * @return Karte
	 */
	public Cards getCardOnDeck() {
		if (gameCardStack.getCardOnDeck() == null) {
			return gameCardStack.getCardAtElement(0);
		}else {
			return gameCardStack.getCardOnDeck();
		}
		
	}

	/**
	 * Die Methode setzt die Karte auf dem Stapel.
	 * 
	 * @param newCardOnDeck
	 */
	public void setCardOnDeck(Cards newCardOnDeck) {
		gameCardStack.setCardOnDeck(newCardOnDeck);
	}

	/**
	 * Die methode regelt das Neustarten des Spiels.
	 */
	public void resetGame() {

		gameCardStack.removeAllCards();

		playerOne.clearHandStack();
		playerTwo.clearHandStack();
		playerThree.clearHandStack();
		playerFour.clearHandStack();

		gameCardStack.makeNewCardGame();

		playerOne.getCardsFirstTime();
		playerTwo.getCardsFirstTime();
		playerThree.getCardsFirstTime();
		playerFour.getCardsFirstTime();

		playerOne.setActivePlayer(1);
		SpielGUI gui = new SpielGUI(this, gameCardStack);
	}

	/**
	 * Die Methode prüft, ob die Karte passt.
	 * 
	 * @param cardOnDeck
	 * @param cardToPlay
	 * @return Ob die Karte passt
	 */
	public boolean doesCardFit(Cards cardOnDeck, Cards cardToPlay) {
		// Player One ist der Spielleiter
		if (cardToPlay.getCardType().equals("pickUpTwoCard") && playerOne.doesCardFit(cardOnDeck, cardToPlay)) {
			switch (playerOne.getNextPlayer()) {

			case 1:
				playerOne.pickUpTwoCards();
				break;
			case 2:
				playerTwo.pickUpTwoCards();
				break;

			case 3:
				playerThree.pickUpTwoCards();
				break;

			case 4:
				playerFour.pickUpTwoCards();
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + playerOne.getNextPlayer());
			}
		}
		return playerOne.doesCardFit(cardOnDeck, cardToPlay);
	}

	/**
	 * Die Methode holt den Spieler der vorher an der Reihe war (Beim "UNO" sagen)
	 * @return vorherigen Spieler
	 */
	public Player getPlayerBeforePlayer() {

		Player winPlayer;
		if (roundDirectionClockwise()) {
			switch (getPlayerInTurn()) {
			case 1:
				winPlayer = playerFour;
				break;
			case 2:
				winPlayer = playerOne;
				break;
			case 3:
				winPlayer = playerTwo;
				break;
			case 4:
				winPlayer = playerThree;
				break;

			default:
				winPlayer = null;
			}
		} else {
			switch (getPlayerInTurn()) {
			case 1:
				winPlayer = playerTwo;
				break;
			case 2:
				winPlayer = playerThree;
				break;
			case 3:
				winPlayer = playerFour;
				break;
			case 4:
				winPlayer = playerOne;
				break;

			default:
				winPlayer = null;
			}

		}
		return winPlayer;
	}

}
