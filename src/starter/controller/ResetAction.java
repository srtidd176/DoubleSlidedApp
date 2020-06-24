package starter.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import starter.boundary.DoubleSlidedApp;
import starter.model.Model;

public class ResetAction implements ActionListener  {
	DoubleSlidedApp app;
	Model model;
	
	public ResetAction(DoubleSlidedApp app, Model model) {
		this.app = app;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		this.model.resetTiles();
		this.app.setWonGame(false);
		this.app.setLostGame(false);
		this.app.setGameStatusLabel("");
		this.app.repaint();		
	}

}