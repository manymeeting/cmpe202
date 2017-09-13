package gumball.pattern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertCoins(int coin) {
		System.out.println("You can't insert any coins, the machine is sold out");
	}

	public void ejectCoins() {
		System.out.println("You can't eject, you haven't inserted any coins yet");
	}

	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "sold out";
	}
}
