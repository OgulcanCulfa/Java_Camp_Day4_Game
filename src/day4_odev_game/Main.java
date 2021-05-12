package day4_odev_game;

import day4_odev_game.Concrete.GameSellManager;
import day4_odev_game.Entities.Campaign;
import day4_odev_game.Entities.Game;
import day4_odev_game.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		gamer.setFirstname("Ogulcan");
		gamer.setSurname("Culfa");
		
		Game game = new Game();
		game.setGameName("War Thunder");
		game.setDateOfRelease("2014");
		game.setGamePrice(1000);
		
		Campaign campaign = new Campaign();
		campaign.setAmountOfDiscountByHundred(40);
		
		GameSellManager gameSellManager = new GameSellManager();
		gameSellManager.buy(gamer, game);
		gameSellManager.buyWithCampaign(gamer, game, campaign);
	}

}
