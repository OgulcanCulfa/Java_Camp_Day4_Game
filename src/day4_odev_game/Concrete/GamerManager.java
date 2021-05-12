package day4_odev_game.Concrete;


import day4_odev_game.Abstract.IGamer;
import day4_odev_game.Entities.Gamer;

public class GamerManager implements IGamer {

	@Override
	public void create(Gamer gamer) {
		System.out.println("Gamer has been saved: " + gamer.firstname);
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated: " + gamer.firstname);
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted: " + gamer.firstname);	
	}
	
}
