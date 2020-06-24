package starter.boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import starter.controller.MoveController;
import starter.controller.ResetAction;
import starter.model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class DoubleSlidedApp extends javax.swing.JFrame {

	private JPanel contentPane;
	PuzzleView panel;
	Model model;
	JLabel numMovesLabel;
	JLabel gameStatusLabel;
	boolean lostGame;
	boolean wonGame;

	/**
	 * Create the frame.
	 */
	public DoubleSlidedApp(Model model) {
	
		this.model = model;
		this.lostGame = false;
		this.wonGame = false;
		
		setDefaultCloseOperation(DoubleSlidedApp.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		this.numMovesLabel = new JLabel("Number Of Moves: ");
		this.numMovesLabel.setText("Number Of Moves: " + this.model.getNumMoves());
		
		this.panel = new PuzzleView(this.model, this);
		MoveController mc = new MoveController(this, this.model);
		this.panel.addMouseListener(mc);
		
		ResetAction ra = new ResetAction(this, this.model);
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(ra);
		
		this.gameStatusLabel = new JLabel("Game Status");
		this.gameStatusLabel.setVisible(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(80)
									.addComponent(btnReset))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(27)
									.addComponent(gameStatusLabel))))
						.addComponent(numMovesLabel))
					.addContainerGap(129, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(btnReset)
							.addGap(105)
							.addComponent(gameStatusLabel)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addComponent(numMovesLabel)
					.addGap(82))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public PuzzleView getPanel() {
		return this.panel;
	}
	
	
	public void resetToDefault() {
		this.model.resetTiles();
	}

	public JLabel getNumMovesLabel() {
		return this.numMovesLabel;
	}
	
	public boolean getLostGame() {
		return this.lostGame;
	}
	
	public boolean getWonGame() {
		return this.wonGame;
	}
	
	public void setLostGame(boolean lost) {
		this.lostGame = lost;
	}
	
	public void setWonGame(boolean won) {
		this.wonGame = won;
	}

	public void setGameStatusLabel(String text) {
		this.gameStatusLabel.setText(text);
		this.gameStatusLabel.setVisible(true);
	}
}
