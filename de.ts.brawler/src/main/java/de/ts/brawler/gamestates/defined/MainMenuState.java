package de.ts.brawler.gamestates.defined;

import java.util.ArrayList;

import de.ts.gameengine.gamestates.menu.DefaultMenuState;
import de.ts.gameengine.gamestates.menu.MenuItem;

public class MainMenuState extends DefaultMenuState{
	
	public MainMenuState() {
	super();
	ArrayList<MenuItem> menuItems = fillMenuItems();
	setMenuItems(menuItems);

	}

	private ArrayList<MenuItem> fillMenuItems() {
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		menuItems.add(new MenuItem("Start"));
		menuItems.add(new MenuItem("Options"));
		menuItems.add(new MenuItem("Exit"));
		return menuItems;
	}

}
