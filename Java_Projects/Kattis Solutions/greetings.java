/*
    Greetings!, 'https://open.kattis.com/problems/greetings2'
*/
import java.util.*;

class greetings
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        String word = kbd.nextLine().toLowerCase();
        
        // Cut off "h" & "y" to focus on "e"
        String section = word.substring(1, word.length() - 1);
        String e = ""; // Amount of "e"
        
	    // Double "e" in input
        for (int i = 0; i < section.length() * 2; i++)
        {
            e += "e";
        } //end for loop i
        
        System.out.println("h" + e + "y");
        kbd.close();
    } //end main
} //end class
