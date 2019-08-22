package GUI;

/**
* @Author Team F
* @Version 1.0
* @Date 30.06.2019
* GUI für das Scoreboard 
*/
public class ScoreboardGUI extends javax.swing.JFrame {

	/**
	 * Konstruktor
	 */
	public ScoreboardGUI() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		playerOneName = new javax.swing.JLabel();
		playerTwoName = new javax.swing.JLabel();
		playerThreeName = new javax.swing.JLabel();
		playerFourName = new javax.swing.JLabel();
		nextRound = new javax.swing.JButton();
		cancel = new javax.swing.JButton();
		pointsPlayer1 = new javax.swing.JLabel();
		pointsPlayer2 = new javax.swing.JLabel();
		pointsPlayer3 = new javax.swing.JLabel();
		pointsPlayer4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 204, 204));
		jPanel1.setLayout(new java.awt.GridBagLayout());

		playerOneName.setText("player11");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(34, 36, 0, 0);
		jPanel1.add(playerOneName, gridBagConstraints);

		playerTwoName.setText("player22");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 36, 0, 0);
		jPanel1.add(playerTwoName, gridBagConstraints);

		playerThreeName.setText("player33");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 36, 0, 0);
		jPanel1.add(playerThreeName, gridBagConstraints);

		playerFourName.setText("player44");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 36, 0, 0);
		jPanel1.add(playerFourName, gridBagConstraints);

		nextRound.setBackground(new java.awt.Color(255, 255, 255));
		nextRound.setText("N�chste Runde");
		nextRound.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nextRoundActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(88, 67, 6, 6);
		jPanel1.add(nextRound, gridBagConstraints);

		cancel.setBackground(new java.awt.Color(255, 255, 255));
		cancel.setText("Abbrechen");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(88, 6, 6, 0);
		jPanel1.add(cancel, gridBagConstraints);

		pointsPlayer1.setText("aktPunkte3");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(34, 33, 0, 0);
		jPanel1.add(pointsPlayer1, gridBagConstraints);

		pointsPlayer2.setText("aktPunkte2");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 33, 0, 0);
		jPanel1.add(pointsPlayer2, gridBagConstraints);

		pointsPlayer3.setText("aktPunkte3");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 33, 0, 0);
		jPanel1.add(pointsPlayer3, gridBagConstraints);

		pointsPlayer4.setText("aktPunkte4");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 33, 0, 0);
		jPanel1.add(pointsPlayer4, gridBagConstraints);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	/**
	 * Actionlistener - wenn nächste Runde startet
	 * @param evt
	 */
	private void nextRoundActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	// Variables declaration - do not modify
	private javax.swing.JButton cancel;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JButton nextRound;
	private javax.swing.JLabel playerFourName;
	private javax.swing.JLabel playerOneName;
	private javax.swing.JLabel playerThreeName;
	private javax.swing.JLabel playerTwoName;
	private javax.swing.JLabel pointsPlayer1;
	private javax.swing.JLabel pointsPlayer2;
	private javax.swing.JLabel pointsPlayer3;
	private javax.swing.JLabel pointsPlayer4;
	// End of variables declaration
}
