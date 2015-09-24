package de.ts.brawler.gamestates;

import de.ts.brawler.gamestates.defined.MainMenuState;
import de.ts.gameengine.gamestates.GameStateOrder;

public enum BrawlGameStateOrder implements GameStateOrder{

	MAIN_MENU(MainMenuState.class);
	
	private Class<?> gameStateClass;
	
	private BrawlGameStateOrder(Class<?> gameStateClass) {
		this.gameStateClass = gameStateClass;
	}

	@Override
	public Class<?> getGameStateClass() {
		return gameStateClass;
	}
}
