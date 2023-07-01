/*
    Seven Wonders, 'https://open.kattis.com/problems/sevenwonders'
*/
import java.util.*;

class sevenwonders
{
	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);	
		String deck = kbd.nextLine().toUpperCase();
		int t = 0; //Tablet cards
		int c = 0; //Compass cards
		int g = 0; //Gear cards
		
		for (int i = 0; i < deck.length(); i++)
		{
			if (deck.charAt(i) == 'T')
			    t++;
			else if (deck.charAt(i) == 'C')
			    c++;
			else if (deck.charAt(i) == 'G')
			    g++;
		} //end for loop i
		
		// Cards worth n^2 points
		int points = (t*t) + (c*c) + (g*g);
		
		// 7 points per 1 full deck of 1xT/1xC/1xG cards, remove cards from deck after
		int set = 0;
		while (t >= 1 && c >= 1 && g >= 1)
		{
			set++;
			t--;
			c--;
			g--;
		} //end while loop
		points += set * 7;
		System.out.print(points);

		kbd.close();
	} //end main
} //end class
