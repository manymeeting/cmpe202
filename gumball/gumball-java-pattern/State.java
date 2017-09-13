package gumball.pattern;

public interface State {

	public void insertCoins(int coin);
	public void ejectCoins();
	public void turnCrank();
	public void dispense();
}
