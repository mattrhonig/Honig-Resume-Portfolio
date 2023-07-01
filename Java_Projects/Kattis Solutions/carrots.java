/*
    Solving for Carrots, 'https://open.kattis.com/problems/carrots'
*/
import java.util.*;

class carrots
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        String input = kbd.nextLine();
        
        int firstSpace = input.indexOf(" ");
        int n = Integer.parseInt(input.substring(0, firstSpace)); // Input questions
        String p = input.substring(firstSpace); // Num of carrots
        
        String self; // Describe yourself - does nothing
        for (int i = 1; i <= n; i++)
        {
            self = kbd.nextLine();
        } //end for loop
        System.out.println(p);
        kbd.close();
    } //end main
} //end class
