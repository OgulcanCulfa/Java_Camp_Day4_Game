package day4_odev_game.Concrete;

import day4_odev_game.Abstract.IGameSell;
import day4_odev_game.Entities.Campaign;
import day4_odev_game.Entities.Game;
import day4_odev_game.Entities.Gamer;

public class GameSellManager implements IGameSell {

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstname() +  " purchased " + game.getGameName() + " for " + game.getGamePrice() + " dollars.");
	}

	@Override
	public void buyWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		float discountedGamePrice = (game.getGamePrice() * campaign.getAmountOfDiscountByHundred() / 100);
		System.out.println(gamer.getFirstname() +  " purchased " + game.getGameName() + " for " + discountedGamePrice + " dollars " + "with " + "%" + campaign.getAmountOfDiscountByHundred() + " discount.");
	}
	

	
}
