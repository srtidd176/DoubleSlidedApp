import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import starter.boundary.DoubleSlidedApp;
import starter.controller.ResetAction;
import starter.model.Model;

class ResetActionTest extends TestCase{

	@Test
	void setup() {
		Model model = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(model);
		ResetAction ra = new ResetAction(app,model);
	}
	
	@Test
	void testActionPerformed() {
		Model model = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(model);
		ResetAction ra = new ResetAction(app,model);
		ActionEvent event = new ActionEvent(this, 2019, "");
		ra.actionPerformed(event);
	}

}
