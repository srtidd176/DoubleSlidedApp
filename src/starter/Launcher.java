package starter;

import starter.boundary.DoubleSlidedApp;
import starter.model.Model;

public class Launcher {

	
	public static void main(String[] args) {
		Model m = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(m);
		app.setVisible(true);
		
	}
	
}
