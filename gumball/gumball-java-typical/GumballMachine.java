
public class GumballMachine
{

    private int num_gumballs;
    private int current_coin;
    private int cost;
    private static int _QUATER_ONLY = 0;
    private static int _ALL_COINS = 1;

    private static int _NICKEL = 5;
    private static int _DIME = 10;
    private static int _QUATER = 25;

    private static ArrayList<Integer> _VALID_COIN_TYPES =
      new ArrayList<Integer> (Arrays.asList(_NICKEL, _DIME, _QUATER));

    /**
     * Initialise a Cumball Machine with size, cost and coin type.
     *
     * @param size  the maximum amount of gumball in this machine
     * @param cost  the cost of each gumball.
     * @param coinMode  the type of accpted coins, 0:quater only, 1: all coins.
     */
    public GumballMachine( int size, int cost, int coinMode )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.cost = cost;
        this.coinMode = coinMode;
    }

    public void insertQuarter(int coin)
    {
        if(_VALID_COIN_TYPES.cointains(coin))
        {
          current_coin += coin;
        }
        else
        {
          System.out.println( "Not a valid coin." ) ;
        }
    }

    public void turnCrank()
    {
    	if ( this.current_coin > this.cost)
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.current_coin -= this.cost;
    			System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
    		}
    	}
    	else
    	{
    		System.out.println( "Please insert coins" ) ;
    	}
    }
}
