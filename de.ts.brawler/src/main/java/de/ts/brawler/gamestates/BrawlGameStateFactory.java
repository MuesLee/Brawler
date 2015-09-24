package de.ts.brawler.gamestates;

import de.ts.gameengine.gamestates.AbstractGameState;
import de.ts.gameengine.gamestates.GameStateFactory;

public class BrawlGameStateFactory implements GameStateFactory {

	@Override
	public AbstractGameState createGameState(int number) {
		
		BrawlGameStateOrder[] gameStateOrders = BrawlGameStateOrder.values();
		BrawlGameStateOrder gameStateOrder = gameStateOrders[number];
		Class<?> gameStateClass = gameStateOrder.getGameStateClass();
		AbstractGameState newInstance = null;
		try {
			newInstance = (AbstractGameState) gameStateClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return  newInstance;
	}

}
