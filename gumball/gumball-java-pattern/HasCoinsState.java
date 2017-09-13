package gumball.pattern;

public class HasCoinsState implements State{

	GumballMachine gumballMachine;

	public HasCoinsState(GumballMachine gumballMachine) {
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
	}

	public void ejectCoins() {
		gumballMachine.currentCoins = 0;
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getNoCoinsState());
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no enough coins");
	}

	public void dispense() {
		System.out.println("You need to pay enough coins first");
	}

	public String toString() {
		return "waiting for more coins";
	}
}
