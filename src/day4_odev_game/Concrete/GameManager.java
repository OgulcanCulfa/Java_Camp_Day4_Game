package day4_odev_game.Concrete;

import day4_odev_game.Abstract.IGame;
import day4_odev_game.Abstract.IGameSell;
import day4_odev_game.Entities.Game;
import day4_odev_game.Entities.Gamer;

public class GameManager implements IGame {
	public void create(Game game) {
		System.out.println("Game has been saved: " + game.gameName);
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated: " + game.gameName);
	}

	@Override
	public void delete(Game game) {
		System.out.println("game deleted: " + game.gameName);	
	}

}
