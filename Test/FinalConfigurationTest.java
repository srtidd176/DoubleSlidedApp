import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import starter.model.FinalConfiguration;

class FinalConfigurationTest extends TestCase{

	
	@Test
	void setup() {
		FinalConfiguration fc = new FinalConfiguration();
	}
	
	@Test
	void testGetFinalTiles() {
		FinalConfiguration fc = new FinalConfiguration();
		fc.getFinalTiles();
	}
	
	@Test
	void testGetFinalEmpty() {
		FinalConfiguration fc = new FinalConfiguration();
		fc.getFinalEmpty();
	}
}
