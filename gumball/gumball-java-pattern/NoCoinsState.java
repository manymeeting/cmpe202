package gumball.pattern;

public class NoCoinsState implements State {
    GumballMachine gumballMachine;

    public NoCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertCoins(int coin) {
    if (gumballMachine.quarterOnly && coin != GumballMachine.QUARTER)
    {
      System.out.println("You can only insert a quarter");
      return;
    }

		System.out.printf("You inserted a %d cent coin\n", coin);
    gumballMachine.currentCoins = gumballMachine.currentCoins + coin;

    if (gumballMachine.currentCoins >= gumballMachine.cost)
    {
      gumballMachine.setState(gumballMachine.getHasEnoughCoinsState());
    }
    else
    {
      gumballMachine.setState(gumballMachine.getHasCoinsState());
    }

	}

	public void ejectCoins() {
		System.out.println("You haven't inserted any coins");
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no coins");
	 }

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for coins";
	}
}
