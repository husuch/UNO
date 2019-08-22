/*
* @Author Team F
* @Version 1.0
* @Date 06.07.2019
*/
package Karten;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.Test;

public class KartenTest {
	
	Image bluezero = new ImageIcon(this.getClass().getResource("/bluezero.png")).getImage();

	Cards normalCard = new Cards("Blue", new NormalCards(0), bluezero, 0);
	Cards reverseCard = new Cards("Blue", new ReverseCards(), bluezero, 100);
	Cards pickUpTwo = new Cards("Blue", new PickUpTwoCards(), bluezero, 100);

	@Test
	public void testTheType() {

		assertEquals(normalCard.getCardType(), "normalCard");
		assertEquals(reverseCard.getCardType(), "reverseCard");
		assertEquals(pickUpTwo.getCardType(), "pickUpTwoCard");

	}

	@Test
	public void testTheColor() {
		assertEquals(normalCard.getColor(), "Blue");
		assertEquals(reverseCard.getColor(), "Blue");
		assertEquals(pickUpTwo.getColor(), "Blue");
	}

}
