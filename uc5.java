package gambler;

public class uc5 {


	public static void main(String ar[])
	{
		int won,lose;
		won=0;
		lose=0;
		int days=0;
		while(days<30)
		{
			System.out.println("day "+(days+1)+"\n");
		int stake =100;
		System.out.println("Player starts with $100 and bets $1 every game");
		while(stake>50 && stake<150)
		{
			if(Math.random()>0.5)
			{
				stake+=1;
			}
			else
			{
				stake-=1;
			}
		}
		if(stake<=50)
		{
			System.out.println("Player lost for the day and resigns "+stake+"\n");
			lose+=1;
		}
		if(stake>=150)
		{
			System.out.println("Player won for the day and resigns "+stake+"\n");
			won+=1;
		}
		days+=1;
	
		}
		System.out.println("number of days won: "+won+" number of days lost: "+ lose);
		System.out.println("Net worth of player is :" +(30*100+(won*50)-(lose*50)));
	}
}
