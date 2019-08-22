/*
* @Author Team F
* @Version 1.0
* @Date 06.07.2019
*/
package UnserSystem;

import Karten.*;

import static org.junit.Assert.*;

import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;

import org.junit.Test;

import com.sun.net.httpserver.Authenticator.Success;

public class SystemTest {
	Vector<Cards> cardVector = new Vector<Cards>();

	Cards b0_1, b1_1, b2_1, b3_1, b4_1;
	Image bluezero = new ImageIcon(this.getClass().getResource("/bluezero.png")).getImage();
	Image blueone = new ImageIcon(this.getClass().getResource("/blueone.png")).getImage();
	Image bluetwo = new ImageIcon(this.getClass().getResource("/bluetwo.png")).getImage();
	Image bluethree = new ImageIcon(this.getClass().getResource("/bluethree.png")).getImage();
	Image bluefour = new ImageIcon(this.getClass().getResource("/bluefour.png")).getImage();

	Player player = new Player("", new CardStack());

	@Test
	public void cardVectortackTest() {

		cardVector.add(b0_1 = new Cards("Blue", new NormalCards(0), bluezero, 0));

		cardVector.add(b1_1 = new Cards("Green", new NormalCards(0), blueone, 1));

		cardVector.add(b2_1 = new Cards("Read", new NormalCards(0), bluetwo, 2));

		cardVector.add(b3_1 = new Cards("Yellow", new NormalCards(0), bluethree, 3));

		cardVector.add(b4_1 = new Cards("Blue", new NormalCards(0), bluefour, 4));

		assertEquals(5, cardVector.size());

	}

	@Test
	public void removeFromcardVectortackTest() {

		cardVector.add(b0_1);
		cardVector.add(b1_1);
		cardVector.add(b2_1);
		cardVector.add(b3_1);
		cardVector.add(b4_1);

		cardVector.remove(b2_1);
		cardVector.remove(0);

		assertEquals(3, cardVector.size());

	}

	// Geht noch nicht
	@Test
	public void doesCardFitTest() {

		cardVector.add(b0_1);
		cardVector.add(b1_1);
		cardVector.add(b2_1);
		cardVector.add(b2_1);
		cardVector.add(b3_1);
		cardVector.add(b4_1);

		// Same Number
		assertEquals(true, player.doesCardFit(cardVector.elementAt(0), cardVector.elementAt(1)));
	}

	@Test
	public void playerNameTest() {
		player.setName("Hans");

		assertEquals("Hans", player.getName());

	}

	@Test
	public void playerPointsTest() {

		player.addPoints(100);

		assertEquals(100, player.getPoints());

	}

	@Test
	public void nextActivePlayerTest() {

		player.setNextPlayer();

		assertEquals(2, player.getActivePlayer());

	}

	@Test
	public void saidUnoTest() {

		player.setSaidUno();
		assertEquals(true, player.getSaidUno());
	}

	@Test
	public void roudDirectionClockwise() {

		assertEquals(true, player.getRoundDirectionClockwise());
	}

	@Test
	public void playerHasAlreadyPickedUp() {
		player.pickUpCard(b0_1);

		assertEquals(true, player.playerHasAlreadyPickedUp());
	}

}
