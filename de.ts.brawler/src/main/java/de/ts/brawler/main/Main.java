package de.ts.brawler.main;

import de.ts.brawler.controller.BrawlController;
import de.ts.brawler.gamestates.BrawlGameStateManagerFactoryImpl;
import de.ts.gameengine.controller.GameController;
import de.ts.gameengine.gamestates.GameStateManagerFactory;

public class Main {

	public static void main(String[] args) {
		GameController controller = new BrawlController();
		GameStateManagerFactory gameStateManagerFactory = new BrawlGameStateManagerFactoryImpl();
		controller.setGameStateManagerFactory(gameStateManagerFactory);
		controller.init();
		Thread t1 = new Thread(controller);
		t1.start();
	}
	
}
