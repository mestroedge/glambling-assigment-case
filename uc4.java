package gambler;

public class uc4 {
	public static void main(String ar[])
	{
		int days=0;
		while(days<20)
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
		}
		if(stake>=150)
		{
			System.out.println("Player won for the day and resigns "+stake+"\n");
		}
		days+=1;
		}
	}
}
