package day4_odev_game.Abstract;

import day4_odev_game.Entities.Campaign;
import day4_odev_game.Entities.Game;
import day4_odev_game.Entities.Gamer;

public interface IGameSell {
	public void buy(Gamer gamer,Game game);
	public void buyWithCampaign(Gamer gamer, Game game, Campaign campaign);
}
