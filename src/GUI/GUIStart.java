package GUI;

/**
* @Author Team F
* @Version 1.0
* @Date 13.06.2019
* Das Startmenu für unser UNO Spiel
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import UnserSystem.CardStack;
import UnserSystem.Player;
import main.UnoApp;

public class GUIStart extends JFrame {
	
	/*Deklaratiojn der Variabeln */
	private UnoApp app = new UnoApp();
	private CardStack gameCardStack;
	// Gui Elemente
	// Buttons
	JButton cancelButton = new JButton("Beenden");
	JButton beginButton = new JButton("Start");
	// Textfields
	JTextField playerNameOne = new JTextField(8);
	JTextField playerNameTwo = new JTextField(8);
	JTextField playerNameThree = new JTextField(8);
	JTextField playerNameFour = new JTextField(8);

	// extras
	JPanel welcomePanel = new JPanel();
	JPanel playerPanel = new JPanel();
	JPanel buttonPanel = new JPanel();

	JLabel p1 = new JLabel("Name Spieler 1: ");
	JLabel p2 = new JLabel("Name Spieler 2: ");
	JLabel p3 = new JLabel("Name Spieler 3: ");
	JLabel p4 = new JLabel("Name Spieler 4: ");
	JLabel welcome = new JLabel("Willkommen zu UNO!");
	JLabel guide = new JLabel();

	/**
	 *  Konstruktor
	 * @param gameCardStack
	 */
	public GUIStart(CardStack gameCardStack) {

		super("UNO");
		this.gameCardStack = gameCardStack;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(300, 400);
		this.setResizable(false);
		init();

	}

	/**
	 *  Initialisierung des GUIStart
	 */
	private void init() {
		playerNameOne.setDocument(new JTextFieldCharLimit(8));
		playerNameTwo.setDocument(new JTextFieldCharLimit(8));
		playerNameThree.setDocument(new JTextFieldCharLimit(8));
		playerNameFour.setDocument(new JTextFieldCharLimit(8));
		
		welcomePanel.setBackground(new java.awt.Color(255, 204, 204));
		playerPanel.setBackground(new java.awt.Color(255, 204, 204));
		buttonPanel.setBackground(new Color(255,204,204));
		// Parameter für GridBagLayout
		GridBagConstraints gbc = new GridBagConstraints();

		playerPanel.setLayout(new GridBagLayout());

		gbc.gridx = 0;
		gbc.gridy = 0;
		playerPanel.add(p1, gbc);
		gbc.gridy++;
		playerPanel.add(p2, gbc);
		gbc.gridy++;
		playerPanel.add(p3, gbc);
		gbc.gridy++;
		playerPanel.add(p4, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		playerPanel.add(playerNameOne, gbc);
		gbc.gridy++;
		playerPanel.add(playerNameTwo, gbc);
		gbc.gridy++;
		playerPanel.add(playerNameThree, gbc);
		gbc.gridy++;
		playerPanel.add(playerNameFour, gbc);

		buttonPanel.add(cancelButton);
		buttonPanel.add(beginButton);

		/**
		 *  Anonymer ActionListener
		 */
		ActionListener a = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == beginButton) {
					
					  if (playerNameOne.getText().isEmpty() == false &&
					  playerNameTwo.getText().isEmpty() == false &&
					  playerNameThree.getText().isEmpty() == false &&
					  playerNameFour.getText().isEmpty() == false) {
					 
					
					setNammeOfPlayers();
					SpielGUI spiel = new SpielGUI(app, gameCardStack);
					dispose();

					
					  } else { JOptionPane.showMessageDialog(null, "Bitte alle Namen eingeben",
					  "FEHLER", JOptionPane.WARNING_MESSAGE); }
					 

				}

				else if (e.getSource() == cancelButton) {

					System.exit(0);
				}

			}

			/**
			 * Methode setzt die Namen der Spieler.
			 */
			private void setNammeOfPlayers() {
				app.setNameOfPlayers(playerNameOne.getText(), playerNameTwo.getText(), playerNameThree.getText(), playerNameFour.getText());
				
			}
		};

		// ActionListener zu Buttons hinzufügen
		beginButton.addActionListener(a);
		cancelButton.addActionListener(a);

		// Das Fenster
		welcomePanel.setLayout(new GridBagLayout());

		gbc.gridx = 0;
		gbc.gridy = 0;
		welcomePanel.add(welcome, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		guide.setText(
				"<html><body><center><br>Bitte gib die Namen der Teilnehmer ein.<br><br>Und klicke auf den Start Knopf</center></body></html>");
		welcomePanel.add(guide, gbc);
		getContentPane().add(welcomePanel, BorderLayout.NORTH);
		getContentPane().add(playerPanel, BorderLayout.CENTER);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);

	}


}
