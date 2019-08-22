/**
* @Author Team F
* @Version 1.0
* @Date 04.07.2019
* Das GUI für die Regeln
*/
package GUI;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import UnserSystem.Player;
import main.UnoApp;




public class GUIRegeln extends  JFrame {
	
	/*Deklaration der Variabeln*/                   
    private  JPanel mainPanel;
    private  JLabel rule1Label;
    private  JLabel rule2label;
    private  JLabel rule3Label;
    private  JLabel rule4Label;
    private  JTextArea textAreaRule2;
    private  JTextArea textAreaRule3;
    private  JTextArea textAreaRule4;
    private  JTextArea textAreaRules1;
    private  JScrollPane textPainRule2;
    private  JScrollPane textPainRule3;
    private  JScrollPane textPainRule4;
    private  JScrollPane textPainRules1;
    private  JButton backToGame;
    private SpielGUI spiel;

    /**
     * Konstruktor
     * @param spiel
     */
    public GUIRegeln(SpielGUI spiel) {
    	super("UNO! Regeln");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.spiel = spiel;
		init();
    }

    /**
     * Methode initialisiert das GUI                  
     */
    private void init() {

        mainPanel = new  JPanel();
        textPainRules1 = new  JScrollPane();
        textAreaRules1 = new  JTextArea();
        rule1Label = new  JLabel();
        rule2label = new  JLabel();
        textPainRule2 = new  JScrollPane();
        textAreaRule2 = new  JTextArea();
        textPainRule3 = new  JScrollPane();
        textAreaRule3 = new  JTextArea();
        textPainRule4 = new  JScrollPane();
        textAreaRule4 = new  JTextArea();
        rule3Label = new  JLabel();
        rule4Label = new  JLabel();
        backToGame = new  JButton();

        mainPanel.setBackground(new java.awt.Color(255, 153, 153));

        textAreaRules1.setEditable(false);
        textAreaRules1.setBackground(new java.awt.Color(255, 204, 204));
        textAreaRules1.setColumns(20);
        textAreaRules1.setRows(5);
        textAreaRules1.setText("Das Ziel beim klassischen UNO ist es,\nals erster Spieler 500 Punkte zu erzielen.\nPro Runde erhält der Spieler Punkte, welcher als Erster\nalle seine Karten auf der Hand ablegt. \nPunkte gibt es für alle Karten, \ndie die Übrigen Mitspieler\nnoch auf der Hand halten.");
        textAreaRules1.setSelectedTextColor(new java.awt.Color(204, 255, 204));
        textPainRules1.setViewportView(textAreaRules1);

        rule1Label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        rule1Label.setText("Wie gewinnt man?");

        rule2label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        rule2label.setText("Wie lauten die Regeln?");

        textAreaRule2.setEditable(false);
        textAreaRule2.setBackground(new java.awt.Color(255, 204, 204));
        textAreaRule2.setColumns(20);
        textAreaRule2.setRows(5);
        textAreaRule2.setText("Nummernkarten: Haben den Wert,\nwelche auf der Karte steht.\nZieh Zwei Karte: Hat einen Wert von 20 Punkte.\nRetour Karte: Hat einen Wert von 20 Punkte.");
        textAreaRule2.setSelectedTextColor(new java.awt.Color(204, 255, 204));
        textPainRule2.setViewportView(textAreaRule2);

        textAreaRule3.setEditable(false);
        textAreaRule3.setBackground(new java.awt.Color(255, 204, 204));
        textAreaRule3.setColumns(20);
        textAreaRule3.setRows(5);
        textAreaRule3.setText("Eine Karte kann nur auf eine Karte der gleichen Farbe\noder der gleichen Zahl gelegt werden.\nKann ein Spieler keine passende Karte legen,\nso muss er eine Strafkarte vom verdeckten Stapel ziehen.\nDiese Karte kann er sofort wieder ausspielen,\nsofern diese passt. Hat er keine passende Karte,\nist der nächste Spieler an der Reihe.\nWer die vorletzte Karte ablegt, muss UNO! Rufen.\nVergisst ein Spieler das und ein anderer bekommt es\nrechtzeitig mit (bevor der nächste Spieler eine Karte\ngezogen oder abgeworfen hat) so muss er 2 Strafkarten\nziehen. Die Runde gewinnt derjenige, \nwelcher die letzte Karte abgelegt hat.\nDie Punkte werden addiert und eine neue Runde\nwird gespielt.\nZIEH ZWEI KARTE: Wenn diese Karte gelegt wird,\nmuss der nächste Spieler 2 Karten ziehen\nund darf in dieser Runde keine Karten ablegen.\nDiese Karte kann nur auf eine Karte\nmit entsprechender Farbe oder andere Zieh Zwei Karten\ngelegt werden. Wenn sie zu Beginn des Spiels\naufgedeckt wird, gelten dieselben Regeln.\nRETOUR KARTE \r\n" + 
        		"Bei dieser Karte ändert sich die Spielrichtung. Wenn bisher nach\nlinks gespielt wurde, wird nun nach rechts\ngespielt und umgekehrt. Die Karte kann nur\n auf eine entsprechende Farbe oder eine andere Retour\nKarte gelegt werden. Wenn diese Karte zu Beginn\ndes Spiels gezogen wird, fängt der Geber an und\ndann setzt der Spieler zu seiner Rechten\nanstatt zu seiner Linken das Spiel fort.\r\n" + 
        		"");
        textAreaRule3.setSelectedTextColor(new java.awt.Color(204, 255, 204));
        textPainRule3.setViewportView(textAreaRule3);

        textAreaRule4.setEditable(false);
        textAreaRule4.setBackground(new java.awt.Color(255, 204, 204));
        textAreaRule4.setColumns(20);
        textAreaRule4.setRows(5);
        textAreaRule4.setText("Vergisst ein Spieler nach dem legen seiner\nvorletzten Karte «UNO!» zu rufen\nund hat der nächste Spieler seine Karte noch nicht\nausgespielt, so muss er eine Strafkarte ziehen. \nFalsch gelegt: Wer eine Karte legt, obwohl \ner nicht dran ist,\noder eine falsche Karte gelegt hat,\nmuss diese wieder aufnehmen und erhält zusätzlich\neine Strafkarte. ");
        textAreaRule4.setSelectedTextColor(new java.awt.Color(204, 255, 204));
        textPainRule4.setViewportView(textAreaRule4);

        rule3Label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        rule3Label.setText("Wie werde ich bestraft?");

        rule4Label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        rule4Label.setText("Wie viel Punktewert hat jede Karte?");

        backToGame.setText("Zurück");
        backToGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToGameActionPerformed(evt);
            }
        });

         GroupLayout mainPanelLayout = new  GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup( GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(textPainRules1,  GroupLayout.PREFERRED_SIZE, 376,  GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(rule1Label))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(rule2label)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(rule4Label)
                    .addComponent(rule3Label)
                    .addGroup(mainPanelLayout.createParallelGroup( GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textPainRule4,  GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                        .addComponent(textPainRule2)))
                .addGap(16, 16, 16))
            .addGroup( GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backToGame)
                .addContainerGap())
            .addGroup(mainPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(textPainRule3,  GroupLayout.PREFERRED_SIZE, 370,  GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(417, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(mainPanelLayout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(rule1Label)
                    .addComponent(rule3Label))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(textPainRules1,  GroupLayout.PREFERRED_SIZE, 124,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rule2label)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(textPainRule4))
                .addGap(18, 18, 18)
                .addComponent(rule4Label)
                .addGap(12, 12, 12)
                .addComponent(textPainRule2,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283)
                .addComponent(backToGame)
                .addContainerGap())
            .addGroup(mainPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                .addGroup( GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(215, Short.MAX_VALUE)
                    .addComponent(textPainRule3,  GroupLayout.PREFERRED_SIZE, 430,  GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

         GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                  

 
    private void backToGameActionPerformed(ActionEvent evt) {                                           
        
    	dispose();
    	
    	spiel.setVisible(true);
    	
    	
    }    
                     

  

                      
}
