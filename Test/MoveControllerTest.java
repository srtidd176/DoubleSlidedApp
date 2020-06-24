import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import starter.boundary.DoubleSlidedApp;
import starter.controller.MoveController;
import starter.model.Model;

class MoveControllerTest extends TestCase {

	@Test
	void setup() {
		Model model = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(model);
		MoveController mc = new MoveController(app,model);
	}
	
	@Test
	void testFindTile() {
		Model model = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(model);
		MoveController mc = new MoveController(app,model);
		Point p = new Point(150,200);
		mc.findTile(p);
	}
	
	@Test
	void testLostGame() {
		Model model = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(model);
		MoveController mc = new MoveController(app,model);
		assertFalse(mc.lostGame(4));
	}
	

	
	@Test
	void testWonGame() {
		Model model = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(model);
		MoveController mc = new MoveController(app,model);
		assertFalse(mc.wonGame());
	}
}
