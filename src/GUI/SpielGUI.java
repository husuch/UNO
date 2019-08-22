package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import UnserSystem.CardStack;
import main.UnoApp;

/**
* @Author Team F
* @Version 1.0
* @Date 13.06.2019
* Das GUI des eigentlichen Spiels
*/
public class SpielGUI extends JFrame {

	/*Variables declaration - do not modify*/
	private JButton abbrechenButton;
	private JLabel anz1;
	private JLabel anz2;
	private JLabel anz3;
	private JLabel anz4;
	private JLabel anzahl;

	private JButton cardOnDisplay1;
	private JButton cardOnDisplay2;
	private JButton cardOnDisplay3;
	private JButton cardOnDisplay4;
	private JButton cardOnDisplay5;
	private JButton cardOnDisplay6;
	private JButton cardOnDisplay7;
	private JButton cardOnDisplay8;
	private JButton cardOnDisplay9;
	private JButton cardOnDisplay10;
	private JButton cardOnDisplay11;
	private JButton cardOnDisplay12;
	private JButton cardOnDisplay13;
	private JButton cardOnDisplay14;
	private JButton cardOnDisplay15;
	private JButton cardOnDisplay16;
	private JButton cardOnDisplay17;
	private JButton cardOnDisplay18;
	private JButton cardOnDisplay19;
	private JButton cardOnDisplay20;
	private JButton cardOnDisplay21;
	private JButton cardOnDisplay22;
	private JButton cardOnDisplay23;
	private JButton cardOnDisplay24;
	private JButton cardOnDisplay25;
	private JButton cardOnDisplay26;
	private JButton cardOnDisplay27;
	private JButton cardOnDisplay28;
	private JButton cardOnDisplay29;
	private JButton cardOnDisplay30;

	private JPanel cardsNowPlayingPane;
	private JButton jButton8;
	private JButton jButton9;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel playerFourName;
	private JLabel jLabel17;
	private JLabel jLabel18;
	private JLabel jLabel5;
	private JLabel jLabel16;
	private JLabel jLabel6;
	private JPanel jPanel2;
	private JLabel karten;
	private JButton nextPlayerButton;
	private JButton pickUpCardButton;
	private JPanel playerFourPane;
	private JPanel playerFourPointPane;
	private JPanel playerOnePointPane;
	private JLabel playerOneName;
	private JPanel playerPlanePane;
	private JLabel playerThreeName;
	private JPanel playerThreePane;
	private JPanel playerThreePointPane;
	private JLabel playerTwoName;
	private JPanel playerTwoPane;
	private JPanel playerTwoPointPane;
	private java.awt.ScrollPane scrollPane1;
	private Panel panel1;

	private JButton regeln;
	private JButton restartButton;
	private JButton canNotPlayCard;
	private JButton unoButton;
	private JLabel unoLogo;
	private UnoApp app;
	private CardStack gameCardStack;
	private int cardChoosen = -1;
	private Border readBorder = BorderFactory.createLineBorder(Color.RED, 4);
	private Vector<JButton> cardsButtonVector;
	// End of variables declaration

	/**
	 * Konstruktor
	 * @param app
	 * @param gameCardStack
	 */
	public SpielGUI(UnoApp app, CardStack gameCardStack) {
		super("UNO!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(1210, 870);
		this.setResizable(false);
		this.app = app;
		this.gameCardStack = gameCardStack;
		init();
	}

	/**
	 * Methode initialisiert das GUI
	 */
	private void init() {

		jPanel2 = new JPanel();
		playerPlanePane = new JPanel();
		playerOneName = new JLabel();
		playerTwoPane = new JPanel();
		playerTwoName = new JLabel();
		playerOnePointPane = new JPanel();
		anzahl = new JLabel();
		karten = new JLabel();
		anz1 = new JLabel();
		playerTwoPointPane = new JPanel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		anz2 = new JLabel();
		playerThreePane = new JPanel();
		playerThreeName = new JLabel();
		playerThreePointPane = new JPanel();
		jLabel13 = new JLabel();
		jLabel14 = new JLabel();
		anz3 = new JLabel();
		playerFourPane = new JPanel();
		playerFourName = new JLabel();
		playerFourPointPane = new JPanel();
		jLabel17 = new JLabel();
		jLabel18 = new JLabel();
		jLabel16 = new JLabel();
		anz4 = new JLabel();
		unoLogo = new JLabel();
		abbrechenButton = new JButton();
		restartButton = new JButton();
		regeln = new JButton();
		jButton8 = new JButton();
		jButton9 = new JButton();
		cardsNowPlayingPane = new JPanel();
		pickUpCardButton = new JButton();
		nextPlayerButton = new JButton();
		panel1 = new Panel();
		cardsButtonVector = new Vector<JButton>();
		scrollPane1 = new java.awt.ScrollPane();

		cardOnDisplay1 = new JButton();
		cardOnDisplay2 = new JButton();
		cardOnDisplay3 = new JButton();
		cardOnDisplay4 = new JButton();
		cardOnDisplay5 = new JButton();
		cardOnDisplay6 = new JButton();
		cardOnDisplay7 = new JButton();
		cardOnDisplay8 = new JButton();
		cardOnDisplay9 = new JButton();
		cardOnDisplay10 = new JButton();
		cardOnDisplay11 = new JButton();
		cardOnDisplay12 = new JButton();
		cardOnDisplay13 = new JButton();
		cardOnDisplay14 = new JButton();
		cardOnDisplay15 = new JButton();
		cardOnDisplay16 = new JButton();
		cardOnDisplay17 = new JButton();
		cardOnDisplay18 = new JButton();
		cardOnDisplay19 = new JButton();
		cardOnDisplay20 = new JButton();
		cardOnDisplay21 = new JButton();
		cardOnDisplay22 = new JButton();
		cardOnDisplay23 = new JButton();
		cardOnDisplay24 = new JButton();
		cardOnDisplay25 = new JButton();
		cardOnDisplay26 = new JButton();
		cardOnDisplay27 = new JButton();
		cardOnDisplay28 = new JButton();
		cardOnDisplay29 = new JButton();
		cardOnDisplay30 = new JButton();

		cardsButtonVector.add(cardOnDisplay1);
		cardsButtonVector.add(cardOnDisplay2);
		cardsButtonVector.add(cardOnDisplay3);
		cardsButtonVector.add(cardOnDisplay4);
		cardsButtonVector.add(cardOnDisplay5);
		cardsButtonVector.add(cardOnDisplay6);
		cardsButtonVector.add(cardOnDisplay7);
		cardsButtonVector.add(cardOnDisplay8);
		cardsButtonVector.add(cardOnDisplay9);
		cardsButtonVector.add(cardOnDisplay9);
		cardsButtonVector.add(cardOnDisplay10);
		cardsButtonVector.add(cardOnDisplay11);
		cardsButtonVector.add(cardOnDisplay13);
		cardsButtonVector.add(cardOnDisplay14);
		cardsButtonVector.add(cardOnDisplay15);
		cardsButtonVector.add(cardOnDisplay16);
		cardsButtonVector.add(cardOnDisplay17);
		cardsButtonVector.add(cardOnDisplay18);
		cardsButtonVector.add(cardOnDisplay19);
		cardsButtonVector.add(cardOnDisplay20);
		cardsButtonVector.add(cardOnDisplay21);
		cardsButtonVector.add(cardOnDisplay22);
		cardsButtonVector.add(cardOnDisplay23);
		cardsButtonVector.add(cardOnDisplay24);
		cardsButtonVector.add(cardOnDisplay25);
		cardsButtonVector.add(cardOnDisplay26);
		cardsButtonVector.add(cardOnDisplay27);
		cardsButtonVector.add(cardOnDisplay28);
		cardsButtonVector.add(cardOnDisplay29);
		cardsButtonVector.add(cardOnDisplay30);

		unoButton = new JButton();
		canNotPlayCard = new JButton();

		Image logo = new ImageIcon(this.getClass().getResource("/uno logo.png")).getImage();
		Image backCard = new ImageIcon(this.getClass().getResource("/UNO-Back.png")).getImage();

		setAmountCardsGUI();

		playerOneName.setText("1. " + app.getNameOfPlayer(1));
		playerTwoName.setText("2. " + app.getNameOfPlayer(2));
		playerThreeName.setText("3. " + app.getNameOfPlayer(3));
		playerFourName.setText("4. " + app.getNameOfPlayer(4));
		playerPlanePane.setBorder(readBorder);

		unoLogo.setIcon(new ImageIcon(logo));
		unoButton.setIcon(new ImageIcon(logo));
		unoButton.addActionListener(new ActionListener() {

			/**
			 * Actionlistener - wenn der UNO-Knopf gedrückt wurde
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				unoPressed();

			}
		});

		setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(255, 204, 204));

		playerPlanePane.setBackground(new java.awt.Color(204, 255, 204));
		playerOneName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

		playerTwoPointPane.setBackground(new java.awt.Color(255, 153, 153));
		playerTwoPane.setBackground(new java.awt.Color(255, 153, 153));
		playerTwoPane.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
		playerTwoName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

		playerThreePane.setBackground(new java.awt.Color(204, 204, 255));
		playerThreePane.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
		playerThreeName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
		playerThreePointPane.setBackground(new java.awt.Color(204, 204, 255));

		playerFourPane.setBackground(new java.awt.Color(204, 255, 255));
		playerFourPointPane.setBackground(new java.awt.Color(204, 255, 255));
		playerFourPane.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
		playerFourName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

		javax.swing.GroupLayout playerPlanePaneLayout = new javax.swing.GroupLayout(playerPlanePane);
		playerPlanePane.setLayout(playerPlanePaneLayout);
		playerPlanePaneLayout.setHorizontalGroup(playerPlanePaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(playerPlanePaneLayout
						.createSequentialGroup().addGap(73, 73, 73).addComponent(playerOneName).addGap(82, 82, 82)));
		playerPlanePaneLayout.setVerticalGroup(playerPlanePaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(playerPlanePaneLayout
						.createSequentialGroup().addGap(32, 32, 32).addComponent(playerOneName).addContainerGap()));

		//
		javax.swing.GroupLayout playerTwoPaneLayout = new javax.swing.GroupLayout(playerTwoPane);
		playerTwoPane.setLayout(playerTwoPaneLayout);
		playerTwoPaneLayout.setHorizontalGroup(playerTwoPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(playerTwoPaneLayout
						.createSequentialGroup().addGap(76, 76, 76).addComponent(playerTwoName).addGap(79, 79, 79)));
		playerTwoPaneLayout.setVerticalGroup(playerTwoPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(playerTwoPaneLayout
						.createSequentialGroup().addGap(34, 34, 34).addComponent(playerTwoName).addContainerGap()));

		javax.swing.GroupLayout playerThreePaneLayout = new javax.swing.GroupLayout(playerThreePane);
		playerThreePane.setLayout(playerThreePaneLayout);
		playerThreePaneLayout.setHorizontalGroup(playerThreePaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(playerThreePaneLayout
						.createSequentialGroup().addGap(76, 76, 76).addComponent(playerThreeName).addGap(79, 79, 79)));
		playerThreePaneLayout.setVerticalGroup(playerThreePaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(playerThreePaneLayout
						.createSequentialGroup().addGap(34, 34, 34).addComponent(playerThreeName).addGap(31, 31, 31)));

		javax.swing.GroupLayout playerFourPaneLayout = new javax.swing.GroupLayout(playerFourPane);
		playerFourPane.setLayout(playerFourPaneLayout);
		playerFourPaneLayout.setHorizontalGroup(playerFourPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(playerFourPaneLayout
						.createSequentialGroup().addGap(76, 76, 76).addComponent(playerFourName).addGap(70, 70, 70)));
		playerFourPaneLayout.setVerticalGroup(playerFourPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(playerFourPaneLayout
						.createSequentialGroup().addGap(34, 34, 34).addComponent(playerFourName).addGap(31, 31, 31)));

		playerOnePointPane.setBackground(new java.awt.Color(204, 255, 204));

		anzahl.setText("Anzahl");

		karten.setText("Karten");

		anz1.setText("ANZ");

		javax.swing.GroupLayout playerOnePointPaneLayout = new javax.swing.GroupLayout(playerOnePointPane);
		playerOnePointPane.setLayout(playerOnePointPaneLayout);
		playerOnePointPaneLayout.setHorizontalGroup(
				playerOnePointPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(playerOnePointPaneLayout.createSequentialGroup()
								.addGroup(playerOnePointPaneLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(playerOnePointPaneLayout.createSequentialGroup().addGap(19, 19, 19)
												.addComponent(anz1))
										.addGroup(playerOnePointPaneLayout.createSequentialGroup().addGap(12, 12, 12)
												.addGroup(playerOnePointPaneLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(anzahl).addComponent(karten))))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		playerOnePointPaneLayout.setVerticalGroup(playerOnePointPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(playerOnePointPaneLayout.createSequentialGroup().addContainerGap().addComponent(anzahl)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(karten)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(anz1)
						.addGap(0, 0, Short.MAX_VALUE)));

		jLabel5.setText("Anzahl");

		jLabel6.setText("Karten");

		anz2.setText("ANZ");
		//
		javax.swing.GroupLayout playerTwoPointPaneLayout = new javax.swing.GroupLayout(playerTwoPointPane);
		playerTwoPointPane.setLayout(playerTwoPointPaneLayout);
		playerTwoPointPaneLayout.setHorizontalGroup(
				playerTwoPointPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(playerTwoPointPaneLayout.createSequentialGroup()
								.addGroup(playerTwoPointPaneLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(playerTwoPointPaneLayout.createSequentialGroup().addGap(19, 19, 19)
												.addComponent(anz2))
										.addGroup(playerTwoPointPaneLayout.createSequentialGroup().addGap(12, 12, 12)
												.addGroup(playerTwoPointPaneLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel5).addComponent(jLabel6))))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		playerTwoPointPaneLayout.setVerticalGroup(playerTwoPointPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(playerTwoPointPaneLayout.createSequentialGroup().addContainerGap().addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(anz2)
						.addGap(0, 15, Short.MAX_VALUE)));

		jLabel13.setText("Anzahl");

		jLabel14.setText("Karten");

		anz3.setText("ANZ");

		javax.swing.GroupLayout playerThreePointPaneLayout = new javax.swing.GroupLayout(playerThreePointPane);
		playerThreePointPane.setLayout(playerThreePointPaneLayout);
		playerThreePointPaneLayout.setHorizontalGroup(
				playerThreePointPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(playerThreePointPaneLayout.createSequentialGroup()
								.addGroup(playerThreePointPaneLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(playerThreePointPaneLayout.createSequentialGroup().addGap(19, 19, 19)
												.addComponent(anz3))
										.addGroup(playerThreePointPaneLayout.createSequentialGroup().addGap(12, 12, 12)
												.addGroup(playerThreePointPaneLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel13).addComponent(jLabel14))))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		playerThreePointPaneLayout.setVerticalGroup(playerThreePointPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(playerThreePointPaneLayout.createSequentialGroup().addContainerGap().addComponent(jLabel13)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel14)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(anz3)
						.addGap(0, 12, Short.MAX_VALUE)));

		jLabel17.setText("Anzahl");

		jLabel18.setText("Karten");

		anz4.setText("ANZ");

		javax.swing.GroupLayout playerFourPointPaneLayout = new javax.swing.GroupLayout(playerFourPointPane);
		playerFourPointPane.setLayout(playerFourPointPaneLayout);
		playerFourPointPaneLayout.setHorizontalGroup(
				playerFourPointPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(playerFourPointPaneLayout.createSequentialGroup()
								.addGroup(playerFourPointPaneLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(playerFourPointPaneLayout.createSequentialGroup().addGap(19, 19, 19)
												.addComponent(anz4))
										.addGroup(playerFourPointPaneLayout.createSequentialGroup().addGap(12, 12, 12)
												.addGroup(playerFourPointPaneLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel17).addComponent(jLabel18))))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		playerFourPointPaneLayout.setVerticalGroup(playerFourPointPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(playerFourPointPaneLayout.createSequentialGroup().addContainerGap().addComponent(jLabel17)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel18)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(anz4)
						.addGap(0, 12, Short.MAX_VALUE)));

		abbrechenButton.setBackground(new java.awt.Color(255, 255, 255));
		abbrechenButton.setText("Abbrechen");
		abbrechenButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				abbrechenButtonActionPerformed(evt);
			}
		});

		restartButton.setBackground(new java.awt.Color(255, 255, 255));
		restartButton.setText("Restart");
		restartButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				restartButtonActionPerformed(evt);
			}
		});

		regeln.setBackground(new java.awt.Color(255, 255, 255));
		regeln.setText("?");
		regeln.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				regelnActionPerformed(evt);
			}
		});
		//

		jButton8.setBackground(new java.awt.Color(255, 204, 204));
		jButton8.setForeground(new java.awt.Color(255, 204, 204));
		jButton8.setIcon(new ImageIcon(gameCardStack.getCardAtElement(0).getImg()));
		jButton8.setMaximumSize(new java.awt.Dimension(97, 40));
		jButton8.setMinimumSize(new java.awt.Dimension(97, 29));
		jButton8.setPreferredSize(new java.awt.Dimension(97, 29));
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new java.awt.Color(255, 204, 204));
		jButton9.setForeground(new java.awt.Color(255, 204, 204));
		jButton9.setMaximumSize(new java.awt.Dimension(97, 29));
		jButton9.setMinimumSize(new java.awt.Dimension(97, 29));
		jButton9.setIcon(new ImageIcon(backCard));
		//
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		Component jLabel1;
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
										.addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(27, 27, 27).addComponent(regeln)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(
												abbrechenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(16, 16, 16)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(playerFourPane, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(playerPlanePane, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addComponent(playerOnePointPane,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(playerTwoPane,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(playerTwoPointPane,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addComponent(playerFourPointPane,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addComponent(playerThreePane,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18, 18)
																.addComponent(playerThreePointPane,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGroup(jPanel2Layout.createSequentialGroup()
																		.addComponent(jButton9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				97,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(38, 38, 38).addComponent(unoLogo)
																		.addGap(18, 18, 18)
																		.addComponent(canNotPlayCard)))
														.addGap(18, 18, 18)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jButton8,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGap(77, 77, 77)))
						.addContainerGap()));
		//
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(abbrechenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(regeln))
								.addGap(52, 52, 52)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(36, 36, 36)
												.addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(canNotPlayCard).addComponent(unoLogo))))
								.addGap(99, 99, 99)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(playerFourPointPane, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(playerFourPane, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(playerThreePointPane, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(playerThreePane, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(32, 32, 32)
								.addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(playerTwoPane, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(playerTwoPointPane, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(playerOnePointPane, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(playerPlanePane, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap(42, Short.MAX_VALUE)));
		//
		cardsNowPlayingPane.setBackground(new java.awt.Color(204, 204, 255));

		pickUpCardButton.setBackground(new java.awt.Color(255, 255, 255));
		pickUpCardButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
		pickUpCardButton.setText("Karte Aufnehmen");
		pickUpCardButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				pickUpCardButtonActionPerformed();
			}
		});

		nextPlayerButton.setBackground(new java.awt.Color(255, 255, 255));
		nextPlayerButton.setText("Karte legen und weiter");
		nextPlayerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nextPlayerButtonActionPerformed();
				nextPlayerBorderMarked();
			}

		});

		// Anonymer ActionListener
		ActionListener a = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < cardsButtonVector.size(); i++) {
					
					if (e.getSource() == cardsButtonVector.elementAt(i)) {
						
						cardsButtonVector.elementAt(i).setBackground(Color.red);
						cardChoosen = i;
					}
					else {
						cardsButtonVector.elementAt(i).setBackground(new Color(204,204,255));
					}
				}
				
			}

		};
		unoButton.setBackground(new java.awt.Color(204, 204, 255));
		unoButton.setForeground(new java.awt.Color(204, 204, 255));
		unoButton.setIcon(new javax.swing.ImageIcon(logo)); // NOI18N

		scrollPane1.setWheelScrollingEnabled(false);

		panel1.setBackground(new java.awt.Color(204, 204, 255));

		for (int i = 0; i < cardsButtonVector.size(); i++) {

			cardsButtonVector.elementAt(i).setBackground(new Color(204, 204, 255));
			cardsButtonVector.elementAt(i).setForeground(new java.awt.Color(204, 204, 255));
			cardsButtonVector.elementAt(i).setIcon(new ImageIcon(backCard)); // NOI18N
			cardsButtonVector.elementAt(i).addActionListener(a);
		}

		unoButton.setBackground(new java.awt.Color(204, 204, 255));
		unoButton.setForeground(new java.awt.Color(204, 204, 255));

		canNotPlayCard.setBackground(new java.awt.Color(255, 255, 255));
		canNotPlayCard.setText("Kann nicht");
		canNotPlayCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				canNotPlayAnyCard();

			}

		});
		setAmountCardsGUI();
		setImageIconForCards();
		//

		javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panel1Layout.createSequentialGroup().addContainerGap()

						.addComponent(cardOnDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay5, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay6, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay7, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay8, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay9, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay10, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay11, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay12, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay13, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay14, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay15, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay16, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay17, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay18, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay19, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay20, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay21, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay22, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(4, 4, 4)
						.addComponent(cardOnDisplay23, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay24, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay25, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay26, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay27, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay28, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay29, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cardOnDisplay30, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panel1Layout.createSequentialGroup().addContainerGap().addGroup(panel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(cardOnDisplay30, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(cardOnDisplay28, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(cardOnDisplay24, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(cardOnDisplay29, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(cardOnDisplay26, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(cardOnDisplay27, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(cardOnDisplay25, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(cardOnDisplay20, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay14, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay17, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay15, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay9, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay13, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay12, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay10, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay8, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay7, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay3, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay6, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay5, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay4, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cardOnDisplay1, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay11, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay16, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay18, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cardOnDisplay21, javax.swing.GroupLayout.DEFAULT_SIZE, 147,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay22, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cardOnDisplay19, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(cardOnDisplay23, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		scrollPane1.add(panel1);

		//
		javax.swing.GroupLayout cardsNowPlayingPaneLayout = new javax.swing.GroupLayout(cardsNowPlayingPane);
		cardsNowPlayingPane.setLayout(cardsNowPlayingPaneLayout);
		cardsNowPlayingPaneLayout.setHorizontalGroup(cardsNowPlayingPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardsNowPlayingPaneLayout.createSequentialGroup()
						.addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 747,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(cardsNowPlayingPaneLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardsNowPlayingPaneLayout
										.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(cardsNowPlayingPaneLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(pickUpCardButton,
														javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(unoButton, javax.swing.GroupLayout.Alignment.TRAILING)))
								.addGroup(
										cardsNowPlayingPaneLayout.createSequentialGroup().addGap(39, 39, 39)
												.addComponent(canNotPlayCard)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96,
														Short.MAX_VALUE)
												.addComponent(nextPlayerButton)))
						.addGap(57, 57, 57)));
		cardsNowPlayingPaneLayout.setVerticalGroup(
				cardsNowPlayingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						cardsNowPlayingPaneLayout.createSequentialGroup().addContainerGap()
								.addGroup(cardsNowPlayingPaneLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(cardsNowPlayingPaneLayout.createSequentialGroup()
												.addComponent(pickUpCardButton).addGap(18, 18, 18)
												.addComponent(unoButton).addGap(18, 18, 18)
												.addGroup(cardsNowPlayingPaneLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(nextPlayerButton).addComponent(canNotPlayCard))
												.addGap(0, 13, Short.MAX_VALUE))
										.addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cardsNowPlayingPane, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(0, 0, 0)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(0, 0, 0)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(cardsNowPlayingPane, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
	}

	/**
	 * Actionlistener - wenn auf den "Karte aufnehmen"-Knopf gedrückt wurde
	 */
	private void pickUpCardButtonActionPerformed() {
		// TODO add your handling code here:

		if (app.getPlayerInTurnPlayer().getAmountCards() < 30) {
			if (app.getPlayerInTurnPlayer().playerHasAlreadyPickedUp() == false) {

				switch (app.getPlayerInTurn()) {
				case 1:
					app.addCardToStackOfPlayer(1, gameCardStack.getNextCard());

					app.getPlayerInTurnPlayer().setPlayerAlreadyPickedUp();
					break;
				case 2:
					app.addCardToStackOfPlayer(2, gameCardStack.getNextCard());

					app.getPlayerInTurnPlayer().setPlayerAlreadyPickedUp();
					break;
				case 3:
					app.addCardToStackOfPlayer(3, gameCardStack.getNextCard());

					app.getPlayerInTurnPlayer().setPlayerAlreadyPickedUp();
					break;
				case 4:
					app.addCardToStackOfPlayer(4, gameCardStack.getNextCard());

					app.getPlayerInTurnPlayer().setPlayerAlreadyPickedUp();
					break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Sie können nur eine Karte aufnehmen.", "FEHLER",
						JOptionPane.WARNING_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Sie können maximal 30 Karten auf der Hand haben.", "FEHLER",
					JOptionPane.WARNING_MESSAGE);
		}
		setAmountCardsGUI();
		setImageIconForCards();
	}

	/**
	 * Actionlistener - wenn der "Abbrechen"-Knopf gedrückt wurde
	 * @param evt
	 */
	private void abbrechenButtonActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
		dispose();
	}

	/**
	 * Actionlistener - wenn der "Restart"-Knopf gedrückt wurde
	 * @param evt
	 */
	private void restartButtonActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		app.resetGame();

	}

	/**
	 * Actionlistener - wenn der "?"-Knopf gedrückt wurde
	 * @param evt
	 */
	private void regelnActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
		GUIRegeln regeln = new GUIRegeln(this);
		setVisible(false);
	}

	
	private void jButton8ActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void cardOnDisplay7ActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void nextPlayerButtonActionPerformed() {
		boolean cardCouldPlay = false;
		// TODO Auto-generated method stub

		if (cardChoosen == -1) {
			JOptionPane.showMessageDialog(null, "Bitte wählen Sie eine Karte aus, oder nehmen Sie eine Karte auf!",
					"FEHLER", JOptionPane.WARNING_MESSAGE);
		}
		for (int i = 0; i < cardsButtonVector.size(); i++) {
			if (i == cardChoosen) {
				if (app.doesCardFit(app.getCardOnDeck(), app.getPlayerInTurnPlayer().getCardAt(i))) {

					cardCouldPlay = true;
					app.setCardOnDeck(app.getPlayerInTurnPlayer().getCardAt(i));
					app.removeCardOfPlayerStack(app.getPlayerInTurn(), app.getPlayerInTurnPlayer().getCardAt(i));
					jButton8.setIcon(cardsButtonVector.elementAt(i).getIcon());
					cardsButtonVector.elementAt(i).setBackground(new Color(204, 204, 255));
				} else {
					JOptionPane.showMessageDialog(null, "Karte nicht Passend", "FEHLER", JOptionPane.WARNING_MESSAGE);
				}

			}
		}

		if (cardCouldPlay) {

			cardChoosen = -1;
			app.setNextPlayer();
			makeBorderOfPlayer();
			setAmountCardsGUI();
			setImageIconForCards();

		}

	}

	/**
	 * Die Methode macht einen Rahmen für den Spieler.
	 */
	private void makeBorderOfPlayer() {
		switch (app.getPlayerInTurn()) {
		case 1:
			playerPlanePane.setBorder(readBorder);
			playerTwoPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			playerThreePane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			playerFourPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			break;
		case 2:
			playerTwoPane.setBorder(readBorder);
			playerPlanePane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			playerThreePane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			playerFourPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			break;
		case 3:
			playerThreePane.setBorder(readBorder);
			playerTwoPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			playerPlanePane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			playerFourPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			break;
		case 4:
			playerFourPane.setBorder(readBorder);
			playerTwoPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			playerThreePane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			playerPlanePane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + app.getPlayerInTurn());
		}

	}

	/**
	 * Die Methode setzt die Bilder für die Karten
	 */
	private void setImageIconForCards() {
		// TODO Auto-generated method stub
		for (int i = 0; i < cardsButtonVector.size(); i++) {
			cardsButtonVector.elementAt(i).setIcon(new ImageIcon(app.getPlayerInTurnPlayer().getCardAt(i).getImg()));
		}
	}

	/**
	 * Die Methode setzt die Anzahl Karten für das GUI
	 */
	private void setAmountCardsGUI() {
		if (app.getPlayerBeforePlayer().getAmountCards() == 0) {
			if (app.getPlayerInTurnPlayer().getSaidUno()) {
				JOptionPane.showMessageDialog(null,
						"Player " + app.getPlayerBeforePlayer().getName() + " hat gewonnen!", "GEWONNEN",
						JOptionPane.WARNING_MESSAGE);
				// Default
				app.getPlayerBeforePlayer().addPoints(100);
				app.resetGame();
			} else {
				JOptionPane.showMessageDialog(null,
						"Player " + app.getPlayerInTurnPlayer().getName() + " hat vergessen Uno zu sagen!", "UNO!!!!",
						JOptionPane.WARNING_MESSAGE);
				app.getPlayerBeforePlayer().pickUpCard(gameCardStack.getNextCard());
			}

		}

		anz1.setText(app.getAmountOfCardsOfPlayer(1).toString());
		anz2.setText(app.getAmountOfCardsOfPlayer(2).toString());
		anz3.setText(app.getAmountOfCardsOfPlayer(3).toString());
		anz4.setText(app.getAmountOfCardsOfPlayer(4).toString());
	}

	/**
	 * Die Methode macht den Rahmen für den nächsten Spieler.
	 */
	private void nextPlayerBorderMarked() {
		// TODO Auto-generated method stub
		int border = app.getPlayerInTurn();

	}

	/**
	 * Die Methode behandelt das Drücken vom "UNO"-Knopf.
	 */
	private void unoPressed() {
		if (app.getPlayerInTurnPlayer().getAmountCards() > 2) {
			JOptionPane.showMessageDialog(null,
					"Sie haben noch mehr als eine Karte (bei zwei Karten müssen Sie Uno sagen, da die eine noch gelegt wird!)",
					"FEHLER", JOptionPane.WARNING_MESSAGE);
			}
			else if(app.getPlayerInTurnPlayer().getAmountCards() > 2){
				JOptionPane.showMessageDialog(null,
						"Sie haben nur noch eine Karte",
						"FEHLER", JOptionPane.WARNING_MESSAGE);
			}
		 else {
			app.getPlayerInTurnPlayer().setSaidUno();
			switch (app.getPlayerInTurn()) {
			case 1:
				anz1.setBorder(readBorder);
				break;
			case 2:
				anz2.setBorder(readBorder);
				break;
			case 3:
				anz3.setBorder(readBorder);
				break;
			case 4:
				anz4.setBorder(readBorder);
				break;

			default:
				break;
			}
		}
	}

	/**
	 * Die Methode behandelt den Fall, falls man keine Karte spielen kann.
	 */
	private void canNotPlayAnyCard() {
		// TODO Auto-generated method stub
		if (app.playerHasPickedUpCard()) {
			cardChoosen = -1;
			app.setNextPlayer();
			makeBorderOfPlayer();
			setAmountCardsGUI();
			setImageIconForCards();
		} else {
			JOptionPane.showMessageDialog(null, "Nehmen Sie zuerst eine Karte auf!", "FEHLER",
					JOptionPane.WARNING_MESSAGE);
		}

	}

}