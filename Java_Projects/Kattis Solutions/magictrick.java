/*
    Magic Trick, 'https://open.kattis.com/problems/magictrick'
*/
import java.util.*;

class magictrick
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        int count = 0;
        // Num of repeated letters
        String cards = kbd.nextLine();
        
        for(int i = 0; i < cards.length(); i++)
        {
            for (int j = i + 1; j < cards.length(); j++)
            {
                // Check for repeated letters
                if (cards.charAt(i) == cards.charAt(j))
                    count++;
            } //end for loop j
        } //end for loop i
        
        // Return '1' if no letters repeat, return '0' otherwise
        if (count > 0)
            System.out.println("0");
        else
            System.out.println("1");
        
        kbd.close();
    } //end main
} //end class