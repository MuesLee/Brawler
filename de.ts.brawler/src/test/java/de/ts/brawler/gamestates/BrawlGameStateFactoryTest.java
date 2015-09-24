package de.ts.brawler.gamestates;

import org.junit.Assert;
import org.junit.Test;

import de.ts.brawler.gamestates.defined.MainMenuState;
import de.ts.gameengine.gamestates.AbstractGameState;

public class BrawlGameStateFactoryTest {

	@Test
	public void testCreateGameState0() throws Exception {
		
		BrawlGameStateFactory gameStateFactory = new BrawlGameStateFactory();
		AbstractGameState createGameState = gameStateFactory.createGameState(0);
		
		Assert.assertTrue(createGameState instanceof MainMenuState);
	}

}
