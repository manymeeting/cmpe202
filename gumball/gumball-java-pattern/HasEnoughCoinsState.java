package gumball.pattern;

public class HasEnoughCoinsState implements State {
	GumballMachine gumballMachine;

	public HasEnoughCoinsState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertCoins(int coin) {
		System.out.println("You can't insert more coins");
	}

	public void ejectCoins() {
		gumballMachine.currentCoins = 0;
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getNoCoinsState());
	}

	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

	public String toString() {
		return "waiting for turn of crank";
	}
}
