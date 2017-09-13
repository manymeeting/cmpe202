package gumball.pattern;

public class Main {

	public static void main(String[] args) {

		// A quarter-only machine with 25 cents cost
		GumballMachine gumballMachineQ25 = new GumballMachine(5, 25, true);

		System.out.println(gumballMachineQ25);

		gumballMachineQ25.insertCoins(25);
		gumballMachineQ25.turnCrank();

		System.out.println(gumballMachineQ25);

		gumballMachineQ25.insertCoins(25);
		gumballMachineQ25.turnCrank();
		gumballMachineQ25.insertCoins(10);
		gumballMachineQ25.turnCrank();

		System.out.println(gumballMachineQ25);

		// An quarter-only machine with 50 cents cost
		GumballMachine gumballMachineQ50 = new GumballMachine(5, 50, true);

		System.out.println(gumballMachineQ50);

		gumballMachineQ50.insertCoins(25);
		gumballMachineQ50.turnCrank();

		System.out.println(gumballMachineQ50);

		gumballMachineQ50.insertCoins(50);
		gumballMachineQ50.insertCoins(25);
		gumballMachineQ50.turnCrank();

		System.out.println(gumballMachineQ50);

		// An all-coins machine with 50 cents cost
		GumballMachine gumballMachineA50 = new GumballMachine(5, 50, false);

		System.out.println(gumballMachineA50);

		gumballMachineA50.insertCoins(10);
		gumballMachineA50.turnCrank();

		System.out.println(gumballMachineA50);

		gumballMachineA50.insertCoins(10);
		gumballMachineA50.turnCrank();
		gumballMachineA50.insertCoins(5);
		gumballMachineA50.turnCrank();
		gumballMachineA50.insertCoins(25);
		gumballMachineA50.turnCrank();

		System.out.println(gumballMachineA50);

	}
}
