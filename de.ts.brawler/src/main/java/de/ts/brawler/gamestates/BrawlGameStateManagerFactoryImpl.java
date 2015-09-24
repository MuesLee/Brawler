package de.ts.brawler.gamestates;

import de.ts.gameengine.gamestates.GameStateManager;
import de.ts.gameengine.gamestates.GameStateManagerFactory;

public class BrawlGameStateManagerFactoryImpl implements GameStateManagerFactory {

	private GameStateManager instance;
	
	@Override
	public GameStateManager createGamestateManager() {
		if(instance == null)
		{
			instance = new BrawlGameStateManager();
		}
		return instance;
	}

}
