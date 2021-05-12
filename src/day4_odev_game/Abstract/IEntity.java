package day4_odev_game.Abstract;


public interface IEntity<T> {
	public void create(T t);
	public void update(T t);
	public void delete(T t);
}

