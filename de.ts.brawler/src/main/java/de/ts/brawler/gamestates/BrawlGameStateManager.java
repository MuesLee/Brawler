package de.ts.brawler.gamestates;

import de.ts.gameengine.gamestates.GameStateManager;

public class BrawlGameStateManager extends GameStateManager {
	
	public BrawlGameStateManager() {
	setGameStateFactory(new BrawlGameStateFactory());
	
	}

}
