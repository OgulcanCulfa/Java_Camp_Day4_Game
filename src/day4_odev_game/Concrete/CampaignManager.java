package day4_odev_game.Concrete;

import day4_odev_game.Abstract.ICampaign;
import day4_odev_game.Entities.Campaign;

public class CampaignManager implements ICampaign {

	@Override
	public void create(Campaign campaign) {
		System.out.println("Campaign has been created");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign has been updated.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign has been deleted.");
	}

}
